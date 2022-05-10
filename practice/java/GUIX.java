import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GUIX implements ActionListener
{
   JButton B1,B2;     //declare component
   JLabel L1;
   JFrame F1;
   JTextField TF1;
   
   GUIX()           //creating components
   {
      B1=new JButton("OK");
      B2=new JButton("Cancel");
      L1=new JLabel(" Your Name");
      TF1=new JTextField(10);

      F1=new JFrame("Our GUI");   // seting the property of container i.e. Frame
      F1.setSize(200,200);
      F1.show();
      F1.setLayout(new FlowLayout());  
      //F1.setLayout(new GridLayout(1,4)); 
                                                    //Adding the component into container  
      
      F1.add(B1);
      F1.add(L1);
      F1.add(TF1);                  
      F1.add(B2);

     B1.addActionListener(this);
     B2.addActionListener(this);
     
     
  }
   
   public void actionPerformed(ActionEvent ae)
   {
        if(ae.getSource()==B1)
           {
              TF1.setText("CSE");
           }
        if(ae.getSource()==B2)
           {
              TF1.setText("Xomputer");
           }
       
    }

   public static void main(String args[])
   {
       new GUIX();
   }
}
