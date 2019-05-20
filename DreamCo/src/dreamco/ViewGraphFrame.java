
package dreamco;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;
//BY JERRY <3
public class ViewGraphFrame {
    
    public static void runViewGraphFrame(){
        Graph graph= new SingleGraph("tutorial 1");
        graph.addNode("");
        graph.addNode("b");
        graph.addEdge("ab", "a", "b");
        graph.display();
    }
    
    
    
    
}
