public class Street {
    private Intersection start;
    private Intersection end;
    private String name;
    private int weight;
    private Boolean open = true;

    public Street(){
        setStart(null);
        setEnd(null);
        setWeight(0);
        setName("");
    }

    public Street(Intersection start, Intersection end) {
        setStart(start);
        setEnd(end);
        setWeight(0);
        setName("");
    }

    public Street(Intersection start, Intersection end, String name) {
        setStart(start);
        setEnd(end);
        setWeight(0);
        setName(name);
    }

    public Street(Intersection start, Intersection end, int weight) {
        setStart(start);
        setEnd(end);
        setWeight(weight);
        setName("");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Intersection getStart(){
        return this.start;
    }

    public void setStart(Intersection start) {
        this.start = start;
    }

    public Intersection getEnd() {
        return end;
    }

    public void setEnd(Intersection end) {
        this.end = end;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
