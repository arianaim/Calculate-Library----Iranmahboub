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
	//return the angle measure given in radians into degress
	public static double toDegree(double num1) {
		double sum = 3.4159*num1;
		return sum/180;
	}
	//return the radians given in degrees degrees into radians
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
		return (num1/num2+" "+ num1%num2+"/"+num2);
	}
	//return the quadratic equation(ax^2+bx+c) from a binomial multiplication (ax+b)(cx+d)
	public static String foil(int num1, int num2, int num3, int num4) {
		return (num1*int3+"n^2"+" " + num2  )
	}
}
