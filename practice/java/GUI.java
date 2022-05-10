import java.awt.*;
import java.awt.event.*;

class GUI implements ActionListener
{
    Button B1,B2;   //declare components here
    Label L1;
    Frame F1;
    TextField TF1;

    GUI()
    {
        B1=new Button("OK");        
        B2=new Button("cancel");
        L1=new Label("Your name");
        TF1=new TextField(10);

        F1=new Frame("Our GUI");
        F1.setSize(300,300);
        F1.show();
        F1.setLayout(new FlowLayout());
        //F1.setLayout(new GridLayout(3,2)); 
        //F1.setLayout(new BorderLayout());
        //F1.setLayout(new CardLayout());
        //F1.setLayout(new GridBagLayout());
        //F1.setLayout(new NullLayout());

        F1.add(L1);
        F1.add(TF1);
        F1.add(B1);
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
        else if(ae.getSource()==B2)
        {
            TF1.setText("");
        }
    }

    public static void main(String args[])
    {
        new GUI();
    }
}