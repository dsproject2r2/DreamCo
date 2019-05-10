/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamco;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author MX-15
 */
public class Load {
    
    public Load(){
    }
    
    public void load(DoublyLinkedList list){
    try {
            Scanner read = new Scanner(new FileInputStream("text.txt"));
            StringBuilder sb = new StringBuilder();
            //String line = read.nextLine();
            //DoublyLinkedList dll = new DoublyLinkedList();

            while (read.hasNextLine()) {
                String name = read.nextLine();
                String parent = read.nextLine();
                String money = read.nextLine();
                String id = read.nextLine();
                
                int Money = Integer.parseInt(money);
                int ID =Integer.parseInt(id);

                System.out.println(name);
                System.out.println(parent);
                System.out.println(Money);
                System.out.println(ID);
                System.out.println("");
                //  DoublyLinkedList dll =  new DoublyLinkedList();
                //
                list.addLoad(name, parent, Money, ID);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FIle not found.");
        }
    }
    
    public void save(DoublyLinkedList list){
        try(FileWriter p = new FileWriter("t.txt");
                BufferedWriter bw = new BufferedWriter(p)){
            
            for(int i=0; i<list.Nodee.size(); i++){  
                
                bw.write(list.Nodee.get(i).money);
//                String pa = list.Nodee.get(i).prev.name;
//                p.println(pa);
               // p.print(list.Nodee.get(i).name);
//                p.print(list.Nodee.get(i).prev.name);
//                p.print(list.Nodee.get(i).ID);
//                p.print(list.Nodee.get(i).money);
            
            }
            p.close();
        }catch(Exception e){
            
        }
    }
}
