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
public class MyLinkedList <E>{
    
    private NodeLinked head, tail;
    private int size=0;
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }
    
    public MyLinkedList(){
        head=null;
        tail=null;
        size=0;
    }
    
    public void addFirst(E e){
        NodeLinked<E> firstNode = new NodeLinked<>(e);
        firstNode.next =  head;
        head = firstNode;
        size++;
        
        if(tail == null)
            tail=head;
    }
    
    public void addLast(E e){
        if(tail == null){
            head = tail = new NodeLinked <>(e);
        }
        else{
            tail.next=new NodeLinked (e);
            tail =  tail.next;
        }
        size++;
    }
    
    public void addindex(int index, E e){
        if(index == 0) 
            addFirst(e);
        else if(index >= size) 
            addLast(e);
        else{
            NodeLinked <E> current =  head;
            for (int i = 0; i < index; i++) {
                current.next=new NodeLinked<>(e);
            }
            NodeLinked<E> temp = current.next;
            current.next = new NodeLinked<>(e);
            (current.next).next=temp;
            size++;
        }
    }
    
    public E removeFirst(){
        if(size == 0)
            return null;
        else{
            NodeLinked<E> temp =  head;
            head =  head.next;
            size--;
            if(head == null)
                tail =null;
            return temp.element;
        }
    }
    
    public E removeLast(){
        switch (size) {
            case 0:
                return null;
            case 1:
            {
                NodeLinked<E> temp = head;
                head = tail = null;
                size =0;
                return temp.element;
            }
            default:
            {
                NodeLinked <E> current = head;
                for (int i = 0; i < size-2; i++)
                    current = current.next;
                NodeLinked<E> temp = tail;
                tail = current;
                tail.next=null;
                size--;
                return temp.element;
            }
        }
    }
    
    public E remove(int index){
        if (index<0)
            return removeFirst();
        else if(index ==0)
            return removeLast();
        else if(index == size-1)
            return removeLast();
        else{
            NodeLinked <E> previous = head;
            for (int i = 0; i < index; i++) {
                previous = previous.next;
            }
            NodeLinked <E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    
    @Override
    public String toString(){
        NodeLinked <E> current = head;
        StringBuilder sb  = new StringBuilder();
        sb.append("[");
        while(current != null){
            sb.append(current.element);
            if(current.next!=null)
                sb.append(", ");
            current =  current.next;
        }
        sb.append("]");
        return sb.toString();
    }
    
    public void add(E e){
        addFirst(e);
    }
    
    public boolean contains(E e){
        NodeLinked <E> current = head;
        while (current!=null ) {
            if(current.element == e)
                return true;
            current = current.next;
        }
        return false;
    }
    
    public E getFirst(){
        NodeLinked <E> current = head;
        return current.element;
    }
    
    public E getLast(){
        NodeLinked <E> current = head;
        for (int i=0;i< size-1;i++) {
            current = current.next;
        }
        return current.element;
        
    }
    
    public E get(int index){
        if(index==0)
            return getFirst();
        else if(index == size-1){
            return getLast();
        }
        else{
            NodeLinked <E> current = head;
            for (int i=0;i< index;i++) {
                current = current.next;
            }
            return current.element;
        }
    }
    
//    public void getHead(){
//        System.out.println( head.element);
//    }
    
    public int indexOf(E e){
        NodeLinked <E> current = head;
        
        int index=0;
        while (current.next!=null) {
            if(e==current.element)
                return index;
            current=current.next;
            index++;
        }
        return -1;
    }
    
    public int lastIndexOf(E e){
        NodeLinked <E> current = head;
        
        int index=0, temp=0;
        boolean check=false;
        while (current.next!=null) {
            if(e==current.element){
                temp = index;
                check=true;
            }
            current=current.next;
            index++;
        }
        
        if(!check)
            return -1;
        else
            return temp;
    }
    
    public void set(int index, E e){
        if(index>=size)
            System.out.println("Index out of size");
        else{
            NodeLinked <E> current =  head;
            for(int i =0; i < index; i++){
                current=current.next;
            }
            current.element=e;
        }
    } 
    
    public void clear(){
        head=null;
    }
    
    public void print(){
        NodeLinked <E> current = head;
        StringBuilder sb  = new StringBuilder();
        sb.append("[");
        while(current != null){
            sb.append(current.element);
            if(current.next!=null)
                sb.append(", ");
            current =  current.next;
        }
        sb.append("]");
        System.out.println( sb.toString());
    }
    
    public void reverse(){
        NodeLinked <E> current = head;
        MyLinkedList<E> list2 = new MyLinkedList();
        while(current != null){
            list2.addFirst(current.element);
            current=current.next;
        }
        
        list2.print();
    }
    
    public E getMiddleValue(){
        if(size==0)
            return null;
        else
            return get(size/2);
    }
    
    

}
        
        
        
    

