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

    int money=0;
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
    
    public Node(String name, Node next, Node prev, int Money, int ID){
        this.name=name;
        this.next.add(next);
        this.prev = prev;
        this.money=money;
        this.ID=ID;
    }
    
    
    public Node(){
        this.name=null;
        //this.next.add(next);
        this.prev = null;
        this.money=50;
    }
    
    public void addMoney(int money){
        this.money = this.money+ money;
    }
    
    public void setRegisterationFee(int money){
        this.money=money;
    }
   
    
}
