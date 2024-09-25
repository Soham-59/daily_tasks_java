import java.util.*;
class demo{

	public static void main(String args[]){

		Scanner s1=new Scanner(System.in);

	
	//1. print odd numbers between two numbers given by user

	
	System.out.println("Enter a first number:");
	int min=s1.nextInt();

	System.out.println("Enter a second number:");
	int max=s1.nextInt();

	System.out.print("Series of odd numbers ranging between "+min+" & "+max+" is :");

	for(int i=min;i<max;i++){

		if(i%2==1){

		System.out.print(i+" ");
			}


			}

	System.out.print("\n---------------------------------------------------\n");

	//2. Swapping of numbers

		System.out.println("Enter a first number:");
	int a=s1.nextInt();

	System.out.println("Enter a second number:");
	int b=s1.nextInt();

	System.out.print("before swap: "+a+" "+b+"\n");

	// using temp 

	int temp;
	temp=a;
	a=b;
	b=temp;

	System.out.print("after swap: "+a+" "+b);
	

	System.out.print("\n---------------------------------------------------\n");
	

	//3. cube and squares upto user number even

		System.out.println("Enter a number:");
	int num=s1.nextInt();

		for(int i=1;i<=num;i++){

			if(i%2==0){

			System.out.print("cube of "+i+" is :"+i*i*i+" and square of "+i+" is :"+i*i+"\n");

				}

			}


	System.out.print("\n---------------------------------------------------\n");

		//4.print pattern

		for(int i=1;i<=5;i++){
			if(i%2==1){

				for(int j=1;j<=i;j++){

				System.out.print("a\t");
					
				}

			}
			else{
			
				for(int j=1;j<=i;j++){

				System.out.print("A\t");
					
				}

		}
	System.out.println();
	}

	System.out.print("\n---------------------------------------------------\n");

		//5. print maximum two numbers of user
		
		System.out.println("Enter a number:");
		int n1=s1.nextInt();

		System.out.println("Enter a number:");
		int n2=s1.nextInt();

		if(n1>n2){
		
			System.out.println("Maximum number between"+n1+" "+n2+" is "+n1);
			}
		else{

			System.out.println("Maximum number between"+n1+" "+n2+" is "+n2);


			}







		}

	}