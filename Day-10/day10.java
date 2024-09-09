class day10{

	public static void main(String args[]){

		
	int temp;
		//1. print pattern


		for(int i=1;i<=4;i++){

			if(i==1||i==2){
			
			temp=7;
			for(int j=1;j<=i;j++){
				

				System.out.print(temp+"\t");
				temp--;

				}

			}
			if(i==3){
			temp=6;
			
			for(int j=1;j<=i;j++){
				

				System.out.print(temp+"\t");
				temp--;

				}

			}

			if(i==4){
			temp=4;
			
			for(int j=1;j<=i;j++){
				

				System.out.print(temp+"\t");
				temp--;

				}


			

				}

		System.out.println();
	

			}

	System.out.print("\n-------------------------------------\n");

		//2. print pattern

		for(int i=4;i>=1;i--){
		
			if(i==3||i==2||i==1){
			for(int k=3;k>=i;k--)

				System.out.print(" "+"\t");
				}

	
			for(int j=1;j<=i;j++){

				System.out.print(i+"\t");


				}

			System.out.println();
		
			}

	System.out.print("\n-------------------------------------\n");
		

		//3. print pattern
		
		int count;

		for(int i=4;i>=1;i--){
		

		if(i==4){
			count=1;

			for(int k=2;k<=i;k++){

				System.out.print(" "+"\t");

				}


		for(int j=4;j>=i;j--){
				
		System.out.print(count+"\t");
		
			}

		}


		
		else if(i==3){
		count=2;
		for(int k=2;k<=i;k++){

				System.out.print(" "+"\t");

				}

		
		for(int j=4;j>=i;j--){
				
		System.out.print(count+"\t");
		count--;
		
			}

		}



		else if(i==2){
		count=3;

			for(int k=2;k<=i;k++){

				System.out.print(" "+"\t");

				}
		

		for(int j=4;j>=i;j--){
				
		System.out.print(count+"\t");
		count--;
		
			}
		}



		else if(i==1){
		count=4;
		
		for(int k=2;k<=i;k++){

				System.out.print(" "+"\t");

				}

		
		for(int j=4;j>=i;j--){
				
		System.out.print(count+"\t");
		count--;
		
			}

		}

	
		System.out.println();

	}

	System.out.print("\n-------------------------------------\n");

	//4.print pattern
	int n=5;

	for(int i=4;i>=1;i--){

		int temp_2=n;
		if(i==1){
			
		System.out.print(i);
			}
		
		if(i==4 || i==3 ||i==2){
		for(int j=1;j<=i;j++){

			System.out.print(temp_2+"\t");
				temp_2--;
			
			
				}
			}
	
			n--;

			System.out.println();


		}








	}

}