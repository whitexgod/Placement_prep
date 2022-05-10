import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener
{
    Button B1,B2,B3,B4,B5,B6,B7;
    Label L1,L2,L3,L4,L5;
    Frame F1;
    TextField TF1,TF2,TF3,TF4,TF5,TF6,TF7;

    Calculator()
    {
        B1=new Button("ADD");
        B2=new Button("Substract");
        B3=new Button("Multiply");
        B4=new Button("Divide");
        B5=new Button("CLEAR TEXT FIELDS");
        B6=new Button("EXIT");
        B7=new Button("Simple Interest");

        L1=new Label("First Number");
        L2=new Label("Second Number");
        L3=new Label("Principle");
        L4=new Label("Rate");
        L5=new Label("Time");

        TF1=new TextField(10);
        TF2=new TextField(10);
        TF3=new TextField(20);
        TF4=new TextField(5);
        TF5=new TextField(5);
        TF6=new TextField(5);
        TF7=new TextField(10);

        F1=new Frame("Calculator");
        F1.setSize(300,400);
        F1.show();
        F1.setLayout(new FlowLayout());

        F1.add(L1);F1.add(TF1);
        F1.add(L2);F1.add(TF2);
        F1.add(B1);F1.add(B2);F1.add(B3);F1.add(B4);
        F1.add(TF3);
        F1.add(L3);F1.add(TF4);
        F1.add(L4);F1.add(TF5);
        F1.add(L5);F1.add(TF6);
        F1.add(B7);
        F1.add(TF7);
        F1.add(B5);
        F1.add(B6);

        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);
        B6.addActionListener(this);
        B7.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==B1)
        {
            int a= Integer.parseInt(TF1.getText());
            int b= Integer.parseInt(TF2.getText());
            int c=a+b;
            TF3.setText("Addition is : "+Integer.toString(c));
        }
        else if(ae.getSource()==B2)
        {
            int a= Integer.parseInt(TF1.getText());
            int b= Integer.parseInt(TF2.getText());
            int c=a-b;
            TF3.setText("Difference is : "+Integer.toString(Math.abs(c)));
        }
        else if(ae.getSource()==B3)
        {
            int a= Integer.parseInt(TF1.getText());
            int b= Integer.parseInt(TF2.getText());
            int c=a*b;
            TF3.setText("Product is : "+Integer.toString(c));
        }
        else if(ae.getSource()==B4)
        {
            int a= Integer.parseInt(TF1.getText());
            int b= Integer.parseInt(TF2.getText());
            int c=a/b;
            TF3.setText("Division is :"+Integer.toString(c));
        }
        else if(ae.getSource()==B7)
        {
            int p=Integer.parseInt(TF4.getText());
            int r=Integer.parseInt(TF5.getText());
            int t=Integer.parseInt(TF6.getText());
            int si=(p*r*t)/100;
            TF7.setText(Integer.toString(si));
        }
        else if(ae.getSource()==B5)
        {
            TF1.setText("");
            TF2.setText("");
            TF3.setText("");
        }
        else if(ae.getSource()==B6)
        {
            F1.dispose();
        }
    }

    public static void main(String args[])
    {
        new Calculator();
    }
}