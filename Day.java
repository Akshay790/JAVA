package java1;

public class Day {
	
	int DD,MM,YY;
	
	public Day()//default constructor
	{
		DD=14;
		MM=02;
		YY=1996;
	}

	public Day(int d,int m,int y)//parameterized
	{
		DD=d;
		MM=m;
		YY=y;
	}
	
	public String toString()//print
	{
		
		return(+DD+"/"+MM+"/"+YY);
		
	}
	
	public static void main(String[] args){
		
		
		Day a=new Day();//object create
		System.out.println(a.toString());
		Day b=new Day(30,11,2018);//new object create and pass value
		System.out.println(b.toString());
		
	}
	
	
}
