//Develop a GUI application in Java that facilitates the user to find average marks based on three subjects
import java.awt.*;
import java.awt.event.*;

import java.awt.*;
import java.awt.event.*;

public class AvgGUI implements ActionListener
{
    Button B1,B2;
    Label L1,L2,L3,L4;
    Frame F1;
    TextField TF1,TF2,TF3,TF4;

    AvgGUI()
    {
        B1=new Button("Calculate Average");
	B2=new Button("EXIT");
        L1=new Label("First Subject Number");
        L2=new Label("Second Subject Number");
        L3=new Label("Third Subject Number");
        L4=new Label("Result");
        TF1=new TextField(10);
        TF2=new TextField(10);
        TF3=new TextField(10);
        TF4=new TextField(10);

        F1=new Frame("Average Calculation");
        F1.setSize(300,200);
        F1.show();
        F1.setLayout(new FlowLayout());

        F1.add(L1);
        F1.add(TF1);
        F1.add(L2);
        F1.add(TF2);
	F1.add(L3);
	F1.add(TF3);
        F1.add(B1);
        F1.add(L4);
        F1.add(TF4);
	F1.add(B2);

        B1.addActionListener(this);
	B2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==B1)
        {
            int a= Integer.parseInt(TF1.getText());
            int b= Integer.parseInt(TF2.getText());
	    int c= Integer.parseInt(TF3.getText());	
            int d=(a+b+c)/3;
            TF4.setText(Integer.toString(d));
        }
	if(ae.getSource()==B2)
	{
		F1.dispose();
	}
    }

    public static void main(String args[])
    {
        new AvgGUI();
    }
}