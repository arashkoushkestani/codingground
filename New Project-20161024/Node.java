public class Node{
    
    public enum State{
        VISITED, VISITING, NOT_VISITED;
    }
    
    private State state = State.NOT_VISITED;
    private Integer id;
    private Node parent = null;
    private int distance = 0;
    
    public void initNode() {
        parent = null;
        state = State.NOT_VISITED;
        distance = 0;
    }
    
    public Node(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Node getParent() {
        return parent;
    }
    
    public void setParent(Node parent) {
        this.parent = parent;
    }
    
    public State getState() {
        return state;
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public int getDistance() {
        return distance;
    }
    
    public void setDistance(int d) {
        distance = d;
    }
}