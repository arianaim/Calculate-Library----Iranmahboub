/*This class contain methods that perform various math operations. 
 * @author Ariana Iranmahboub
 * @version September 6, 2018
 */
public class Calculate {
	//returns the square of the input
	public static int square (int number) {
		return number*number;
}
	//return the cube of the input
	public static int cube (int number) {
		return number*number*number;
	}
	//return the average of two doubles
	public static double average (double num1, double num2) {
		double sum = num2+num1;
		return sum/2;
	}
	//return the average of three doubles
	public static double average(double num1, double num2, double num3) {
		double sum = num1+num2+num3;
		return sum/3;
	}
	//return the angle measure given in radiant into degrees
	public static double toDegree(double num1) {
		double sum = 3.4159*num1;
		return sum/180;
	}
	//return the radians given in degrees degrees into radiant
	public static double toRadians(double num1) {
		double sum = num1*180;
		return sum/3.4159;
	}
	//return the value of the discriminant of coefficients of quadratic equation
	public static double discriminant(double num1, double num2, double num3) {
		double sum = (num2*num2)-(4*num1*num3);
		return sum;
	}
	//return improper fraction from value of mixed number
	public static String toImproperFrac(int num1, int num2, int num3) {
		return (num3*num1+num2 +"/"+num3);
	}
	//return the mixed number from an improper fraction
	public static String toMixedNum(int num1, int num2) {
		return (num1/num2+"_"+ num1%num2+"/"+num2);
	}
	//return the quadratic equation(ax^2+bx+c) from a binomial multiplication (ax+b)(cx+d)
	public static String foil(int num1, int num2, int num3, int num4) {
		return (num1*num3+"n^2 + " + (num1*num4+num2*num3) +"n + "+num2*num4);
	}
	//return a boolean to determine if one integer is evenly divisible by another
	public static boolean isDivisibleBy(int num1, int num2) {
		if(num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	//return the double the absolute value of the accepted double.
	public static double absValue(double num) {
		if (num >= 0) {
			return num;
		} else {
			return (num*-1.00);
		}
	}
	//returns the double of the larger of the values passes
	public static double max(double num1, double num2) {
		if (num1>=num2) {
			return num1;
		} else {
			return (num2);
		}
	}
	//Overload the max method. THis accepts three doubles and returns a double
	public static double max(double num1, double num2, double num3) {
		if (num1>=num2 && num1>= num3) {
			return num1;
		} else if (num2>=num1 && num2>=num3) {
			return num2;
		} else {
			return num3;
		}
	}
	//return the small of the values passed. This method accepts two integers and returns an int.
	public static int min(int num1,int num2) {
		if (num1<=num2) {
			return num1;
		} else {
			return (num2);
		}
	}
	//returns a double from a double rounded correctly to 2 decimal places
	public static double round2(double num) {
		double step1;
		int step2;
		if (num>=0) {
			step1 = (num*100)+0.5;
		} else {
			step1=(num*100)-0.5;
		}
		step2=(int)step1;
		return step2/100.0;
	}
	//Raises a value to a positive integer power. Accepts a double and integer and returns a double.
	public static double exponent(double base, int exp) {
		double raisesValue= 1;
		if (exp>0) {
			for (int i=1; i<=exp; i++) {
			raisesValue = raisesValue * base;
			}
			return raisesValue;
		} else {
			return 1.0;
		}
	}
	//returns the factorial of the value passed. Accepts an integer and returns a double.
	public static double factorial(int num) {
		int increasingNum= 1;
		int add=0;
		for (int i=1; i<num; i++) {
			add=i+1;
			increasingNum=increasingNum*add; 
		}
		return increasingNum;
	}
	//determines whether integer is a prime. Accepts an integer and returns a boolean
	public static boolean isPrime(int num) {
		boolean answer = false;
		for (int i=2; i<num; i++) {
			if (isDivisibleBy(num, i)==true) {
			answer= false;
			} else {
			answer = true;
			}
		}
		return answer;
	}
	//return the greatest common factor of the two integers
	public static int gcf(int num1, int num2) {
		while (num1!=0 && num2!=0) {
			if (num1>=num2) {
				num1=num1-num2;
			} else {
				num2=num2-num1;
			}
		}
		return (int) absValue(num1+num2); 
	}
	//returns approximation of the square root of the value passed, rounded to two decimal points. Accepts double and returns a double.
	public static double sqrt(double num) {
		double j=2.0;
		double step1;
		double step2;
		double step3=0;
		for (int i=1 ; i<=5; i++) {
			step1=num/j;
			step2=step1+j;
			step3=step2/2;
			j=step3;
		}
	return (round2(step3));
	}
}
