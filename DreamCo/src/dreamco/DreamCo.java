
package dreamco;

import java.io.IOException;
import java.util.Iterator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

//by JERRY <#

public class DreamCo {
    
;
    
 /////////////////////////////////////////////////////////////////////////////////////    This Class Serves as a tester class for now!   ////////////////////////////////////////
public static void main(String[] args) throws IOException {
    ///////////////////////////////////////////These are the OBJECTS to use OTHER classes in the package...............
//
    LoginFrame.runLoginFrame(); 
    //MyTree.startupAdminConfigFile();
   // System.out.println(MyTree.getIDCounter() );
// AdminRegistrationFrame.runAdminRegistrationFrame();
//    AdminFrame.runAdminFrame();
//    MyTree.readFee();
//    System.out.println(MyTree.getFee());
//new DreamCo();

/////////////////////////////////////////////////////////////
//    MyTree t = new MyTree();
////    t.add("Raihan", "def", "DreamCo");
////    t.add("Jerry", "ghi", "1");
////    t.add("Ame", "jkl", "1");
////    t.add("Najmi", "mno", "1");
////    t.add("Ali", "pqr", "0");
////    t.add("Abu", "stu", "5");
////    t.add("Tasnim", "vwx", "3");
////    t.add("Acap","yz", "3");
//    t.addUser();
//    t.displayAllNodes();
//    System.out.println("");
//    System.out.println("");
//    t.displayGraph();
    //////////////////////////////////////////////////////////////////
    
    
   // t.appendUser();
    
//     UserFrame.runUserFrame();
//    SplashScreen.runSplashScreen();
    
//    Scanner s=new Scanner(System.in);
//    System.out.println("enter name");
//    String name=s.nextLine();
//    String password=s.nextLine();
//    String parents =s.nextLine();
//    tree.add(name, password,parents);
    }

//
//    public DreamCo() {
//            Graph graph = new SingleGraph("tutorial 1");
//
//            graph.addAttribute("ui.stylesheet", styleSheet);
//            graph.setAutoCreate(true);
//            graph.setStrict(false);
//            graph.display();
//
//            graph.addEdge("AB", "A", "B");
//            graph.addEdge("BC", "B", "C");
//            graph.addEdge("CA", "C", "A");
//            graph.addEdge("AD", "A", "D");
//            graph.addEdge("DE", "D", "E");
//            graph.addEdge("DF", "D", "F");
//            graph.addEdge("EF", "E", "F");
//
//            for (Node node : graph) {
//                node.addAttribute("ui.label", node.getId());
//            }
//
//           // explore(graph.getNode("A"));
//        }
//
//        public void explore(Node source) {
//            Iterator<? extends Node> k = source.getBreadthFirstIterator();
//
//            while (k.hasNext()) {
//                Node next = k.next();
//                next.setAttribute("ui.class", "marked");
//                sleep();
//            }
//        }
//
//        protected void sleep() {
//            try { Thread.sleep(1000); } catch (Exception e) {}
//        }
//
//        protected String styleSheet =
//            "node {" +
//            "	fill-color: black;" +
//            "}" +
//            "node.marked {" +
//            "	fill-color: red;" +
//            "}";
//
//
//

}

//    MyTree t = new MyTree();
//    t.add("Raihan", "def", "DreamCo");
//    t.add("Jerry", "ghi", "1");
//    t.add("Ame", "jkl", "1");
//    t.add("Najmi", "mno", "1");
//    t.add("Ali", "pqr", "0");
//    t.add("Abu", "stu", "5");
//    t.add("Tasnim", "vwx", "3");
//    t.add("Acap","yz", "3");
//    t.displayAllNodes();