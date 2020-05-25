package sample;

public class TestPalin {

	public static void main(String[] args) 
	{
		
		int n=454,r,temp,sum=0;
		
		temp=n;
		
		while(n>0) 
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println(sum);
		
		if(sum==temp) {
			System.out.println("palin");
		}
		else {
			System.out.println("Not Palin");
		}
		
		
		
		
		
		
		
		

	}

}
