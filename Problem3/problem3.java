/** @Karan Sapolia 16/3/17
 * 
 * To find the largest prime factor of 600851475143
 */
import java.io.*;
import java.math.*;
class problem3 {
    long num=600851475143/2, a=100, max=1;;
    void largestPrime()throws IOException {
        while (a<num) {
            if( a%2 != 0 && num%a == 0 && )
                max=a;
                a++;
            }
           System.out.println(max); 
        }
    public static void main(String args[])throws IOException {
		problem3 obj = new problem3();
		obj.largestPrime(); 
	}
}
