class day8{


	public static void main(String args[]){


		//1. print pattern

		int count=1;

		for(int i=1;i<=4;i++){

			for(int j=1;j<=i;j++){


				System.out.print(count*count+"\t");

				count=count+1;

			
					}
		System.out.println();

		
			}

	System.out.print("\n-------------------------\n");
	
		//2. print pattern

		char a='A';
		for(int i=1;i<=4;i++){

			for(int j=1;j<=i;j++){


				System.out.print(a+"\t");

				a++;

			
					}
		System.out.println();

		
			}

	System.out.print("\n-------------------------\n");

		//3. print pattern
		
		for(int i=1;i<=4;i++){

			for(int j=1;j<=i;j++){


				System.out.print("01"+"\t");

				

			
					}
		System.out.println();

		
			}


	System.out.print("\n-------------------------\n");



		//4.print pattern

		for(int i=1;i<=4;i++){

			for(int j=1;j<=i;j++){

				if(j==2){

				System.out.print("="+"\t");

					}
				else{

					System.out.print("+"+"\t");

					}
				
				
				}

		System.out.println();

		
			}


	System.out.print("\n-------------------------\n");

		//5.print pattern

		for(int i=1;i<=4;i++){

			if(i%2==0){
				
				for(int j=1;j<=4;j++){

				System.out.print("="+"\t");
				

					}

				}

			else{

				for(int k=1;k<=4;k++){

				System.out.print("*"+"\t");
				

					}


				}

		System.out.println();

		
		}
		






	}



}