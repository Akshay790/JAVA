package java1;

public class Overloading {
	
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	
	public void mul(float a,float b)
	{
		System.out.println(a*b);
		
	}
	
	public void mul(double a,double b)
	{
		System.out.println(a*b);
	}

	public void mul(int a,float b)
	{
		System.out.println(a*b);
	}

	public static void main(String[] args){
		
		
		Overloading o=new Overloading();
		o.mul(8, 5);
		o.mul(788,757);
		o.mul(3.22,7.5);
		
	}


}
