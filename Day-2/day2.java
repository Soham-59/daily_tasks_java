class codex{

	public static void main(String codex[]){

		// Day-2

			//1. print 1-10 using while loop
			System.out.println("print Numbers 1-10 using while loop");

			int i=1;
		while(i<=10){

			System.out.print(i+" ");
			i++;

				}

	System.out.print("\n---------------------------------------\n");

		//2.print even numbers from 1-20 use while loop
		
		System.out.println("print Even Numbers 1-10 using while loop");

		int count=1;
		while(count<=20){

			if(count%2==0){

			System.out.print(count+" ");

					}

			count++;


				}

	System.out.print("\n---------------------------------------\n");

		System.out.println("print Odd Numbers 1-10 using while loop");
		
		//2.print odd numbers from 1-20 use while loop
		int j=1;
		while(j<=20){

			if(j%2==1){

			System.out.print(j+" ");

					}

			j++;


				}


	System.out.print("\n---------------------------------------\n");

		//3. print number divisible by 3 and 7 from 1-20

			System.out.println("Number Divisible by 3 and 7");
		
			for(i=1;i<20;i++){
			
			if(i%3==0 && i%7==0){

			System.out.print(i+" ");

				}

					}

	System.out.print("\n---------------------------------------\n");

		//4. print number divisible by 3 and 7 from 1-20


			System.out.println("Number Divisible by 3 or 7");

			for(i=1;i<20;i++){
			
			if(i%3==0 || i%7==0){

			System.out.print(i+" ");

				}

					}

	System.out.print("\n---------------------------------------\n");

		//5. print number divisible by 3 and 7 from 1-20 using while Loop

			System.out.println("Number Divisible by 3 and 7 using While Loop");

			
		i=1;
			while(i<=20){

				if(i%3==0 && i%7==0){

			System.out.print(i+" ");

				}
			i++;



			}

	System.out.print("\n---------------------------------------\n");







	}


	}