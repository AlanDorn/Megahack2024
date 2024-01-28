import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

class GraphPanel extends JPanel {
    private Graph graph;
    private List<JCheckBox> edgeCheckboxes = new ArrayList<>();
    private int offsetX;
    private int offsetY;

    public void setGraph(Graph graph) {
        this.graph = graph;
        updateCheckboxes();
        calculateOffset();
    }

    private void updateCheckboxes() {
        removeAll();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        edgeCheckboxes.clear();

        if (graph != null) {
            List<Street> streets = graph.getStreets();
            int num = 0;
            for (Street street : streets) {
                JCheckBox checkBox = new JCheckBox("Edge " + ++num, true);
                checkBox.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JCheckBox source = (JCheckBox) e.getSource();
                        street.setOpen(source.isSelected());
                        repaint();
                    }
                });
                edgeCheckboxes.add(checkBox);
                add(checkBox);
            }
        }
    }

    private void calculateOffset() {

        List<Intersection> intersections = graph.getIntersections();

        // Find the minimum and maximum coordinates of the graph
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        for (Intersection intersection : intersections) {
            int posX = intersection.getX();
            int posY = intersection.getY();
            minX = Math.min(minX, posX);
            minY = Math.min(minY, posY);
            maxX = Math.max(maxX, posX);
            maxY = Math.max(maxY, posY);
        }

        // Calculate the center of the graph
        int centerX = (minX + maxX) / 2;
        int centerY = (minY + maxY) / 2;

        // Calculate the offset to center the graph within the panel
        offsetX = (getWidth() - (maxX + minX)) / 2 - centerX;
        offsetY = (getHeight() - (maxY - minY)) / 2 - centerY;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        List<Street> streets = graph.getStreets();
        for (Street street : streets) {
            g.setColor(Color.BLACK);
            int startX = street.getStart().getX() + offsetX;
            int startY = street.getStart().getY() + offsetY;
            int endX = street.getEnd().getX() + offsetX;
            int endY = street.getEnd().getY() + offsetY;
            if (!street.getOpen()) {g.setColor(Color.RED);}
            g.drawLine(startX, startY, endX, endY);
        }

        List<Intersection> intersections = graph.getIntersections();
        for (Intersection intersection : intersections) {
            g.setColor(Color.BLACK);
            int posX = intersection.getX() + offsetX;
            int posY = intersection.getY() + offsetY;
            g.fillOval(posX - 5, posY - 5, 10, 10);
        }
    }

    @Override
    public void invalidate() {
        super.invalidate();
        calculateOffset(); // Recalculate offset when the panel is resized
        repaint();
    }
}