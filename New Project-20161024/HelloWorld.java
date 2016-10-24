import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Map<Node, List<Node>> graph = new HashMap<Node, List<Node> > ();
        Map<Integer, Node> nodeList = new HashMap<>();
        for(int i = 0; i < 5; i++) {
            Node n = new Node(i);
            nodeList.put(i, n);
            graph.put(n, new ArrayList<Node> ());    
        }
        
        for(Node n : graph.keySet()) {
            if(n.getId() == 0) {
                graph.get(n).add(nodeList.get(1));
                graph.get(n).add(nodeList.get(3));
            } else if(n.getId() == 1) {
                graph.get(n).add(nodeList.get(2));
                graph.get(n).add(nodeList.get(3));
            }
            
            else if(n.getId() == 2) {
                graph.get(n).add(nodeList.get(4));
                graph.get(n).add(nodeList.get(1));
            }
            else if(n.getId() == 3) {
                graph.get(n).add(nodeList.get(2));
                
            } else if(n.getId() == 4) {
                
                graph.get(n).add(nodeList.get(1));
            }
            
        }
        Graph g = new Graph(graph);
        g.bfs(nodeList.get(0));
        
        for(Node n : graph.keySet()) {
            int parentId = -100;
            if(n.getParent() != null) {
                parentId = n.getParent().getId();
            }
            System.out.println(n.getId() + " --->" + parentId);
        }
        
     }
}
