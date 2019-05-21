
package dreamco;

import java.io.IOException;
import java.util.Iterator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;


public class DreamCo {
    

    
 /////////////////////////////////////////////////////////////////////////////////////    This Class Serves as a tester class for now!   ////////////////////////////////////////
public static void main(String[] args) throws IOException {
    
    
    /////////////////////////////////////////// SET LOOK AND FEEL ////////////////////////////////////////////////////////////////////////////////
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    MyTree.startupAdminConfigFiles();
    SplashScreen.runSplashScreen();        

//DataEncryptionFile.metadataDecryption();
//DataEncryptionFile.metadataEncryption();


  // AdminRegistrationFrame.runAdminRegistrationFrame();


   //  AdminFrame.runAdminFrame();
//    UserFrame.runUserFrame();
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
