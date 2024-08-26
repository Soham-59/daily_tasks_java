class codex{

	public static void main(String args[]){
	
	
	// 1. check number is positive or negative
	int num=10;
	if(num==0){
	
		System.out.println("Number is Zero");
		}
	else if(num>0){

		System.out.println("Number is Positive");

		}
		else{
			System.out.println("Number is Negative");
			}

	System.out.println("--------------------------------------------");




	//2. check number is even or odd

	int temp=10;
	if(temp%2!=0){

	System.out.println("Number is odd");
		}
	else{

	System.out.println("Number is Even");
		}

	System.out.println("--------------------------------------------");



	
	//3. print 1-to 15 using for loop

	for(int i=1;i<=15;i++){

		System.out.println(i);

			}

	System.out.println("--------------------------------------------");




	//4. Reverse of 1-to 15

	for(int j=15;j>=1;j--){

	System.out.print(j+" ");

		}
	
	System.out.println();
	System.out.println("--------------------------------------------");




	//5. print odd numbers from 1 to 15
		// way-1
	for(int k=1;k<=15;k++){

		if(k%2==1){

	System.out.print(k+" ");
			}
			
		}
	System.out.println();
	System.out.println("--------------------------------------------");

		





	}



}