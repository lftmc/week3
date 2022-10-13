package week3assignment;

public class Question1 {
	
	public static void main (String[] args) {
		//answer to question 1
		int[] ages = new int[9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 4;
		int difference = ages[ages.length - 1] - ages[0];
		
		System.out.println("Last array element minus the first array element equals: " + difference);
		
		int sum = 0; 
		int avg = 0;
		
		for (int age : ages) {
			sum = sum + age;
		}
		
		avg = sum / ages.length;
		
		System.out.println("The average of array elements is " + avg);
		
	}

}
