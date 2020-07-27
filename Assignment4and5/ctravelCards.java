package Assignment4and5;
interface Rewardable
{
	int reward(int amount);	
}
public class ctravelCards extends CARDS implements Rewardable {
	int rewardPoints;

	@Override
	public int reward(int amount) {	
		return 5*amount/100;
	}
	

}