
public class CommissionEmployee_own extends Employee_own {

	//----------Declare------------
	private double grossSale;
	private double commissionRate;
	
	
	//--------Constuctors----------
    public CommissionEmployee_own(String name, int yearJoined, double basicSalary, double grossSale, double commissionRate){  // super 的也要写进来
    	super(name, yearJoined, basicSalary);			// super must at first line, need inside constuctor
    	this.grossSale = grossSale;
    	this.commissionRate = commissionRate;
    	
    }
    //-----------Getters-----------
    public double getGrossSale(){
    	return grossSale;
    }
    public double getCommissionRate(){
    	return commissionRate;
    }
    
    //-----------Setters-----------
    public void setGrossSale(double grossSale){
    	this.grossSale = grossSale;
    }
    public void setCommissionRate(double commissionRate){
    	this.commissionRate = commissionRate;
	}
	//-----------Calculate salary-----------
	public double calculateSalary(){
		return getBasicSalary() + grossSale * commissionRate;
	}
}
	
