/*
Program 2: Write a Program to Convert entered
Decimal Number to Octal Number
Input: Decimal Number: 15
Output: Octal Number: 17
*/
import java.util.Scanner;
class Demo {
	public static void main(String[] args) {
		int num, quo, rem;
		String arr = "";
		System.out.println("Enter num : ");
		Scanner sc = new Scanner(System.in);		
		num = sc.nextInt();
		while(true) {
			quo = num / 8;
			rem = num % 8;
			num = quo;
			arr += Character.toString((char)(48 + rem));
			if(quo == 0)
				break;
		}	

		for(int j = arr.length() - 1 ; j >= 0; j--) {
			System.out.print(arr.charAt(j));
		}
	}
}
