import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * This class simulates rolling 2 dice for 36000.
 * @author chamith
 * @since 08/30/2022
 * 
 */

public class rollDice{
	
	
	//main method
	public static void main(String[]args) {
		roll();
	}
	
	
	public static void roll() {
		Random rand = new Random();
		
		
		// Initialize values for each die face value and array to hold totals
		int die1face;
		int die2face;
		ArrayList <Integer> totals = new ArrayList <Integer>() ;
		
		
		//get possible totals for rolling the dice for 36000 times
		for(int i = 0 ;i<36000 ;i++) {
			die1face = 1+ rand.nextInt(6);
			die2face = 1+ rand.nextInt(6);
			int tempTotal = die1face + die2face;
			
			// total of each roll is pushing to the totals array
			totals.add(tempTotal);

		}
		
		// this will print the output table header.
		System.out.printf("%3s%12s%12s\n","sum","frequency","percentage");

		
		// capture the frequency of each total and find the percentage.
		for (int t = 2 ;t <= 36000 ;t++) {		
			
			// expected maximum value is 12
			if(t<13) {
				int frequency = Collections.frequency(totals, t);
				Double percentage = Double.valueOf(frequency)*100/36000;
				//print data in to table format.
				System.out.printf("%3d%12d%12.2f\n",t,frequency, percentage);
			}
			
			
		}
		
	}
	
	
	
	
}