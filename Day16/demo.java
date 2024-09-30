import java.util.*;

class demo{

	public static void main(String args[]){

		//1. check perfect number or not
		
		Scanner s1= new Scanner(System.in);


		System.out.println("Enter a number: ");
		int num=s1.nextInt();
		int temp=0;

		for(int i=1;i<num;i++){

			if(num%i==0){

			temp=temp+i;

				}

			}
		
		
		if(temp==num){
			
			System.out.println(num+" is a perfect number.");
			}
		else{

			System.out.println(num+" is a not perfect number.");

			}

	System.out.print("\n---------------------------------------------\n");

	//2. print series of factorial eg.1-5

		System.out.println("Enter a starting number: ");
		int a=s1.nextInt();

		System.out.println("Enter a ending number: ");
		int b=s1.nextInt();
		
		int count=1;
		
		if(a==0){

			System.out.println("Factorial of: "+a +" is: 1");
			}

		else if(b==0){

			System.out.println("Factorial of: "+b +" is: 1");

			}

		else{

			for(int i=a;i<=b;i++){

				count=1;

				for(int j=1;j<=a;j++){

					count=count*j;

					
					}

			System.out.println("Factorial of: "+a +" is: "+count);
				a=a+1;

				}

	
		}

	System.out.print("\n---------------------------------------------\n");

		//3. implement v=ir 

		System.out.println("Enter a current (I): ");
		int i=s1.nextInt();

		System.out.println("Enter a resistance(R): ");
		int r=s1.nextInt();

		System.out.println("The voltage is v:"+i*r);

	System.out.print("\n---------------------------------------------\n");

	//4. print pattern

		int temp_1=1;

		for(int k=1;k<=4;k++){

				

				for(int j=1;j<=k;j++){

					System.out.print(temp_1*temp_1*temp_1+"\t");
					temp_1=temp_1+1;
					
					}
				System.out.println();
				
			
			}

	System.out.print("\n---------------------------------------------\n");

		//5. print minimum between three numbers

		System.out.println("Enter a first number: ");
		int n1=s1.nextInt();

		System.out.println("Enter a second number: ");
		int n2=s1.nextInt();

		System.out.println("Enter a third number: ");
		int n3=s1.nextInt();

		if(n1<n2 && n1<n3){
				System.out.println("From three numbers "+n1+" "+n2+" "+n3+" minimum number is: "+n1);
			
			}
		else if(n2<n1 && n2<n3){
				System.out.println("From three numbers "+n1+" "+n2+" "+n3+" minimum number is: "+n2);
			
			}

		else if(n3<n1 && n3<n2){
				System.out.println("From three numbers "+n1+" "+n2+" "+n3+" minimum number is: "+n3);
			
			}

		




	
		}

	}