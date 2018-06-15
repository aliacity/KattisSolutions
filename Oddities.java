import java.util.Scanner;
public class Oddities {
 	
	public static void main(String args[]){ 
		Scanner input = new Scanner(System.in); // Initialises a scanner to accept user input
		int tests;
		//System.out.println("Please enter the number of test cases"); // Kattis give an error from print statements
		tests = (Integer.parseInt(input.nextLine())); // variable to store the number of test cases that will be run
		if ((tests >=1) && (tests <=20)){ // accepts a max of 20 tests cases
			for (int x=0;x<tests;x++){ 
				int num = Integer.parseInt(input.nextLine());
				if ((num >=-10) && (num <=10)){ // only accepts integers between -10 and 10
					Oddities.isEven(num); // calls the iseven method to check if the number is even
				}				
			}
		}
		input.close();		// close the scanner
	}

	static private void isEven(int num){//check if the number is even or odd
		if ((num%2)==0){
			System.out.println(num +" "+"is even");
		}else{
			System.out.println(num +" " +"is odd");
		}
	}
	
}
