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
	}
}
