
package dreamco;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Gui extends JFrame{

public static void dialogBox(){    
    String fn= JOptionPane.showInputDialog("Enter Name");
    String sn= JOptionPane.showInputDialog("Enter Password");    
//    int num1= Integer.parseInt(fn);
//    int num2= Integer.parseInt(sn);
//    int sum=num1+num2;
    JOptionPane.showMessageDialog(null, "The answer is " , "The title", JOptionPane.PLAIN_MESSAGE); //shows tat a message box
    }


private JLabel item1;
private JTextField fld1;
private JTextField fld2;
private JTextField fld3;
private JPasswordField pass;

///////////////////////////////// /////////////////////////////////////////////////////////////This is just a constructor for the STARTUP Gui Frame/////////////////////////////////
public Gui(){
    super("2R2 DreamCo Scam"); //The 
    setLayout(new FlowLayout());
    
    item1=new JLabel("This is a sentence");
    item1.setToolTipText("This is going to show up on hover");
    add(item1);
    
    fld1= new JTextField(10);
    add(fld1);
    
    fld2=new JTextField(10);
    add(fld2);
    
    fld3=new JTextField(10);
    fld3.setEditable(false);
    add(fld3);
    
    pass=new JPasswordField(10);
    add(pass);
    
    ActHandler handler= new ActHandler();
    fld1.addActionListener(handler);
    fld2.addActionListener(handler);
    fld3.addActionListener(handler);
    pass.addActionListener(handler);
}

private class ActHandler implements ActionListener{  
    @Override
    public void actionPerformed(ActionEvent event){
        String string= "";

        if(event.getSource()==fld1)
            string=String.format("field 1: %s", event.getActionCommand());
        if(event.getSource()==fld2)
            string=String.format("field 1: %s", event.getActionCommand());
        if(event.getSource()==fld3)
            string=String.format("field 1: %s", event.getActionCommand());  
        if(event.getSource()==pass)
            string=String.format("password is: %s", event.getActionCommand());        
    }  
}
/////////////////////////////////////////////////////////////////////////////////////////////// THIS IS WHERE STARTUP Gui Frame ENDS //////////////////////////////////////////////////////////


}