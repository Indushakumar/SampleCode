package a;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the age");
		int age = s.nextInt();
		
		if(age>18 && age<=10)
		{
			System.out.println("person iseligible to vote");
		}
		else {
			System.out.println("person is not eligible to vote");
		}
	}
}
