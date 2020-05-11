import java.awt.FlowLayout;
import javax.swing.*;

public class DecimalToBinary extends JFrame{
	static JTextField textfield1, textfield2 ;
    
	
	 public static void main(String[] args) {
            JFrame f = new JFrame("Decimal to binary converter");
		   
            	    
            textfield1 = new JTextField("0",10);
            f.getContentPane().add(textfield1);	    
            textfield2 = new JTextField("",10);
            f.getContentPane().add(textfield2);
            f.setLayout(new FlowLayout());
            f.pack();
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(400,80);
            textfield1.setToolTipText("Enter Decimal Number");
            textfield2.setToolTipText("Binary Equevalent");
            textfield1.requestFocusInWindow();
            while(true)
                {
                    int i = 0;
                    String text=textfield1.getText().toString();
                    if (text.length() == 0)
                        {i = 0;}
                    else
                        {try
                            {
                                i =Integer.parseInt(text);
                                textfield2.setText(Integer.toBinaryString(i));
                            }
                         catch(Exception e)
                                {
                                    textfield1.setText("0");
                                    JOptionPane.showMessageDialog(null, "Oops! Error Occured : " +e);
                                } 
                        }

                }
} // main
} // class
