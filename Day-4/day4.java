class day4{

	public static void main(String args[]){

	// day-4

	System.out.print("\n -------------------------------------------\n");

		// 1.print pattern  A C E G I
		int i;
			for(i=1;i<=5;i++){
	
	if(i==1){

		System.out.print("A ");

			}
		else if(i==2){

			System.out.print("C ");
		
			}

			else if(i==3){

				System.out.print("E ");
		
				}

				else if(i==4){

					System.out.print("G ");
				
					}


	else{

		System.out.print("I ");
			}
	
		}

	System.out.print("\n -------------------------------------------\n");

	
	//2. print pattern 1 4 27 16 125

			for(i=1;i<=5;i++){
	
				if(i%2==1){

					System.out.print(i*i*i+" ");
					
					}


				else{

					System.out.print(i*i+" ");


						}
	
		}

	System.out.print("\n -------------------------------------------\n");

		//3. print pattern using nested loop

		for(i=1;i<=3;i++){

			for(int j=1;j<=4;j++){


					System.out.print("* ");


					}
				System.out.println();

			
			}

	System.out.print("\n -------------------------------------------\n");

		//4. print pattern using nested loop

		
				for(i=1;i<=3;i++){

			for(int j=1;j<=4;j++){


					System.out.print("1 ");


					}
				System.out.println();

			
			}

	System.out.print("\n -------------------------------------------\n");

		//5. print pattern using nested loop


			for(i=1;i<=3;i++){

			for(int j=1;j<=4;j++){

				if(j%2==0){

					System.out.print("0 ");
						
					}

				else{

					System.out.print("1 ");
						
					}

						}
				
				System.out.println();

			
			}

				



		}



	}