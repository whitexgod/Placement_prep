import java.awt.*;
import java.awt.event.*;

class Basic_CalculatorGUI implements ActionListener
{
    Frame F,F2;
    Button B0,B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20;
    TextField TF1,TF2,TF3,TF4;
    Label L1,L2,L3;

    Button Calculate_si;
    Label principle,rate,time;
    TextField TFP,TFR,TFT,TFResult;

    Basic_CalculatorGUI()
    {
        B0=new Button("0");
        B1=new Button("1");
        B2=new Button("2");
        B3=new Button("3");
        B4=new Button("4");
        B5=new Button("5");
        B6=new Button("6");
        B7=new Button("7");
        B8=new Button("8");
        B9=new Button("9");
        B10=new Button("+");
        B11=new Button("-");
        B12=new Button("*");
        B13=new Button("/");
        B14=new Button("%");
        B15=new Button("=");
        B18=new Button("S.I.");
        B16=new Button("Close");
        B19=new Button("Close");
        B17=new Button("Clear all");
        Calculate_si=new Button("Calculate");
        B20=new Button("Clear ALL");

        TF1=new TextField(4);
        TF2=new TextField(4);
        TF3=new TextField(4);
        TFP=new TextField(4);
        TFR=new TextField(4);
        TFT=new TextField(4);
        TFResult=new TextField(5);

        L1=new Label("Input");
        L2=new Label("Result");
        L3=new Label("=");
        principle=new Label("Principle in Rs.");
        rate=new Label("Rate(%)");
        time=new Label("Time(in years)");

        F=new Frame("Basic Calculator(Expression will execute in serial manner)");
        F.setSize(500,500);
        F.setFont(new Font("Serif", Font.PLAIN, 20));
        F.show();
        F.setLayout(new GridLayout(5,5));
        F2=new Frame("Simple Interest");
        F2.setSize(300,300);
        F2.setLayout(new FlowLayout());
        F2.setFont(new Font("Serif", Font.PLAIN, 20));

        F.add(L1);
        F.add(TF1);
        F.add(L2);
        F.add(L3);
        F.add(TF2);
        F.add(B0);
        F.add(B1);
        F.add(B2);
        F.add(B3);
        F.add(B4);
        F.add(B5);
        F.add(B6);
        F.add(B7);
        F.add(B8);
        F.add(B9);
        F.add(B10);
        F.add(B11);
        F.add(B12);
        F.add(B13);
        F.add(B14);
        F.add(B15);
        F.add(B16);
        F.add(B17);
        F.add(B18);
        F.add(TF3);
        F2.add(principle);
        F2.add(TFP);
        F2.add(rate);
        F2.add(TFR);
        F2.add(time);
        F2.add(TFT);
        F2.add(Calculate_si);F2.add(B20);
        F2.add(B19);
        F2.add(TFResult);

        B0.addActionListener(this);
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);
        B6.addActionListener(this);
        B7.addActionListener(this);
        B8.addActionListener(this);
        B9.addActionListener(this);
        B10.addActionListener(this);
        B11.addActionListener(this);
        B12.addActionListener(this);
        B13.addActionListener(this);
        B14.addActionListener(this);
        B15.addActionListener(this);
        B16.addActionListener(this);
        B17.addActionListener(this);
        B18.addActionListener(this);
        B19.addActionListener(this);
        Calculate_si.addActionListener(this);
        B20.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==B16)
        {
            F.dispose();
        }
        if(ae.getSource()==B19)
        {
            F2.dispose();
        }
        if(ae.getSource()==B0)
        {
            String n=TF1.getText()+"0";
            TF1.setText(n);
        }   
        if(ae.getSource()==B1)
        {
            String n=TF1.getText()+"1";
            TF1.setText(n);
        }     
        if(ae.getSource()==B2)
        {
            String n=TF1.getText()+"2";
            TF1.setText(n);
        }     
        if(ae.getSource()==B3)
        {
            String n=TF1.getText()+"3";
            TF1.setText(n);
        }
        if(ae.getSource()==B4)
        {
            String n=TF1.getText()+"4";
            TF1.setText(n);
        }      
        if(ae.getSource()==B5)
        {
            String n=TF1.getText()+"5";
            TF1.setText(n);
        }      
        if(ae.getSource()==B6)
        {
            String n=TF1.getText()+"6";
            TF1.setText(n);
        }      
        if(ae.getSource()==B7)
        {
            String n=TF1.getText()+"7";
            TF1.setText(n);
        }      
        if(ae.getSource()==B8)
        {
            String n=TF1.getText()+"8";
            TF1.setText(n);
        }      
        if(ae.getSource()==B9)
        {
            String n=TF1.getText()+"9";
            TF1.setText(n);
        }                    
        if(ae.getSource()==B10)
        {
            String n=TF1.getText()+"+";
            TF1.setText(n);
        }
        if(ae.getSource()==B11)
        {
            String n=TF1.getText()+"-";
            TF1.setText(n);
        }
        if(ae.getSource()==B12)
        {
            String n=TF1.getText()+"*";
            TF1.setText(n);
        }
        if(ae.getSource()==B13)
        {
            String n=TF1.getText()+"/";
            TF1.setText(n);
        }
        if(ae.getSource()==B14)
        {
            String n=TF1.getText()+"%";
            TF1.setText(n);
        }
        if(ae.getSource()==B15)
        {
            String s=TF1.getText();
            String[] result = s.split("[-+*/%]");
            char[] op=new char[5];
            int counter=0;
            for(int i=0;i<s.length();i++)
            {
                char a=s.charAt(i);
                if((a=='+') || (a=='-') || (a=='*') || (a=='/') || (a=='%'))
                {
                    op[counter]=a;
                    counter++;
                }
            }
            int final_result=0;
            for(int i=0;i<counter;i++)
            {
                if(i==0)
                {
                    switch(op[i])
                    {
                        case '+':
                        final_result=Integer.parseInt(result[i])+Integer.parseInt(result[i+1]);
                        break;
                        case '-':
                        final_result=Integer.parseInt(result[i])-Integer.parseInt(result[i+1]);
                        break;
                        case '*':
                        final_result=Integer.parseInt(result[i])*Integer.parseInt(result[i+1]);
                        break;
                        case '/':
                        final_result=Integer.parseInt(result[i])/Integer.parseInt(result[i+1]);
                        break;
                        case '%':
                        final_result=Integer.parseInt(result[i])%Integer.parseInt(result[i+1]);
                        break;
                        default:
                        final_result=0;
                    }
                }
                if(i==1)
                {
                    switch(op[i])
                    {
                        case '+':
                        final_result=final_result+Integer.parseInt(result[i+1]);
                        break;
                        case '-':
                        final_result=final_result-Integer.parseInt(result[i+1]);
                        break;
                        case '*':
                        final_result=final_result*Integer.parseInt(result[i+1]);
                        break;
                        case '/':
                        final_result=final_result/Integer.parseInt(result[i+1]);
                        break;
                        case '%':
                        final_result=final_result%Integer.parseInt(result[i+1]);
                        break;
                        default:
                        final_result=0;
                    }
                }
                if(i==2)
                {
                    switch(op[i])
                    {
                        case '+':
                        final_result=final_result+Integer.parseInt(result[i+1]);
                        break;
                        case '-':
                        final_result=final_result-Integer.parseInt(result[i+1]);
                        break;
                        case '*':
                        final_result=final_result*Integer.parseInt(result[i+1]);
                        break;
                        case '/':
                        final_result=final_result/Integer.parseInt(result[i+1]);
                        break;
                        case '%':
                        final_result=final_result%Integer.parseInt(result[i+1]);
                        break;
                        default:
                        final_result=0;
                    }
                }
                if(i==3)
                {
                    switch(op[i])
                    {
                        case '+':
                        final_result=final_result+Integer.parseInt(result[i+1]);
                        break;
                        case '-':
                        final_result=final_result-Integer.parseInt(result[i+1]);
                        break;
                        case '*':
                        final_result=final_result*Integer.parseInt(result[i+1]);
                        break;
                        case '/':
                        final_result=final_result/Integer.parseInt(result[i+1]);
                        break;
                        case '%':
                        final_result=final_result%Integer.parseInt(result[i+1]);
                        break;
                        default:
                        final_result=0;
                    }
                }
                if(i==4)
                {
                    switch(op[i])
                    {
                        case '+':
                        final_result=final_result+Integer.parseInt(result[i+1]);
                        break;
                        case '-':
                        final_result=final_result-Integer.parseInt(result[i+1]);
                        break;
                        case '*':
                        final_result=final_result*Integer.parseInt(result[i+1]);
                        break;
                        case '/':
                        final_result=final_result/Integer.parseInt(result[i+1]);
                        break;
                        case '%':
                        final_result=final_result%Integer.parseInt(result[i+1]);
                        break;
                        default:
                        final_result=0;
                    }
                }
                if(i==5)
                {
                    switch(op[i])
                    {
                        case '+':
                        final_result=final_result+Integer.parseInt(result[i+1]);
                        break;
                        case '-':
                        final_result=final_result-Integer.parseInt(result[i+1]);
                        break;
                        case '*':
                        final_result=final_result*Integer.parseInt(result[i+1]);
                        break;
                        case '/':
                        final_result=final_result/Integer.parseInt(result[i+1]);
                        break;
                        case '%':
                        final_result=final_result%Integer.parseInt(result[i+1]);
                        break;
                        default:
                        final_result=0;
                    }
                }
            }
            if(result.length == 1 )
            {
                TF2.setText(TF1.getText());
                TF3.setText("Successful"); 
            }
            else
            {
                TF2.setText(Integer.toString(final_result));
                TF3.setText("Successful");   
            }
        } 
        if(ae.getSource()==B17)
        {
            TF1.setText("");
            TF2.setText("");
            TF3.setText("");
        }  
        if(ae.getSource()==B18)
        {
            F2.show();
        }
        if(ae.getSource()==Calculate_si)
        {
            int p=Integer.parseInt(TFP.getText());
            int r=Integer.parseInt(TFR.getText());
            int t=Integer.parseInt(TFT.getText());
            int si=(p*r*t)/100;
            TFResult.setText(Integer.toString(si));
        }
        if(ae.getSource()==B20)
        {
            TFP.setText("");
            TFT.setText("");
            TFR.setText("");
            TFResult.setText("");
        }
    }

    public static void main(String args[])
    {
        new Basic_CalculatorGUI();
    }
}
