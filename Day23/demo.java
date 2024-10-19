import java.util.Scanner;
class demo{


	public static void main(String args[]){

			// DAY 23

		//1 program 1:== fibonaci number series upto 5 numbers

			int n1=0;
			int n2=1;

			int n3;

			System.out.print(n1+" "+n2+" ");

			for(int i=3;i<=5;i++){

				n3=n1+n2;

				System.out.print(n3+" ");

				n1=n2;

				n2=n3;

					}
		
		System.out.print("\n-----------------------------------------\n");

		
		/*3. program ==3 Write a Program to that skips the occurrence of numbers that are divisible
by 2 using continue statement. Print this sequence up to 100. */

					for(int i=1;i<=100;i++){

						if(i%2==0){

						continue;

							}

						else{

						System.out.print(i+" ");

							}


						}

		System.out.print("\n-----------------------------------------\n");

			//4. print pattern

			char ch;

			for(int i=4;i>=1;i--){

				if(i==4){
					
					ch='a';
				
				for(int j=1;j<=i;j++){

					System.out.print(ch+"\t");

						ch++;

						}

					}

				if(i==3){
					
					ch='c';
				
				for(int j=1;j<=i;j++){

					System.out.print(ch+"\t");

						ch++;

						}

					}


				if(i==2){
					
					ch='e';
				
				for(int j=1;j<=i;j++){

					System.out.print(ch+"\t");

						ch++;

						}

					}

				if(i==1){
					
					ch='g';
				
				for(int j=1;j<=i;j++){

					System.out.print(ch+"\t");

						}

					}
				System.out.println();
			
				}

		System.out.print("\n-----------------------------------------\n");

				//5. print pattern

				int num;

					for(int i=1;i<=4;i++){
						
						for(int k=3;k>=i;k--){

							System.out.print(" \t");

							}
				if(i==1){
					
					num=4;
				
				for(int j=1;j<=i;j++){

					System.out.print(num+"\t");

						}

					}

				if(i==2){
					
					num=3;
				
				for(int j=1;j<=i;j++){

					System.out.print(num+"\t");

					num++;

						}

					}

				if(i==3){
					
					num=2;
				
				for(int j=1;j<=i;j++){

					System.out.print(num+"\t");

					num++;

						}

					}

				if(i==4){
					
					num=1;
				
				for(int j=1;j<=i;j++){

					System.out.print(num+"\t");

					num++;

						}

					}


			System.out.println();


				}




		}
	

	}