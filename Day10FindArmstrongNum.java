package main1;

public class Day10FindArmstrongNum {
	public static void main(String[] args) {
		
		int no=371;
		int rem,sum=0;
		int temp=no;
		
		while(no>0) {
			rem=no%10;
			sum=(int) (sum+Math.pow(rem, 3));
			
			no=no/10;
		}
		
		    if(temp==sum)
		    	System.out.println("No is Armstrong");
		    else
		    	System.out.println("No is Not Armstrong");
	}

}
