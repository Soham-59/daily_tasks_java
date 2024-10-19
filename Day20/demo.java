import java.util.*;
class demo{

	public static void main(String args[]){

		Scanner s1= new Scanner(System.in);

	//1. print odd numbers upto user enterd number in reversed order

		System.out.println("Enter number :");
	
		int num=s1.nextInt();

		for(int i=num;i>=1;i--){

			if(i%2==1){

				System.out.print(i+" ");
				
				}
	
			}

	System.out.print("\n-----------------------------------------------------\n");

	//2. print even numbers upto user enterd number in reversed order


		int num_2=s1.nextInt();

		for(int i=num_2;i>=1;i--){

			if(i%2==0){

				System.out.print(i+" ");
				
				}
	
			}


	System.out.print("\n-----------------------------------------------------\n");

	
	//3. hours converted into seconds

		System.out.println("Enter Hours: ");

		int hours=s1.nextInt();

		int seconds=hours*60*60;

		System.out.print(hours+" hours is equal to seconds = "+seconds);


	System.out.print("\n-----------------------------------------------------\n");

	//4. print pattern

	for(int i=4;i>=1;i--){

		for(int j=1;j<=i;j++){

			if(j%2==1){


				System.out.print("+\t");

					}

			else if(j%2==0){

				System.out.print("=\t");


				}

			
				}
		System.out.println();


		}

	//5. print maximum element of an array and minimum

		System.out.println("Enter the size of array :");

		int size=s1.nextInt();

		int arr[]=new int[size];

		//user input array

		System.out.println("Enter the elements of array:");

		for(int i=0;i<size;i++){

		arr[i]=s1.nextInt();

			}

		// implementation

		int max=arr[0];

		for(int i=1;i<size;i++){

			if(arr[i]>max){

				max=arr[i];
			
				}

			}

		System.out.println("the maximum element in array is : "+max);

	System.out.print("\n-----------------------------------------------------\n");

	//6. print minimum element of user array

		System.out.println("Enter the size of array :");

		int length=s1.nextInt();

		int arr_1[]=new int[length];

		//user input array

		System.out.println("Enter the elements of array:");

		for(int i=0;i<length;i++){

		arr_1[i]=s1.nextInt();

			}

		// implementation

		int min=arr_1[0];

		for(int i=1;i<length;i++){

			if(arr_1[i]<min){

				min=arr_1[i];
			
				}

			}

		System.out.println("the maximum element in array is : "+min);





		}


}