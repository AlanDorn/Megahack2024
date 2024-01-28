import java.util.ArrayList;

public class Intersection {

    private int x;
    private int y;

    ArrayList<Street> connectingStreets;

    public Intersection() {
        setX(0);
        setY(0);
    }

    public Intersection(int x, int y){
        setX(x);
        setY(y);
    }

    public Intersection(int x, int y, ArrayList<Street> connectingStreets){
        setX(x);
        setY(y);
        setConnectingStreets(connectingStreets);
    }

    public Intersection(ArrayList<Street> connectingStreets) {
        setX(0);
        setY(0);
        setConnectingStreets(connectingStreets);
    }

    public void addConnection(Street street) {
        getConnectingStreets().add(street);
    }

    public void removeConnection(Street street) {
        getConnectingStreets().remove(street);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ArrayList<Street> getConnectingStreets() {
        return connectingStreets;
    }

    public void setConnectingStreets(ArrayList<Street> connectingStreets) {
        this.connectingStreets = connectingStreets;
    }

}
