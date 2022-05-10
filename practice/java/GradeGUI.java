import java.awt.*;
import java.awt.event.*;

class GradeGUI implements ActionListener
{
    Button B1,B2,B3;
    Label L1,L2,L3,L4;
    Frame F1;
    TextField TF1,TF2,TF3,TF4;

    GradeGUI()
    {
        B1=new Button("Calculate");
        B2=new Button("CLEAR TEXT FIELDS");
        B3=new Button("EXIT");        

        L1=new Label("Subject 1 : ");
        L2=new Label("Subject 2 :");
        L3=new Label("Subject 3 :");
        L4=new Label("Grade : ");    

        TF1=new TextField(10);
        TF2=new TextField(10);
        TF3=new TextField(10);
        TF4=new TextField(20);

        F1=new Frame("Grade Calculator");
        F1.setSize(300,400);
        F1.show();
        F1.setLayout(new FlowLayout());

        F1.add(L1);F1.add(TF1);
        F1.add(L2);F1.add(TF2);
        F1.add(L3);F1.add(TF3);
        F1.add(B1);
        F1.add(L4);
        F1.add(TF4);
        F1.add(B2);
        F1.add(B3);

        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);      
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==B1)
        {
            int m1=Integer.parseInt(TF1.getText());
            int m2=Integer.parseInt(TF2.getText());
            int m3=Integer.parseInt(TF3.getText());
            int avg=(m1+m2+m3)/3;
            if(avg>=90)
            {
                TF4.setText("O");
            }
            else if((avg>=80))
            {
                TF4.setText("E");
            }
            else if((avg>=70))
            {
                TF4.setText("A");
            }
            else if((avg>=60))
            {
                TF4.setText("B");
            }
            else if((avg>=50))
            {
                TF4.setText("C");
            }
            else if((avg>=40))
            {
                TF4.setText("D");
            }
            else if(avg<40)
            {
                TF4.setText("F");
            }
        }
        else if(ae.getSource()==B2)
        {
            TF1.setText("");
            TF2.setText("");
            TF3.setText("");
            TF4.setText("");
        }
        else if(ae.getSource()==B3)
        {
            F1.dispose();
        }
    }
    public static void main(String args[])
    {
        new GradeGUI();
    }
}