/** @Karan Sapolia  7/3/17
	TO find the sum of all multiples of 5 and 3 below 1000*/
import java.io.*;
class problem1 {
	int[] multiples35 = new int[1000];
	int count=0,i=3,j=0;
	void multiples()throws IOException {
		while(i<1000) {
			if( (i%3==0) || (i%5==0) ) {
				multiples35[j]=i;
				j++;
				count+=i;
			}
			i++;
		}
		System.out.println("Sum = "+count);
	}
	public static void main(String args[])throws IOException {
		problem1 obj = new problem1();
		obj.multiples(); 
	}
}