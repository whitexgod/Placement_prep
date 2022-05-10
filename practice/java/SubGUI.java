import java.awt.*;
import java.awt.event.*;
import java.lang.*;

class SubGUI implements ActionListener
{
    Button B1;
    Label L1,L2,L3;
    Frame F1;
    TextField TF1,TF2,TF3;

    SubGUI()
    {
        B1=new Button("Substract");
        L1=new Label("First Number");
        L2=new Label("Second Number");
        L3=new Label("Difference is : ");
        TF1=new TextField(10);
        TF2=new TextField(10);
        TF3=new TextField(20);

        F1=new Frame("Substraction");
        F1.setSize(250,250);
        F1.show();
        F1.setLayout(new FlowLayout());

        F1.add(L1);
        F1.add(TF1);
        F1.add(L2);
        F1.add(TF2);
        F1.add(B1);
        F1.add(L3);
        F1.add(TF3);

        B1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==B1)
        {
            int a= Integer.parseInt(TF1.getText());
            int b= Integer.parseInt(TF2.getText());
            int c=a-b;
            TF3.setText(Integer.toString(Math.abs(c)));
        }
    }

    public static void main(String args[])
    {
        new SubGUI();
    }
}