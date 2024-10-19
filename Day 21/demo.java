
import java.util.*;
class demo{

	public static void main(String args[]){

		Scanner s1= new Scanner(System.in);

		//1. check user number is prime or not

		System.out.println("Enter a number: ");
		
		int num=s1.nextInt();

		int temp=0;

		for(int i=2;i<=num;i++){

			if(num%i==0){

				temp++;

				}

			}
		temp=0;

		if(temp>0){
			
			System.out.println(num+" is a not prime number.");

			}
		else{
			
			System.out.println(num+" is a  prime number.");

			}

	System.out.print("\n-------------------------------------------\n");

		//2. Write a Program to convert entered Binary Number to Hexadecimal number.

		System.out.println("Enter bin : ");
		long bin = s1.nextLong();
		bin_hex(bin);

		 void printHex(int num){
			switch(num) {
			case 10:
				System.out.print("A");
				break;
			case 11:
				System.out.print("B");
				break;
			case 12:
				System.out.print("C");
				break;
			case 13:
				System.out.print("D");
				break;
			case 14:
				System.out.print("E");
				break;
			case 15:
				System.out.print("F");
				break;
			default:
				System.out.print(num);
				break;
		}
	}
	 void bin_hex(long bin) {
		int dec = 0, rem, count_1 = 0;
		int temp, rem1, count_2 = 0, div;
		while(bin != 0) {
			rem = (int)(bin % 10);
			if(!(rem == 0 || rem == 1)) {
				System.out.println("Enter valid bin.");
				System.exit(1);
			}
			dec += rem * Math.pow(2, count_1);
			count_1++;
			bin /= 10;
		}
		System.out.print("Hex : ");
		temp = dec;
		while(count_2 >= 0) {
			div = temp /(int)Math.pow(16, count_2);
			rem1 = temp % (int)Math.pow(16, count_2);
			if(div >= 0 && div < 16) {
				printHex(div);
				count_2--;
				temp = rem1;
			} else {
				count_2++;
			}
		}


		bin_hex(bin);

	System.out.print("\n-------------------------------------------\n");


		//3.Write a Program to Convert the entered distance in Kilometre by user into meter

		System.out.println("Enter distance in kilometer :");

		int km=s1.nextInt();

		int meter=km*1000;

		System.out.println("the kilometer is :"+km+" and converted into meter :"+meter+"meter");


	System.out.print("\n-------------------------------------------\n");

		//4. print pattern

		char a;

		for(int i=4;i>=1;i--){

			if(i==4){
				
				a='A';

				for(int j=1;j<=i;j++){

				System.out.print(a+"\t");

				++a;
				++a;

					}
				}
			else if(i==2){

				a='C';

				for(int j=1;j<=i;j++){

				System.out.print(a+"\t");

				++a;
				++a;

					}
				}
			else if(i==3){

				a='B';

				for(int j=1;j<=i;j++){

				System.out.print(a+"\t");

				++a;
				++a;

					}
				}

			else if(i==1){

				for(int j=1;j<=i;j++){

				a='D';

				System.out.print(a+"\t");

				++a;
				++a;

					}
				}
			
		System.out.println();

			}

	System.out.print("\n-------------------------------------------\n");

		//5.  Calculate and print the sum of all elements in an array.

		int size;

		System.out.println("Enter size of an array: ");

		size=s1.nextInt();

		int arr[]= new int[size];

		System.out.println("Enter the elements of an array: ");


		for(int i=0;i<size;i++){

			arr[i]=s1.nextInt();

			}

		int count=0;

		for(int i=0;i<size;i++){

			count=count+arr[i];

			}

		System.out.println("The sum of an array elements is : "+count);

	System.out.print("\n-------------------------------------------\n");


		//6.print array elements in reverse order

		int size_1;

		System.out.println("Enter size of an array: ");

		size_1=s1.nextInt();

		int arr_1[]= new int[size_1];

		System.out.println("Enter the elements of an array: ");


		for(int i=0;i<size;i++){

			arr_1[i]=s1.nextInt();

			}

		System.out.println("Reversed Array Elements is :");

		for(int i=size-1;i>=0;i--){

			System.out.print(arr_1[i]+"\t");

			}

















		}

	


}