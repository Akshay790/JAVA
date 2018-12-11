package java1;

public class Date1 {
	
	int DD,MM,YY;
	
	public void getDate1(int d,int m,int y)
	{
		DD=d;
		MM=m;
		YY=y;
		//System.out.println(DD+"/"+MM+"/"+YY);
		
	}
	
	public void setDate()
	{
		
	
		//System.out.println(DD+"/"+MM+"/"+YY);
	}
	
	public static void main(String[] args)
	{
		
		Date1 d=new Date1();
		
		Date1 x=new Date1();
		x.getDate1(30,11,2018);
		
		
		
		x.setDate();
		
	}

}
