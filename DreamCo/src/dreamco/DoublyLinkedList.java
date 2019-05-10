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
    double fee=50;
            
    public DoublyLinkedList(){
        total=0;
        root=null;
    }
    
    public void setFee(double fee){
        this.fee=fee;
    }
    
    public void addLoad(String name, String parents, double Money, int ID){
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
                    total++;
//                    Node current = temp;
                    break;
                }
            }
            if(notfound)
                System.out.println("Parents not found");
        }
    }
    
    public void add(String name, String parents){
        Node temp = new Node(name, null, null);
        temp.addMoney(fee);
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
                    total++;
                    while(current.prev!=null){
                    current = current.prev;
                    
                        switch (level) {
                            case 0:
                                current.addMoney(fee*0.5);
                                level++;
                                break;
                            case 1:
                                current.addMoney(fee*0.12);
                                level++;
                                break;
                            case 2:
                                current.addMoney(fee*0.09);
                                level++;
                                break;
                            case 3:
                                current.addMoney(fee*0.06);
                                level++;
                                break;
                            default:
                                current.addMoney(fee*0.03);
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
    
    public double getMoney(String name){
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
    
    public void remove(int ID){
        Node current =  new Node();
        for (int i = 0; i < Nodee.size(); i++) {
                if(Nodee.get(i).ID==(ID)){
                    current = Nodee.get(i);
                    break;
                }
        }
        if(current.equals(root)){
            root = new Node();
        }
        else{
            current.prev.next=null;
            current.prev=null;
        }
        
    }
    
    
//    public String displaytree(){
//        StringBuilder sb = new StringBuilder();
//        
//        sb.append(root);
//        
//    }
    
}
