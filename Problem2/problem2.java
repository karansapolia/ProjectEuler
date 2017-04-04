/** @Karan Sapolia  7/3/17
	TO find the sum of all even fibonacci numbers below 4,000,000*/
import java.io.*;
class problem2 {
	int a=1,b=1,c=0,sum=0;
    void evenSum()throws IOException {
        while (c<=4000000) {
            c=a+b; //System.out.print(a+" "+b+" "+c+" ");
            a=b;
            b=c;            
            if (c%2==0) {
                sum+=c;
                //System.out.print(" even ");
            }
                
                
            c++;
        }
        System.out.println(sum);
    }
    public static void main(String args[])throws IOException {
		problem2 obj = new problem2();
		obj.evenSum(); 
	}
}