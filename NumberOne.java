import javax.swing.JOptionPane;

public class NumberOne {
	public static void main(String[] args) { 

        int n;
        
        JOptionPane.showMessageDialog(null, "***Welcome to Mathematics Olympics Game***");
        
        JOptionPane.showMessageDialog(null, "I will help you how to learn to multiply");
        
        JOptionPane.showMessageDialog(null, "So, Let's started");
    
        n = Integer.parseInt(JOptionPane.showInputDialog("Write a number: "));
       
        
        JOptionPane.showMessageDialog(null, "Table of " +n+ " Amazing choice");
        for(int i = 1; i<=10; i++){
        	JOptionPane.showInputDialog(n + " * " + i + " = " + n*i);                                                     
        }
    }
}

