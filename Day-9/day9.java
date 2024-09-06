class day9{

	public static void main(String args[]){


	//1.print pattern

	for(int i=7;i>=4;i--){

		for(int j=7;j>=i;j--){

			System.out.print(j+"\t");
				}

		System.out.println();

			}

	System.out.print("\n----------------------------------------\n");

		//2.print pattern

			
	for(int i=1;i<=4;i++){

		for(int j=1;j<=i;j++){

			System.out.print(j+"\t");
				}

		System.out.println();

			}

	System.out.print("\n----------------------------------------\n");

	
		
		//3.print pattern
		

			for(int i=4;i>=1;i--){

				if(i%2==0){
					
				
				}

			else{
				char temp_2='a';

				for(int j=1;j<=i;j++){
				
					System.out.print(temp_2+"\t");
					temp_2++;

					}

			
		
				}

		System.out.println();

			}


	System.out.print("\n----------------------------------------\n");


		//4.print pattern

		for(int i=4;i>=1;i--){

			char temp_1='A';

				for(int j=1;j<=i;j++){
					
					System.out.print(temp_1+"\t");
					temp_1++;

					}

			System.out.println();

			}



		





		}

	}