/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamco;

/**
 *
 * @author Raihan
 * @param <E>
 */
public class NodeLinked<E> {
    
    public E element;
    public NodeLinked<E> next;
    
    public NodeLinked (){
        element=null;
        next=null;
    }
    
    public NodeLinked (E element ){
        this.element=element;
        next=null;
    }
    
    
    
}
