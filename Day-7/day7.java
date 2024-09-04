class day7{

		public static void main(String soham[]){

		//1. print pattern

		for(int i=1;i<=4;i++){


			for(int j=1;j<=i;j++){

				System.out.print("*\t");
					
				
					}
		System.out.println();
			
	
			}


	System.out.print("\n-------------------------------------\n");

		//2. print pattern

		//first loop for the row=4

		for(int i=1;i<=4;i++){

			// second for loop to print the spaces

			for(int k=3;k>=i;k--){

				System.out.print(" "+"\t");
				
				}
		
			// third loop to print the star

			for(int j=1;j<=i;j++){

					System.out.print("*\t");

					}

			System.out.println();
			
	
				}


System.out.print("\n-------------------------------------\n");

		//3.print pattern 


		for(int i=4;i>=1;i--){

			for(int k=3;k>=i;k--){

				System.out.print(" "+"\t");
					}

			for(int j=1;j<=i;j++){

	
				System.out.print("*\t");

					}
			

		System.out.println();

		}












	System.out.print("\n-------------------------------------\n");
	
		//4. print pattern

		for(int i=4;i>=1;i--){


			for(int j=1;j<=i;j++){

				System.out.print("*\t");
					
				
					}
		System.out.println();

			}


		}




	}