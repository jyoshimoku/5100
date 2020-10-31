package hw6;

public class Dog extends Pet implements Boardable{

	private String size;
	private int smonth, sday, syear,emonth,eday,eyear;
	public Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.size=size;
	}
	
	public String getSize() {
		return size;
	}

	public String toString() {
		String str = "DOG:\r";
		str+= super.toString();
		str+= String.format("Size: %s", this.getSize());
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
	 
	 Dog a = new Dog("dsa", "dsd", "red","small");
	 a.setSex(2);
	 System.out.println(a);
	 a.setBoardStart(11, 24, 2020);
	 a.setBoardEnd(5, 11, 2021);
	 System.out.println(a.boarding(10, 16 , 2021));
	 System.out.println(a.boarding(10, 16 , 2020));
	 System.out.println(a.boarding(1, 16 , 2021));
}
	
	
	
	
}
