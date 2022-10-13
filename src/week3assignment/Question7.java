package week3assignment;

public class Question7 {

	public static void main (String[] args) {
		
		String word = "Hello";
		int n = 3;
		
		System.out.println("The word " + word+ " repeated " + n + " times is " + wordRepeater(word, n));
		
		String firstName = "Robin";
		String lastName = "Banks";
		
		System.out.println("The full name is " + fullName(firstName, lastName));
		
		int[] array = new int[3];
		array[0] = 100;
		array[1] = 1;
		
		System.out.println("The sum of array elements is greater than 100? " + isGreater100(array));
		
		double[] doubleArray = new double[2];
		doubleArray[0] = 51.25;
		doubleArray[1] = 52.75;
		
		System.out.println("The average of all double array elements is " + dblArrayAvg(doubleArray));
		
		double[] otherDoubleArray = new double[2];
		otherDoubleArray[0] = 50;
		otherDoubleArray[1] = 59;
		
		System.out.println("The average of the first array is greater than the average of the second: " + greaterAverage(doubleArray, otherDoubleArray));
		
		boolean isHotOutside = true;
		double moneyInPocket = 10.50;
		
		System.out.println("Will I buy a drink today? " + willBuyDrink(isHotOutside,moneyInPocket ));
		
		double[] employeeWages = new double[4];
		employeeWages[0] = 10.25;
		employeeWages[1] = 11.00;
		employeeWages[2] = 12.75;
		employeeWages[3] = 14.00;
		
		double wageIncrease = 0.50;
		
		applyWageIncrease(employeeWages, wageIncrease);
		
		
	}

	public static void applyWageIncrease(double[] employeeWages, double wageIncrease) {
		// Answer to question 12. This method takes an array of employee salaries and applies a static increase of the
		// same amount to each wage by updating each element in the array. This might be used in a scenario where HR
		// might be applying a cost of living increase to all employee wages
		
		int i = 0;
		while (i < employeeWages.length) {
			System.out.println("The wage of employee number " + i + " has been updated from " + employeeWages[i] + " to:");
			employeeWages[i] = employeeWages[i] + wageIncrease;
			System.out.println(employeeWages[i]);
			i++;
		}
		
		
	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		//answer to question 12
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else return false;
				
	}

	public static boolean greaterAverage(double[] doubleArray, double[] otherDoubleArray) {
		// answer to question 11
		return dblArrayAvg(doubleArray) > dblArrayAvg(otherDoubleArray);
	}

	public static double dblArrayAvg(double[] doubleArray) {
	// Answer to question 10 
		double sum = 0;
		for (double number : doubleArray) {
			
			sum = sum + number;
			}
		return sum / doubleArray.length;
				
	}

	public static String wordRepeater(String word, int n) {
	//Answer to question 7
		int i = 1;
		String repeatedWord = "";
		while (i <= n) {
		repeatedWord = repeatedWord + word;	
		i++;
		}
		return repeatedWord;
	}
	
	public static String fullName (String firstName, String lastName) {
		//answer to question 8
		
		String fullName = firstName + " " + lastName;
		
		return fullName;
				
	}
	
	public static boolean isGreater100 (int[] array) {
		//answer to question 9
		
		int sum = 0;
		
		for (int number : array) {
			sum = sum + number;
			}
		return sum > 100;
		
	}
	
}
