import java.util.*;
class demo{

	public static void main(String args[]){

		Scanner s1=new Scanner(System.in);

		//1.swap of two numbers

	System.out.println("Enter a first number:");
	int a=s1.nextInt();

	System.out.println("Enter a second number:");
	int b=s1.nextInt();

	System.out.print("before swap: "+a+" "+b+"\n");

	// using temp third variable

	int temp;
	temp=a;
	a=b;
	b=temp;

	System.out.print("after swap: "+a+" "+b);

System.out.print("\n-----------------------------------------------------\n");


		//2. kinetic energy formula=0.5*m*v*v
		System.out.println("Enter a Mass in kg :");
		int m=s1.nextInt();

		System.out.println("Enter a Velocity in m/s :");
		int v=s1.nextInt();

		System.out.print("Kinetic energy of an object is "+0.5*m*v*v);


System.out.print("\n-----------------------------------------------------\n");

		//3. print reminder and quotient

		System.out.println("Enter a number for divide:");
		int num=s1.nextInt();

		System.out.println("Enter a number divisor :");
		int num_2=s1.nextInt();

		int q=num/num_2;

		int rem=num%num_2;

		System.out.println("Quotient= "+q);

		System.out.println("Reminder= "+rem);

System.out.print("\n-----------------------------------------------------\n");

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
					count=7;
				for(int j=1;j<=i;j++){

				System.out.print(count+"\t");
				--count;
					}

					
				}

				else if(i==3){
					count=6;

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


System.out.print("\n-----------------------------------------------------\n");

		//5. print odd elements of array and even elements 
		int arr_size=6;

		int[] arr = new int[arr_size];
		
		System.out.println("Enter elements of array:");

		for(int i=0;i<6;i++){

			arr[i]=s1.nextInt();
			

			}

		
		System.out.print("Odd Elements: ");
		for(int i=0;i<6;i++){

			if(arr[i]%2==1){
	
				System.out.print(arr[i]+" ");

				}
		
			}

		System.out.println();
		
		System.out.print("Even Elements: ");
		for(int i=0;i<6;i++){

			if(arr[i]%2==0){
	
				System.out.print(arr[i]+" ");

				}
		
			}





		}



	}