package Week04Coding;

import java.util.*;

public class CodingAssignmentWeek04 {
	
	public static void main(String[] args) {
		
		/* 1. Create an array of int called ages that contains the following 
		 * values: 3, 9, 23, 64, 2, 8, 28, 93.
		*/
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		/*a. Programmatically subtract the value of the first element in the
		array from the value in the last element of the array (i.e. do not use ages[7] 
		in your code). Print the result to the console.  
		*/
		
		int removeFirstFromLast = ages[ages.length - 1] - ages[0];
		System.out.println("The value when substracting the first "
				+ "element from the last element in the array is: " + removeFirstFromLast);
		
		/*b. Add a new age to your array and repeat the step above to ensure it is dynamic 
		 * (works for arrays of different lengths).
		 */
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 100};
		
		int removeFirstFromLast2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println("The value when substracting the first "
				+ "element from the last element in the array is: " + removeFirstFromLast2);
		
		/*
		 * c. Use a loop to iterate through the array and calculate the average age. 
		 * Print the result to the console.
		 */
		
		int sum = 0;
		for(int arr : ages) {
			sum += arr;
			
		}
		
		int average = sum/ages.length;
		
		System.out.println("The average age is: " + average);
		
		/*
		 * 2. Create an array of String called names that contains the following values: 
		 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 */
		
		String[] names = {"Sam", "Tim", "Sally", "Buck", "Bob"};
		
		/*
		 * a. Use a loop to iterate through the array and calculate the average number of 
		 * letters per name. Print the result to the console.
		 */
		int sumOfLetter = 0;
		for(String newArr : names) {
			
			int numberOfLetter = newArr.length();
			sumOfLetter += numberOfLetter;
			
		}
		
		int averageLength = sumOfLetter/names.length;
		System.out.println("The average of the name length is: " + averageLength);
		
		/*
		 * b. Use a loop to iterate through the array again and concatenate all the names
		 * together, separated by spaces, and print the result to the console.
		 */
		
		String concatArray = "";
		
		for(String Arr : names) {
			
			concatArray += Arr + " ";
			
		}
		System.out.println("The names in the array are: " + concatArray);
		
		/*
		 * 3. How do you access the last element of any array?
		 * Response: the last element in array  can be accessed by using the variable .length()-1
		 * as argument of the array. For example, if an array name is arr, accessing the last element 
		 * in array arr can be done as follows: arr[arr.length()-1];
		 */
		
		/*
		 * 4. How do you access the first element of any array?
		 * The first element of any array can be accessed using the following: arrayName[0].
		 */
		
		/*
		 * 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously 
		 * created names array and add the length of each name to the nameLengths array.
		 */
		
		int[] nameLengths = new int[names.length];
		
		System.out.print("The nameLengths of the array are: ");
		
		for(String i : names) {
			int nameLength = i.length();
			System.out.print(nameLength + " ");
		}
	
		/*
		 * 6.Write a loop to iterate over the nameLengths array and calculate the sum of all the elements
		 * in the array. Print the result to the console.
		 */
		
		int sumOfNameLength = 0;
		
		for(String i : names) {
			int nameLength = i.length();
			
			sumOfNameLength += nameLength;			
			
		}
		
		System.out.println("The sum of the name's lengths is: " + sumOfNameLength);
		System.out.println(" ");
	
		
		/*
		 * 7. Write a method that takes a String, word, and an int, n, as arguments and returns the 
		 * word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect 
		 * the method to return “HelloHelloHello”).
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.print("Enter the amount of times the word should be repeated: ");
		
		int Times = in.nextInt();
		
		System.out.println(" ");
		
		System.out.print("Enter the word: ");
		
		String Word = in.next();
		
		System.out.println(" ");
		System.out.println(repeatWord(Word, Times));
		

		
	}
	
	static String repeatWord(String userWord, int numTimes) {
		
	    for(int i = 1; i < numTimes; i++){
	    	
	    	System.out.println(userWord);
	       
	    }
	    return userWord;
	}

}




