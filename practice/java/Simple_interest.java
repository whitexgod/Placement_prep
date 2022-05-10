import java.awt.*;
import java.awt.event.*;

class Simple_interest implements ActionListener
{
    Button B1,B2,B3;
    Label L1,L2,L3,L4;
    Frame F1;
    TextField TF1,TF2,TF3,TF4,TF5;

    Simple_interest()
    {
        B1=new Button("Calculate");
        B2=new Button("CLEAR TEXT FIELDS");
        B3=new Button("EXIT");        

        L1=new Label("Principle(in Rs.)");
        L2=new Label("Rate(%)");
        L3=new Label("Time(in yr)");
        L4=new Label("Result(in Rs.) : ");    

        TF1=new TextField(10);
        TF2=new TextField(10);
        TF3=new TextField(10);
        TF4=new TextField(20);
        TF5=new TextField(20);

        F1=new Frame("Simple Interest Calculator");
        F1.setSize(300,400);
        F1.show();
        F1.setLayout(new FlowLayout());

        F1.add(L1);F1.add(TF1);
        F1.add(L2);F1.add(TF2);
        F1.add(L3);F1.add(TF3);
        F1.add(B1);
        F1.add(L4);
        F1.add(TF4);
        F1.add(TF5);
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
            int p=Integer.parseInt(TF1.getText());
            int r=Integer.parseInt(TF2.getText());
            int t=Integer.parseInt(TF3.getText());
            int si=(p*r*t)/100;
            int amount=p+si;
            TF4.setText(Integer.toString(si));
            TF5.setText(Integer.toString(amount));
        }        
        else if(ae.getSource()==B2)
        {
            TF1.setText("");
            TF2.setText("");
            TF3.setText("");
            TF4.setText("");
            TF5.setText("");
        }
        else if(ae.getSource()==B3)
        {
            F1.dispose();
        }
    }

    public static void main(String args[])
    {
        new Simple_interest();
    }
}