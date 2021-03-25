class EvenOddAddition {
	public static void main(String[] args){
		
		int lowerLimit = Integer.parseInt(args[0]);
		int upperLimit = Integer.parseInt(args[1]);
		
		int countEven = 0;
		int countOdd = 0;
		
		for(int i = lowerLimit; i<=upperLimit;i++) {
				if(i%2==0) countEven++;
				else countOdd++;
		}

		int sum = 0;

		System.out.print("\n ");
		for(int i = lowerLimit, j=1; i<=upperLimit;i++) {
			if(i%2==0) {
				sum += i;
				
				if(j++ < countEven) 
					System.out.print(i + " + ");
				else 
					System.out.print(i + " = " + sum);
			}
		}
		System.out.print("\n\n ");
		
		sum = 0;
		for(int i = lowerLimit, j=1; i<=upperLimit;i++) {
			if(i%2!=0) {
				sum += i;
								
				if(j++<countOdd)
					System.out.print(i + " + ");
				else 
					System.out.print(i + " = " + sum + "\n ");

			}
		}
	}
}