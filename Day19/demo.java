
import java.util.*;
class demo{

	//DAy 19

	public static void main(String args[]){

	//1. Write a Program to that prints the series which increases with the number entered by user.

		Scanner s1=new Scanner(System.in);

		System.out.println("Enter number : ");

		int num=s1.nextInt();

		int temp=1;

		for(int i=1;i<=10;i++){

			System.out.print(temp+" ");
		
			temp=temp+num;
			}
	
	System.out.print("\n------------------------------------------------------\n");

		//2. Write a Program that takes rupees as input from user and convert them into dollars.
	
		int rupee=s1.nextInt();
		
		int dolar=rupee/84;

		System.out.println("The rupees is : "+rupee+" and convert into : "+dolar+"Dolar $");


	System.out.print("\n------------------------------------------------------\n");

		//3. Write a Program to Print following Pattern
	
			char a='A';

			for(int i=5;i>=1;i--){

				for(int j=1;j<=i;j++){

						System.out.print(a+"\t");

						}
				a++;

			System.out.println();


				}

	System.out.print("\n------------------------------------------------------\n");

		//4. 

			//4. print pattern
			
			int count;

			for(int i=1;i<=4;i++){

				if(i==1){
				count=7;

				for(int j=1;j<=i;j++){

					System.out.print(count+"\t");

					}
				}

				else if(i==2){
					count=6;
				for(int j=1;j<=i;j++){

				System.out.print(count+"\t");
				--count;
					}

					
				}

				else if(i==3){
					count=5;

					for(int j=1;j<=i;j++){

					System.out.print(count+"\t");
					--count;
					}
			

				}

				else if(i==4){
					count=4;

					for(int j=1;j<=i;j++){

					System.out.print(count+"\t");
				--count;
					}
			

				}


			System.out.println();
			
			}

	System.out.print("\n------------------------------------------------------\n");
		
		//5. Write a Program that prints series of perfect numbers up to the entered limiting number.
		
			System.out.println("Enter the number upto get series of perfect number:");
			int length=s1.nextInt();
			int temp_;

			int i1=1;

			System.out.print(i1+" ");
		
			for(int i=2;i<=length;i++){

					temp_=0;

				for(int j=1;j<i;j++){
					
					if(i%j==0){
						temp_=temp_+j;
					
						}
					}
					if(i==temp_){

					System.out.print(i+" ");
						
						}

					}

		System.out.print("\n------------------------------------------------------\n");
		
			//6. take array input from user and print odd and even numbers

				System.out.println("Enter the size of array :");

				int size=s1.nextInt();	
			
				int arr[]=new int[size];

				System.out.println("Enter the elements of an array :");	

					for(int i=0;i<size;i++){

						arr[i]=s1.nextInt();

							}

				System.out.print("\n the even elements is :\n");

				for(int i=0;i<size;i++){

						if(arr[i]%2==0){

							System.out.print(arr[i]+" ");

						}

					

							}

				System.out.print("\n the odd elements is :\n");

				for(int i=0;i<size;i++){

						if(arr[i]%2==1){

							System.out.print(arr[i]+" ");

						}

					

							}


			


		}
	

	}