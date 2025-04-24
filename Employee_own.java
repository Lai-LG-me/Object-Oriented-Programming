public class Employee_own {

	//----------Declare------------
	private String name;
    private int yearJoined;
    private double basicSalary;
	
	
	//----------Constructor----------
    public Employee_own(String name, int yearJoined, double basicSalary) {
    	this.name = name;
    	this.yearJoined = yearJoined;
    	this.basicSalary = basicSalary;
    }
    //------------Getter--------------
    public String getName(){
    	return name;
    }
    public int getYearJoined(){
    	return yearJoined;
    }
    public double getBasicSalary(){
    	return basicSalary;
    }
    //------------Setter--------------
    public void setBasicSalary(){
    	this.basicSalary = basicSalary;
    	
    }
    
    
}
