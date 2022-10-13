package week3assignment;

public class Question2 {

	public static void main (String[] args) {
		
		String[] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		int letters = 0;
		
		for (String name : names) {
			
			letters = name.length() + letters; 
			
		}
		
		double avg = letters / names.length;
		
		System.out.println("The average number of letters per name is " + avg);
		
		String allNames = "";
		
		for (String name : names) {
			
			allNames = allNames + " " + name;
			
		}
		
		System.out.println("All the names in this array: " + allNames);
		
		//Answer to question 5
		
		int[] nameLengths = new int[6];
		int i = 0;
		 while (i < 6) {
			 
			 nameLengths[i] = names[i].length();
			 //testing this loop
			 //System.out.println("The length of " + names[i] + " is " + nameLengths[i]);
			 i++;
		 }
		
		//Answer to question 6 
		int nameLengthSum = 0;
		 
		for (int nameLength : nameLengths) {
			
			nameLengthSum = nameLengthSum + nameLength;
			
		}
		
		System.out.println("The sum of all name lengths is " + nameLengthSum);
		
		
		
		
		
	}
	
	
}
