package week1.day2;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        int range = 8;
        int firstNum = 0;
        int secondNum = 1;
        int sum;
     // Print first number
        System.out.println(firstNum);
        System.out.println(secondNum);
        
     // Iterate from 1 to the range
        for (int i = 1; i <= range; i++) {
			
        	// add first and second number assign to sum
        	sum = firstNum+secondNum;
            
        	// Assign second number to the first number
        	firstNum = secondNum;
        	
        	// Assign sum to the second number
        	secondNum = sum;
        	
        	// print sum
        	System.out.println(sum);
		}
        
	}




	}


