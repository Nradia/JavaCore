import javax.swing.JOptionPane;

import java.util.Random;

public class cost_fuel_ph2 {
	
	static Random rand = new Random(); 
	
	//object to generate a random number for distance
	


			public static void main(String[] args) {
				
				// Homework#1/b
				// Radia Smail
				// 09-09-2020
				
				
				// This program will calculate and display a user�s fuel cost
				
			// Declare variables
			
			
			String vName = null;	
			int num  = 0;
			int mpg =0;
			float gasPrice = (float)0.0;
			String member = null;
			final double DISC = 0.05;
			float cost = (float)0.0;

			
		// Welcome the user 
			
			JOptionPane.showMessageDialog(null,"Welcome to Cost Claculator 2020");
			
			
		// Ask the user for inputs using dialog box	
				
		    vName = JOptionPane.showInputDialog(null,"what is your vehicle name");
		    System.out.println(vName);
		    
		   num = rand.nextInt(901)+100;
		   System.out.println(num);
		   
		   mpg =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your car MPG"));
		   System.out.println(mpg);
		   
		   gasPrice = Float.parseFloat(JOptionPane.showInputDialog(null," Enter gas price per gallon"));
		   System.out.println(gasPrice);
		   
		   
		   member = JOptionPane.showInputDialog(null,"Are you a club member? yes/no ");
		   System.out.println(member);
		   
		   
		   
		   if (member.equalsIgnoreCase("yes"))
		   {  cost = (float)((float)((num/mpg)*gasPrice)-(DISC*num));
		   }
		   else
		   {  cost = (num/mpg )*gasPrice;
		   }
		   // format the output with two decimal places
		   
		   System.out.printf("$%.2f\n",cost);
		   
		   }
			
		   

			{

	}//end of main 

} //end of class
