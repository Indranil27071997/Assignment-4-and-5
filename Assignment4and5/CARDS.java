package Assignment4and5;

public abstract class CARDS {
	int CardNo=986547;
	double availableBalance=2000;
	double swipeLimit=250;
	public Object rewardPoints;
		public boolean swipeCard(int amount)
		{ 
		if(amount<swipeLimit && amount<availableBalance)
			return true;
		else
			return false;
		}
	 public void rechargeCard(int amount)
	 { int availableBalance = 0;
		 int x=amount+availableBalance;
	 }
	public Object reward(int amount) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
