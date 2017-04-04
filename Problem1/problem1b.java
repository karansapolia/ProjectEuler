/** @Karan Sapolia 7/3/17 
	Program to find sum of multiples of 3 and 5 below 1000*/
import java.io.*;
class problem1b{
	int sum=0, multi_three, multi_five;
	void multiples35()throws IOException {
		for(int i=1; i<350; i++) {
			multi_three=3*i;
			multi_five=5*i;
			if(multi_three>=1000)
				multi_three=0;
			if (multi_five>=1000) 
				multi_five=0;
			if(multi_three%5==0) // for multiples of LCM
				multi_three=0;
				sum+=multi_three+multi_five;
		}
		System.out.println("Sum = "+sum);
	}
	public static void main(String[] args)throws IOException {
		problem1b obj=new problem1b();
		obj.multiples35();
		
	}
}