
package dreamco;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;
//BY JERRY <3
public class ViewGraphFrame {
    
    public static void runViewGraphFrame(){
        Graph g= new SingleGraph("tutorial 1");
        g.addNode("a");
        g.addNode("b");
        g.addEdge("ab", "a", "b");
        g.addNode("c");
                g.addEdge("ac", "a", "c");
        g.addNode("e");
                g.addEdge("eb", "e", "b");
        g.addNode("f");
                g.addEdge("af", "a", "f");
        g.addNode("ghahaha");
                g.addEdge("bghahaha", "b", "ghahaha");
                g.addNode("h");
                g.addEdge("ah", "a", "h");
                g.addEdge("bf", "b", "f");
                g.addNode("x");
                g.addEdge("ax", "a", "x");
                g.addNode("y");
                g.addEdge("ay", "a", "y");
        g.display();
        
    }
    
    
    
    
}
