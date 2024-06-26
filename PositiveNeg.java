/*Write a Java program that reads a floating-point number and prints "zero" if the number is zero. 
Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is 
less than 1, or "large" if it exceeds 1,000,000.*/


class PositiveNeg{

public static void main (String args[]){

	float num1 = 0f;
	if (num1 == 0){

		System.out.println("zero");
	}
	else

	if (num1 > 0){
		System.out.println("positive");

		if (num1 < 1){
			System.out.println("small");
		}
		if (num1 > 1000000){
			System.out.println("large");
		}
	}
	
	else{
		System.out.println("negative");
	}
}
}

