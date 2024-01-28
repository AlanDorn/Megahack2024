import javax.swing.*;

public class GraphApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Graph Display");
        GraphPanel graphPanel = new GraphPanel();

        Graph graph = new Graph();

        Intersection intersection0 = new Intersection(0, 0);
        Intersection intersection1 = new Intersection(100, 0);
        Intersection intersection2 = new Intersection(200, 0);
        Intersection intersection3 = new Intersection(0, -50);
        Intersection intersection4 = new Intersection(0, -100);
        Intersection intersection5 = new Intersection(15, -120);
        Intersection intersection6 = new Intersection(70, -180);
        Intersection intersection7 = new Intersection(200, -120);
        Intersection intersection8 = new Intersection(-100, 0);
        Intersection intersection9 = new Intersection(-100, -50);
        Intersection intersection10 = new Intersection(-100, -100);
        Intersection intersection11 = new Intersection(-100, -150);
        graph.addIntersection(intersection0);
        graph.addIntersection(intersection1);
        graph.addIntersection(intersection2);
        graph.addIntersection(intersection3);
        graph.addIntersection(intersection4);
        graph.addIntersection(intersection5);
        graph.addIntersection(intersection6);
        graph.addIntersection(intersection7);
        graph.addIntersection(intersection8);
        graph.addIntersection(intersection9);
        graph.addIntersection(intersection10);
        graph.addIntersection(intersection11);

        Street street0 = new Street(intersection0, intersection1, "700 Main Block");
        Street street1 = new Street(intersection1, intersection2, "Main");
        Street street2 = new Street(intersection2, intersection7, "Belvedere");
        Street street3 = new Street(intersection0, intersection3, "");
        Street street4 = new Street(intersection3, intersection4, "");
        Street street5 = new Street(intersection0, intersection8);
        Street street6 = new Street(intersection8, intersection10);
        Street street7 = new Street(intersection5, intersection6);
        Street street8 = new Street(intersection10, intersection11);
        Street street9 = new Street(intersection4, intersection5);
        Street street10 = new Street(intersection5, intersection11);
        Street street11 = new Street(intersection4, intersection10);
        Street street12 = new Street(intersection3, intersection9);
        Street street13 = new Street(intersection7, intersection6);
        graph.addStreet(street0);
        graph.addStreet(street1);
        graph.addStreet(street2);
        graph.addStreet(street3);
        graph.addStreet(street4);
        graph.addStreet(street5);
        graph.addStreet(street6);
        graph.addStreet(street7);
        graph.addStreet(street8);
        graph.addStreet(street9);
        graph.addStreet(street10);
        graph.addStreet(street11);
        graph.addStreet(street12);
        graph.addStreet(street13);

        graphPanel.setGraph(graph);


        frame.add(graphPanel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}