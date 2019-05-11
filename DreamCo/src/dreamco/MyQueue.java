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
public class MyQueue<E> {
    
    MyLinkedList<E> list = new MyLinkedList<>();
    
    public MyQueue(E[]e){
        for (int i = 0; i < e.length; i++) {
            list.addLast(e[i]);
        }
    }
    
    public MyQueue(){
    }
    
    public void enqueue(E e){
        list.addLast(e);
    }
    
    public E dequeue(){
        return list.removeFirst();
    }
    
    public E getElement(int i){
        return list.get(i);
    }
    
    public E peek(){
        return list.getFirst();
    }
    
    public int getSize(){
        return list.getSize();
    }
    
    public boolean contains(E e){
        return list.contains(e);
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public String toString(){
        return list.toString();
    }
}
