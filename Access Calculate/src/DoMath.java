/*This class is client code that uses the Calculate Library to perform various mathematical tasks. 
 * @author Ariana Iranmahboub
 * @version September 6, 2018
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(55));
		System.out.println(Calculate.cube(10));
		System.out.println(Calculate.average(2.5,4.6));
		System.out.println(Calculate.average(3.4, 4.7, 8.9));
		System.out.println(Calculate.toDegree(35));
		System.out.println(Calculate.toRadians(2.5));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(2, 3, 6, -7));
		System.out.println(Calculate.isDivisibleBy(6, 3));
		System.out.println(Calculate.absValue(-1.02));
		System.out.println(Calculate.max(4.08,3.99));
		System.out.println(Calculate.max(2.011,8.98,6.49));
		System.out.println(Calculate.min(3,-8));
		System.out.println(Calculate.round2(-1.4733));
		System.out.println(Calculate.exponent(4,4));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(40));
		System.out.println(Calculate.gcf(21, 9));
		System.out.println(Calculate.sqrt(226));
	}
}
