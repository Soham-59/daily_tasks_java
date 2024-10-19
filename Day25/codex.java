import java.util.*;
class codex{
	
	public static void main(String args[]){

	Scanner s1= new Scanner(System.in);
	
	//1. check number of user where it is prime or not

	System.out.println("Enter a number: ");

	int user_num=s1.nextInt();

	int count=0;

	for(int i=2;i<user_num;i++){

		if(user_num%i==0){

			count=count+1;

			}

		}

	if(count>0){
	
		System.out.println(user_num+" is not prime numbers");
		}

	else{

		System.out.println(user_num+" is a prime numbers");


		}

	System.out.print("\n--------------------------------------------------\n");

		//2. 



	System.out.print("\n--------------------------------------------------\n");



		/*3. skip occuernce of numbers that are divisible by 7 using continue statement.print sequence upto 1 to 100*/


		for(int i=1;i<=100;i++){

			if(i%7==0){
				
			continue;
			}

		System.out.print(i+" ");

				}

	
	System.out.print("\n--------------------------------------------------\n");

		//4. print pattern
		char ch;

		for(int i=1;i<=4;i++){


		for(int k=3;k>=i;k--){

			System.out.print(" \t");

			}

		if(i==1){
				
		ch='D';
		for(int j=1;j<=i;j++){

			System.out.print(ch+"\t");
			}
		}

		else if(i==2){
				
		ch='C';
		for(int j=1;j<=i;j++){

		System.out.print(ch+"\t");
			ch++;
			}

		}

		else if(i==3){
				
		ch='B';
		for(int j=1;j<=i;j++){

		System.out.print(ch+"\t");
			ch++;
			}

		}

		else if(i==4){
				
		ch='A';
		for(int j=1;j<=i;j++){

		System.out.print(ch+"\t");
			ch++;
			}

		}

	System.out.println();

		}

	System.out.print("\n--------------------------------------------------\n");



		//5.print pattern

		int _count=1;

		for(int i=1;i<=4;i++){

			_count=1;

			for(int j=1;j<=4;j++){
				
			if(i==j ){
				_count=i;
			System.out.print("=\t");
		
				_count++;	
				}
			else {
				
				System.out.print(_count+"\t");
				_count++;

				}
			
			}

		System.out.println();
	

		}
	


		}

	}