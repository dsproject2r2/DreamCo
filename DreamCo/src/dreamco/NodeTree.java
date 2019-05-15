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
public class NodeTree {

    double money=0;
    String name;
    java.util.ArrayList<NodeTree> child = new java.util.ArrayList<>();
    NodeTree prev;
    int ID;
    String password;
    public NodeTree(String name){
        this.name=name;
      //  this.prev=null;
    }
    public NodeTree(String name, NodeTree next, NodeTree prev){
        this.name=name;
        this.child.add(next);
        this.prev = prev;
    }
    
    public NodeTree(String name, NodeTree next, NodeTree prev, double Money, String password){
        this.name=name;
        this.child.add(next);
        this.prev = prev;
        this.money=Money;
        this.password=password;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public NodeTree(){
        this.name=null;
        this.prev = null;
    }
    
    public void addMoney(double money){
        this.money +=  money;
    }
    
    public void setMoney(double money){
        this.money=money;
    }
   
    
}
