package asignment3;

import java.util.*;

class Student {
	private String name;
	private int id;
	public String getName() {
	    return name;    
	    }
	
     public void setName(String name) {
	    this.name=name;    
	    }
	    
	 public int getID() {
	        return id;    
	        }

	        public void setID(int id) {
	        this.id=id;    
	        }
	 public Student (String name, int id) {
		 this.name=name; 
		 this.id=id; 
	}       

class Course{
	private String name;
	private int numberOfStudent;
	private Student[] students;
	ArrayList <String> list = new ArrayList<String>();
	
	public ArrayList<String> getStudent(Student stu) {
	//	//Student student = new Student(student.getName(),453);
		list.add(stu.getName());
		return list;
	}
	
	public boolean isFull(int numberOfStudent) {
		if (numberOfStudent<10) {
			return false;
		}
		else {
			return true;
		}
	}
	public String getName() {
	    return name;    
	    }
	public void setName(String name) {
	    this.name=name;    
	    }
	    
	 public int getNumberOfStudent() {
	        return numberOfStudent;    
	        }

	        public void setNumberOfStudent(int numberOfStudent) {
	        this.numberOfStudent=numberOfStudent;    
	        }
	   	 public Course (String name, int numberOfStudent) {
			 this.name=name; 
			 this.numberOfStudent=numberOfStudent;
		}   
	
	
	public void registerStudent (Student student) {
        if (isFull(numberOfStudent) ){
           // students[numberOfStudent] = student;
            System.out.println("Class is full");
         }  else {
         //	list.add(student.getName());
        	this.getStudent(student);
            numberOfStudent++;
            System.out.println("Student registered succcessfully");
        	 

         }
	}
	
}


public class Main {
	
	public static void main(String[] args) {
    Student a = new Student("xzm", 01) ;
    Student b = new Student("tom", 25) ;
    Student c = new Student("jax", 66) ;	
    Course A = new Course("math", 0);
    Course B = new Course("Chinese", 0);
    A.registerStudent(a);
    B.registerStudent(c);
    A.registerStudent(b);
    System.out.println(A.list.size());
    System.out.println(A.list.toString());
	}

}
