/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamco;

/**
 *
 * @author Raihan
 */
public class AssigmentMLM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MyTree dll =  new MyTree();
        
        dll.add("a", "Tasnim");
        dll.add("c", "a"); 
        dll.add("b", "a");
        dll.add("s", "b");
        dll.add("d", "c");
        dll.add("z", "i");
        dll.add("h", "d");
        dll.add("n", "h");
        dll.add("z", "d");
      // dll.add("nasdasd", "mohd");
        
     
       System.out.println("");
       
     //  System.out.println(dll.displayAncestor("aina"));
    //   dll.remove("d");
        System.out.println("");
       dll.displayAncestor("d");
        System.out.println("");
       dll.displayAncestor("n");
        System.out.println("");
      dll.displayAncestor("z");
       System.out.println("");
       dll.dfstack();
        System.out.println("");
       dll.dfstackUser("d");
       
      
      dll.bfsQueue();
      
      dll.remove("n");
        System.out.println("");
      dll.dfstack();
      
    }
    
}
