class day6{

		public static void main(String soham[]){

		//1. print 2nd higher number
	int a=30;
	
	int b=10;

	int c=20;
		if(a>b&& a>c){
			if(b>c){
			
			System.out.print(b+"second highest number.");
				}
			else{
	
				System.out.print(c+"second highest number.");

					}
				
			}

		else if(b>a&& b>c){
			if(a>c){
			
			System.out.print(a+"second highest number.");
				}
			else{
	
				System.out.print(c+"second highest number.");

					}
				
			}
	
		else if(c>a&& c>b){
			if(a>b){
			
			System.out.print(a+"second highest number.");
				}
			else{
	
				System.out.print(b+"second highest number.");

					}
				
			}






	
	System.out.print("\n----------------------------------\n");


		//2. print grades based on marks

		int student_1=87;
		
		if(student_1>=90 && student_1<=100){

			System.out.println("A");
			
				}
		else if(student_1>=80 && student_1<=89){

			System.out.println("B");
			
				}

		else if(student_1>=70 && student_1<=79){

			System.out.println("C");
			
				}

		 else if(student_1>=60 && student_1<=69){

			System.out.println("D");
			
				} 

		else if(student_1>=50 && student_1<=59){

			System.out.println("F");
			
				}
		else{
			
			}

		System.out.print("\n----------------------------------\n");

		int temp=1;

		//3. print pattern
		for(int i=1;i<=3;i++){

				for(int j=1;j<=4;j++){

				System.out.print(temp+" ");
				temp=temp+1;
					

					}

			System.out.println();


				}


	System.out.print("\n----------------------------------\n");

		//4. print pattern
			char z='A';

			for(int i=1;i<=3;i++){

				for(int j=1;j<=4;j++){

				System.out.print(z+" ");
				z++;
					

					}

			System.out.println();


				}

	System.out.print("\n----------------------------------\n");

		//5. print right angle triangle

			for(int i=1;i<=4;i++){

				for(int j=1;j<=i;j++){

				System.out.print("* ");
					
					}
			System.out.println();

				}
	System.out.print("\n----------------------------------\n");


		//6. print pattern 
			int temp_2=1;

			for(int i=1;i<=4;i++){

				for(int j=1;j<=i;j++){

				System.out.print(temp_2+" ");
					temp_2=temp_2+1;
					
					}
			System.out.println();

				}
	System.out.print("\n----------------------------------\n");


		//7. print pattern

		for(int i=1;i<=4;i++){

				for(int j=1;j<=1;j++){

				System.out.print("A B C D");
		
					}

			System.out.println();

			}
	
	System.out.print("\n----------------------------------\n");

		//8. print pattern

		int count=1;
			for(int i=1;i<=3;i++){

				for(int j=1;j<=4;j++){

				System.out.print(count+" ");
				count=count+2;
					

					}

			System.out.println();


				}


















}



	}