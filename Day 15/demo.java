import java.util.*;
class demo{

	public static void main(String args[]){

		Scanner s1=new Scanner(System.in);

		//1. print even numbers between two numbers given by user

	
	System.out.println("Enter a first number:");
	int min=s1.nextInt();

	System.out.println("Enter a second number:");
	int max=s1.nextInt();

	System.out.print("Series of odd numbers ranging between "+min+" & "+max+" is :");

	for(int i=min;i<=max;i++){

		if(i%2==0){

		System.out.print(i+" ");
			}


			}

	System.out.print("\n---------------------------------------------------\n");

		//2 . print minimum number from user input

		
		System.out.println("Enter a number:");
		int n1=s1.nextInt();

		System.out.println("Enter a number:");
		int n2=s1.nextInt();

		if(n1<n2){
		
			System.out.println("Minimum number between"+n1+" and "+n2+" is "+n1);
			}
		else{

			System.out.println("Minimum number between"+n1+" and "+n2+" is "+n2);


			}

		//3.print velocity v=distance/time
		
		System.out.println("Enter a distance :");
		int distance=s1.nextInt();

		System.out.println("Enter a time :");
		int time=s1.nextInt();

		int velocity=distance/time;

		System.out.println("The velocity is : "+velocity+"m/s");


		//4. print pattern

			int temp=1;
		for(int i=1;i<=4;i++){

			for(int j=1;j<=i;j++){
				
			System.out.print(temp*temp+"\t");
			temp=temp+1;

			}
		System.out.println();

				}


		//5. 

		System.out.println("Enter a first number:");
		int n_1=s1.nextInt();

		System.out.println("Enter a second number:");
		int n_2=s1.nextInt();

		System.out.println("Enter a  third number:");
		int n_3=s1.nextInt();

		if(n_1>n_2 && n_1>n_3){
		
			System.out.println("Maximum number between"+n_1+" and "+n_2+" "+n_3+" is "+n_1);
			}
		else if(n_2>n_1 && n_2>n_3){

			System.out.println("Maximum number between"+n1+" and "+n_2+" "+ n_3+" is "+n_2);


			}
		else if(n_3>n_1 && n_3>n_2){

			System.out.println("Maximum number between"+n_1+" and "+n_2+" "+n_3+" is "+n_3);
 

				}







		}






	}