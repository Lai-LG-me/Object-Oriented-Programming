//haven't finish 
// For the SavingsAccount class, include statements 
// to test the methods for 
// calculating the interest amount and adding the interest to the balance.

public class SavingsAccount_own extends Account_own {
		private double interest_rate = 0.05;
			
		public SavingsAccount_own(String accountNum, double balance){		
			super(accountNum, balance);
		}
		
		//----------Getter----------------
		public double getInterestRate(){
			return interest_rate;
		}
		//----------Setter----------------
		public void setInterestRate(double interest_rate){
			this.interest_rate = interest_rate;
		}
		
		//----------Calculate interest amount----------------
		public double CalculateInterestAmount(){
			return (getBalance() * interest_rate / 12);		// the interest rate is per year , /12 for per month
		}


}
