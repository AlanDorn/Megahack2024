import java.util.ArrayList;

public class Graph {
    private ArrayList<Street> streets;
    private ArrayList<Intersection> intersections;

    public Graph() {
        setStreets(new ArrayList<>());
        setIntersections(new ArrayList<>());
    }

    public void addStreet(Street street) {
        getStreets().add(street);
    }

    public void removeStreet(Street street) {
        getStreets().remove(street);
    }

    public void addIntersection(Intersection intersection) {
        getIntersections().add(intersection);
    }

    public void removeIntersection(Intersection intersection) {
        getIntersections().add(intersection);
    }

    public Graph(ArrayList<Street> streets, ArrayList<Intersection> intersections) {
        setStreets(streets);
        setIntersections(intersections);
    }

    public ArrayList<Street> getStreets() {
        return streets;
    }

    public void setStreets(ArrayList<Street> streets) {
        this.streets = streets;
    }

    public ArrayList<Intersection> getIntersections() {
        return intersections;
    }

    public void setIntersections(ArrayList<Intersection> intersections) {
        this.intersections = intersections;
    }
}
