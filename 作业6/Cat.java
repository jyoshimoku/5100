package hw6;

public class Cat extends Pet implements Boardable{
	
	private String hairlength;
	private int smonth, sday, syear,emonth,eday,eyear;
	
	public Cat(String name, String ownerName, String color,String hairLength) {
		super(name, ownerName, color);
		this.hairlength=hairLength;
	}

	public String getHairLength() {
		return hairlength;
	}
	public String toString() {
		String str = "CAT:\r";
		str+= super.toString();
		str+= String.format("Hair: %s", this.getHairLength());
		return str;
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		this.sday=day;
		this.smonth=month;
		this.syear=year;
		System.out.println(String.format("The boarding start: %d/%d/%d",this.smonth,this.sday,this.syear));
		
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		this.eday=day;
		this.emonth=month;
		this.eyear=year;
		System.out.println(String.format("The boarding end: %d/%d/%d",this.emonth,this.eday,this.eyear));
		
		
	}

	@Override
	public boolean boarding(int month, int day, int year) {
		int stime = this.syear*10000+this.smonth*100+this.sday;
		int etime = this.eyear*10000+this.emonth*100+this.eday;
		int time = year*10000+month*100+day;
		while (time<=etime&&time>=stime) {
			return true;
			
		}
			return false;
	}
	
	
	
	 public static void main(String[] args)
    {
	 
	 Cat a = new Cat("dsa", "dsd", "red","short");
	 a.setSex(2);
	 System.out.println(a);
	 a.setBoardStart(11, 24, 2020);
	 a.setBoardEnd(5, 11, 2021);
	 System.out.println(a.boarding(10, 16 , 2021));
	 System.out.println(a.boarding(10, 16 , 2020));
	 System.out.println(a.boarding(1, 16 , 2021));
}
}
