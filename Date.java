package java1;

public class Date {
	
	int DD,MM,YY;
	public  Date(int dd,int mm,int yy)
	{
		 DD=dd;
		 MM=mm;
		 YY=yy;
		 
	}
	
	
	
	public void PrintDate()
	{
		System.out.println(DD+"/"+MM+"/"+YY);
	}
	
	
	
	
	
	/*public void getDate()
	{
		 DD=14;
		 MM=02;
		 yy=2018;
		 
		System.out.println();
	}
	*/
	
	public static void main(String[] args){
		
		Date d=new Date(10,10,2018);
		d.PrintDate();
	}
	
	
	


}
