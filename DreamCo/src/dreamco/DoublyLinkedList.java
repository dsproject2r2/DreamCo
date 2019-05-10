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
public class DoublyLinkedList {
    
    public java.util.ArrayList<Node> Nodee =  new java.util.ArrayList<>();
    public int total;
    public Node root;
            
    public DoublyLinkedList(){
        total=0;
        root=null;
    }
    
    public void addLoad(String name, String parents, int Money, int ID){
        Node temp = new Node(name, null, null, Money, ID);
        if(root==null){
            Nodee.add(temp);
            root=temp;
            total++;
            System.out.println("Root: " + name);
        }
        else{
            boolean notfound = true;
            for (int i = 0; i < Nodee.size(); i++) {
                if(Nodee.get(i).name.equalsIgnoreCase(parents)){
                    
                    Nodee.add(temp);
                    Nodee.get(i).next.add(temp);
                    temp.prev=Nodee.get(i);
                    System.out.println("Adding: " + name + " to " + parents );
                    notfound = false;
                    
                    Node current = temp;
                    while(current.prev!=null){
                    current = current.prev;
                    total++;
                    }
                    break;
                }
            }
            if(notfound)
                System.out.println("Parents not found");
        }
    }
    
    public void add(String name, String parents){
        Node temp = new Node(name, null, null);
        //Nodee.add(temp);
        
        if(root==null){
            Nodee.add(temp);
            root=temp;
            total++;
            System.out.println("Root: " + name);
        }
        else{
            boolean notfound = true;
            for (int i = 0; i < Nodee.size(); i++) {
                if(Nodee.get(i).name.equalsIgnoreCase(parents)){
                    
                    Nodee.add(temp);
                    Nodee.get(i).next.add(temp);
                    temp.prev=Nodee.get(i);
                    System.out.println("Adding: " + name + " to " + parents );
                    notfound = false;
                    
                    Node current = temp;
                    int level = 0;
                    while(current.prev!=null){
                    current = current.prev;
                    total++;
                        switch (level) {
                            case 0:
                                current.addMoney(25);
                                level++;
                                break;
                            case 1:
                                current.addMoney(10);
                                level++;
                                break;
                            case 2:
                                current.addMoney(6);
                                level++;
                                break;
                            default:
                                current.addMoney(1);
                                level++;
                                break;
                        }
                    }
                    break;
                }
            }
            if(notfound)
                System.out.println("Parents not found");
        }
    }
    
    public int getMoney(String name){
        for (int i = 0; i < Nodee.size(); i++) {
            if(Nodee.get(i).name.equalsIgnoreCase(name)){
                return  Nodee.get(i).money;
            }
        }
        return 0;
    }
    
    public boolean contain (String name){
        Node current =  root;
        for (int i = 0; i < Nodee.size(); i++) {
                if(Nodee.get(i).name.equalsIgnoreCase(name)){
                    return true;
                }
        }
        return false;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < Nodee.size(); i++) {
                sb.append(Nodee.get(i).name + " ");
            }
        sb.append("]");
        return sb.toString();
    }
    
    public String displayParents(String name){
        
        Node current = new Node();
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        
        boolean notfound = true;
        for (int i = 0; i < Nodee.size(); i++) {
            if(Nodee.get(i).name.equalsIgnoreCase(name)){
                    current = Nodee.get(i);
                    notfound = false;
                    break;
                }
        }
        if(notfound)
                System.out.println("Parents not found");
        else if(current.prev==null){
            System.out.println(current.name);
        }else{
            sb.append( " "+ current.name + "-"  + current.money + " " );
            while(current.prev!=null){
                current = current.prev;
                sb.append( " "+ current.name + "-"  + current.money + " " );
            }
        }
        
        sb.append(" ]");
        return sb.toString();
        
    }
    
    
//    public String displaytree(){
//        StringBuilder sb = new StringBuilder();
//        
//        sb.append(root);
//        
//    }
    
}
