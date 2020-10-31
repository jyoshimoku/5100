package hw6;

public class Pet {

	private String petname, ownername, color;
	protected int genderid;
	public static final int MALE=1;
	public static final int FEMALE=2;
	public static final int SPAYED=3;
	public static final int NEUTERED=4;
	//Constructor
	public Pet(String name, String ownerName, String color) {
		this.petname=name;
		this.ownername=ownerName;
		this.color=color;
	}
	
	public String getPetName() {
		return petname;
	}
	
	public String getOwnerName() {
		return ownername;
	}
	public String getColor() {
		return color;
	}
	
	public void setSex(int sexid) {
		this.genderid=sexid;
	}
	
	public String getSex() {
		if(genderid==MALE) {
		return "MALE";
		} else if (genderid==FEMALE) {
			return "FEMALE";
		} else if (genderid==SPAYED) {
			return "SPAYED";
		} else {
			return "NEUTERED";
		}
		
	}
	
	public String toString() {
		return String.format("%s owned by %s\rColor: %s\rSex: %s\r", this.getPetName(),this.getOwnerName(),this.getColor(),this.getSex());
	}
	
//	 public static void main(String[] args)
//	    {
//		 
//		 Pet a = new Pet("dsa", "dsd", "red");
//		 a.setSex(2);
//		 System.out.println(a);
//		 
//		 
//	    }
	
}
