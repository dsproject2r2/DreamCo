/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamco;

import java.util.ArrayList;

/**
 *
 * @author Raihan
 */
public class Node {

    double money=0;
    String name;
    java.util.ArrayList<Node> next = new java.util.ArrayList<>();
    //java.util.ArrayList<Node> prev = new java.util.ArrayList<>();
    Node prev;
    int ID;
    
    public Node(String name, Node next, Node prev){
        this.name=name;
        this.next.add(next);
        this.prev = prev;
    }
    
    public Node(String name, Node next, Node prev, double Money, int ID){
        this.name=name;
        this.next.add(next);
        this.prev = prev;
        this.money=Money;
        this.ID=ID;
    }
    
    public Node(){
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
