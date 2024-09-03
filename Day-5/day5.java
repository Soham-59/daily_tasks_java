import java.util.*;
class day5{


		public static void main(String args[]){
	
			 Scanner s1=new Scanner(System.in);
			// day-5

		//1. find greatest number
	System.out.println("Enter value of a:");

		int a=s1.nextInt();

	System.out.println("Enter value of b:");

		int b=s1.nextInt();

	System.out.println("Enter value of c:");

		int c=s1.nextInt();

			if(a>b && a>c){

			System.out.println(a+" is the greatest number ");

					}
			else if(b>a && b>c){

			System.out.println(b+" is the greatest number ");

				}

				else{

				System.out.println(c+" is the greatest number ");
					
					}

		System.out.print("\n----------------------------------\n");

		
			//2. find smallest number

			System.out.println("We use the three inputs from question 1");

			if(a<b && a<c){

			System.out.println(a+" is the smallest number ");

					}
			else if(b<a && b<c){

			System.out.println(b+" is the smallest number ");

				}

				else{

				System.out.println(c+" is the smallest number ");
					
					}
		System.out.print("\n----------------------------------\n");


			//3. program to find vowel and consonants

			System.out.println("Enter a character:");


			char one='a';
			
			System.out.println("Entered character is:"+one);


				if(one=='a'){

			System.out.println(one+" is a vowel ");
					
					}
				else if(one=='e'){

			System.out.println(one+" is a vowel ");
			
					}
				else if(one=='i'){

			System.out.println(one+" is a vowel ");
			
					}

				else if(one=='o'){

			System.out.println(one+" is a vowel ");
			
					}
				else if(one=='u'){

			System.out.println(one+" is a vowel ");
			
					}

		else{

		System.out.println(one+" is a Consonant");


			}

		System.out.print("\n----------------------------------\n");
	
		//4. print following pattern

			for(int i=1;i<=3;i++){

				for(int j=1;j<=5;j++){
				
					if(j%2==0){

						System.out.print("* ");

					}
					else{

						System.out.print("= ");


						}
				}

			System.out.println();

			
			}

		System.out.print("\n----------------------------------\n");

			//5. print following pattern

				int temp_1=1;
				int temp_2=2;

				for(int i=1;i<=3;i++){

				for(int j=1;j<=4;j++){
				
					if(j%2==1){

						System.out.print("* ");

					}
					else if(j%4==j){

						System.out.print(temp_1+" ");
							temp_1=temp_1+2;


						}
					else if(j%4==0){

						System.out.print(temp_2+" ");
							temp_2=temp_2+2;


						}





				}

			System.out.println();

			
			}


		
		
			

		




		}



	}
