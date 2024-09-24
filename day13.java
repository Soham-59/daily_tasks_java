import java.util.*;
class demo{

	public static void main(String args[]){

		Scanner s1=new Scanner(System.in);

		//1. print pattern
			
		for(int i=1;i<=4;i++){

			for(int j=1;j<=i;j++){

				System.out.print(i+"\t");
				
				}
			System.out.println();
	
			}

	System.out.print("\n------------------------------------------------\n");

		
		//2. print pattern

		int count=1;

		for(int i=1;i<=4;i++){

			for(int j=1;j<=i;j++){

				System.out.print(count+"\t");
				count=count+1;
				
				}
			System.out.println();

		}

	System.out.print("\n------------------------------------------------\n");


		//3. print pattern

		for(int i=1;i<=4;i++){

			for(int j=1;j<=i;j++){

				System.out.print("*\t");
				
				}
			System.out.println();
	
			}

	System.out.print("\n------------------------------------------------\n");


		//4.factorial of number

		int temp=1;

		System.out.println("Enter Number:");

		int num=s1.nextInt();

		for(int i=1;i<=num;i++){

			temp=temp*i;

				}

		System.out.println("Factorial of"+ num +"is :"+temp);

	System.out.print("\n------------------------------------------------\n");

		//5. array values print

		int arr_1[]={10,20,30,40,50};

	System.out.print("array elements:");

		for(int i=0;i<arr_1.length;i++){

			System.out.print(arr_1[i]+" ");

				}
		
		










		}

	}