package framework1;

import java.util.Scanner;

public class Exceptionhandling {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the value: a");
		a=in.nextInt();
		System.out.println("enter the value: b");
		b=in.nextInt();
		c=a/b;
		System.out.println("result of a/b :"+c);
		
		

}
}