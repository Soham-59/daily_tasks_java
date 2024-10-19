import java.util.*;
class codex{

	// Day -22 	

	public static void main(String args[]){
		
		Scanner s1= new Scanner(System.in);
	
		//1. print prime numbers from 1-100

		int temp=0;
		int num=1;

		System.out.print(num+"\t");

		for(int i=2;i<=100;i++){

			for(int j=2;j<i;j++){
	
				if(i%j==0){
					
					temp++;		
	
				}
	
			}
		if(temp==0){

			System.out.print(i+"\t");
			}
		temp=0;

		}
	
	System.out.print("\n--------------------------------------------\n");

		//2. binary to decimal converter

		


	System.out.print("\n--------------------------------------------\n");

	//3. convert feet distance into cenimeter(1 feet=30cm)
	
		System.out.println("Enter distance in feet :");

		int feet=s1.nextInt();

		int cmeter=feet*30;

		System.out.println("the feet is :"+feet+" and converted into centimeter :"+cmeter+" cm");


	System.out.print("\n--------------------------------------------\n");

		//4. print pattern
		
			int count=1;
			int num_1=7;

			for(int i=4;i>=1;i--){

				for(int j=1;j<=i;j++){


				System.out.print(num_1*count+"\t");
			
					count=count+1;


					}
				System.out.println();
		
				}



	System.out.print("\n--------------------------------------------\n");

		//5.create new array and copy into existing array

		int arr_1[]=new int[10];
	
		int arr_2[]=new int[5];

		System.out.println("Enter elements of an array: ");

		for(int k=0;k<5;k++){

			arr_2[k]=s1.nextInt();

			}
		for(int k=0;k<5;k++){

			arr_1[k]=arr_2[k];

			}

		for(int k=0;k<5;k++){

			System.out.println("New array: "+arr_2[k]);
			}

		for(int k=0;k<5;k++){

			System.out.println("Existing array: "+arr_1[k]);
			}


	


	System.out.print("\n--------------------------------------------\n");

		//6.check number is in array or not

		System.out.println("Enter the size of an array: ");

		int limit=s1.nextInt();

		int arr_3[]=new int[limit];
	
		int count_1=0;

		System.out.println("Enter the elements of an array:");

		for(int i=0;i<limit;i++){

			arr_3[i]=s1.nextInt();

				}


		System.out.println("Enter number: ");

		int user_num=s1.nextInt();

		for(int i=0;i<limit;i++){

			if(user_num==arr_3[i]){
				
				count_1++;

				}

			}
			if(count_1>0){

				System.out.println("Number Found");

				}
			else{
				System.out.println("Number Not Found");

			
				}


		}
	


	}