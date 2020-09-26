package xzm;

import java.util.ArrayList;

import test2.Employee;
import test2.Gender;
import test2.calculate;

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month
    double tripleSalary;
    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
    this.name=name; 
    this.age=age;
    this.gender=gender;
    this.salary=salary;
    }

    // Getter for `name`. Return the current `name` data
    public String getName() {
    return name;    
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
    this.name=name;    
    }
    
    public double getSalary() {
    return salary;
    }
    
    public void setSalary(double salary) {
    	this.salary = salary;
    }
    public double raiseSalary (double salary) {
    	return(tripleSalary= salary*3);
    }
}

enum Gender {
    MALE,
    FEMALE;
}

public class EmployeeSalaryCalculate {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public static double socialSecurityTax(Employee employee) {
    	double socialSecurityTax;
       if ( employee.salary > 8900) {
    	   socialSecurityTax=106800*0.062;
       } 
       else {
    	   socialSecurityTax= employee.salary*0.062;
       }
       System.out.println(employee.getName()+"'s"+" "+"social security tax is"+socialSecurityTax);
       return socialSecurityTax ;
    }
    
    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public static double insuranceCoverage(Employee employee) {
       double insuranceCoverage;
       if (employee.age < 35){
    	   insuranceCoverage= employee.salary*0.03;
       }
       else if (employee.age>=50 && employee.age <=35) {
    	   insuranceCoverage= employee.salary*0.04;
       }
       else if (employee.age>50 && employee.age <60) {
    	   insuranceCoverage= employee.salary*0.05;
       }
       else {
    	   insuranceCoverage= employee.salary*0.06;
       }
       System.out.println(employee.getName()+"'s"+" "+"insurance coverage is"+insuranceCoverage);
       return insuranceCoverage;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public static void sortSalary(Employee e1, Employee e2, Employee e3) {
    	double a = e1.salary;
		double b = e2.salary;
		double c = e3.salary;
    	if (a > b) {
    		a = a + b;
    		b = a - b;
    		a = a - b;
    		}
    		if (b > c) {
    		b = b + c;
    		c = b - c;
    		b = b - c;
    		}
    		if (a > b) {
    		a = a + b;
    		b = a - b;
    		a = a - b;
    		}
    	

    		System.out.println(a+" "+b+" "+c);
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public static void tripleSalary(Employee employee) {
    	 System.out.println(employee.getName() + "'s"+" "+"triple salary is"+employee.raiseSalary(employee.salary)); //write your code here
    }

    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     Because x and y, they are both references to objects, not really a and b.
      write your understanding here.
    */
    public static void main(String[] args) {
    	ArrayList<Employee> list = new ArrayList<Employee>();
		 list.add(new Employee("Jenny", 20, Gender.FEMALE, 2000));
		 list.add(new Employee("John", 30, Gender.MALE, 2500));
		 list.add(new Employee("Tom", 35, Gender.MALE, 3000.2));
		 list.add(new Employee("James", 50, Gender.MALE, 3000.5));
		 list.add(new Employee("Isaac", 65, Gender.MALE, 9000));
		 
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        Employee e1 = new Employee("Tom", 35, Gender.MALE, 3000.2);
        Employee e2 = new Employee("James", 50, Gender.MALE, 3000.5);
        Employee e3 = new Employee("Isaac", 65, Gender.MALE, 9000);
        for (Employee e : list) {
        	EmployeeSalaryCalculate.socialSecurityTax(e);
        	EmployeeSalaryCalculate.insuranceCoverage(e);
        	EmployeeSalaryCalculate.tripleSalary(e);
		}
        
        
        EmployeeSalaryCalculate.sortSalary(e1, e2, e3);
        
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
    	Employee temp = new Employee(x.name,x.age,x.gender,x.salary);
		x.setName(y.name);
		y.setName(temp.name);
    }
}