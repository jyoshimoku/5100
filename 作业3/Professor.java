package asignment3;

public class Professor {
	private String firstName;
    private String lastName;
    private String id;
    
    private int age;
    private String phone;
    private String address;
    
    public static class Builder {
    	private String firstName;
        private String lastName;
        private String id;
        
        private int age;
        private String phone;
        private String address;
        
        public Builder(String firstName, String lastName,String id) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
        }
        
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        
        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        
        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
      
        public Professor build() {
            return new Professor(firstName, lastName, id, age, phone, address);
        }
        
    }
    
    public Professor(String firstName, String lastName, String id, int age, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getid() {
        return id;
    }
    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
    
    
    
}

class Main {
	public static void main(String[] args) {
		
        Professor professor = new Professor.Builder("Xu", "Wang","201031")
                .setPhone("13039012715")
                .setAddress("Anhui").build();
                

    }
}