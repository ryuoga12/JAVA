import java.awt.FlowLayout;
import javax.swing.*;
public class DecimalToBinary extends JFrame{
	static JTextField textfield1, textfield2 ;
    static JButton b;
	
	 public static void main(String[] args) {
		  		  
		    JFrame f = new JFrame("Decimal to binary converter");
		   
            f.setSize(400,500);		    
            textfield1 = new JTextField("0",10);
            	f.getContentPane().add(textfield1);	    
            
            b=new JButton("Convert");
            b.setBounds(130,100,100, 40); 
            f.add(b);

            
 

            textfield2 = new JTextField("",10);		
		    f.getContentPane().add(textfield2);

            f.setLayout(new FlowLayout());
		    f.pack();
		    f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            while(true){
int i = 0;

String text=textfield1.getText().toString();
if (text.length() == 0)
    {i = 0;}
else
    {i =Integer.parseInt(text);} 
String bin = code(i);
textfield2.setText(bin);
}
		  }
    public static String code(int a){

		int n = a;

		
		int n2 = n;int r = 0,br = 0,k = 0;
		while(n2 != 0)
		{r = n2 % 2;
		 n2 = n2 / 2;
		 br = r + br*10;
		 k++;
		}
		
		// we need to reverse br to get actual binary num
		int b = 0;
		while(k != 0)
		{r = br % 10;
		 br = br / 10;
		 b = r + b*10;
		 k--;
		}
		
        String s =Integer.toString(b);        
        return  s;
}
}
