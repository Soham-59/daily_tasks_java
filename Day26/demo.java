import java.util.*;
class demo{

	//DAY 26

	public static void main(String args[]){

		Scanner s1= new Scanner(System.in);

			//1. Write a Program to check whether the entered number is Abundant or not
			
			System.out.println("Enter a Number: ");

			int user_num=s1.nextInt();

			int count=0;
			for(int i=1;i<=user_num;i++){

				if(user_num%i==0){

					count=count+i;
					
						}

				}
		if(count>user_num*2){

			System.out.println(user_num+" is Abundant Number.");
				}

		else{
			System.out.println(user_num+" is not Abundant Number.");


				}

		System.out.print("\n-----------------------------------------\n");

				//2. Write a Program to Convert entered Decimal Number to Octal Number




		System.out.print("\n-----------------------------------------\n");

				/*3. Write a Program to that skips the occurrence of perfect numbers using
continue statement. Print this sequence up to 100.*/

				int temp;

			System.out.print(1+" ");

				for(int i=2;i<=100;i++){

					temp=0;
					
					for(int j=1;j<i;j++){
		
						if(i%j==0){

							temp=temp+j;

								}

							}

					if(temp==i){

						continue;

							}

					else{

					System.out.print(i+" ");

						}


					}

		System.out.print("\n-----------------------------------------\n");


				//4. 

					int num;

			for(int i=1;i<=4;i++){


				for(int k=3;k>=i;k--){

					System.out.print(" \t");

					}
		
				if(i==1){
				
					System.out.print("=\t");

				}
				
				if(i==2){
				num=1;
				System.out.print("=\t");
				for(int j=2;j<=i;j++){
					
				System.out.print(num+"\t");

					}
				}

				if(i==3){
				num=1;
				System.out.print("=\t");

				for(int j=2;j<=i;j++){
					
				System.out.print(num+"\t");
				num++;
					}


				}

				if(i==4){
				num=1;
				System.out.print("=\t");

				for(int j=2;j<=i;j++){
					
				System.out.print(num+"\t");
				num++;
					}


				}
		System.out.println();

			}
		//end of for looop

		System.out.print("\n-----------------------------------------\n");

			/*5. pWrite a Program that takes an array as
input from user and prints the array in reverse order.*/

			System.out.println("Enter size of array: ");

			int size=s1.nextInt();

			int arr[]=new int[size];

			System.out.println("Enter elements of array: ");


			for(int i=0;i<size;i++){

				arr[i]=s1.nextInt();

				}

			System.out.println("Reversed array is : ");

				for(int i=size-1;i>=0;i--){

				System.out.println(arr[i]+" ");

				}



		}


	}