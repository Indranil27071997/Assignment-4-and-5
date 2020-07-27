package Assignment4and5;

import java.util.Random;
public class TestMedicine {
	public static void main(String args[])
	{
		Medicine med[]=new Medicine[5];
		//med[0].setPrice(200);
		med[0].setExpiryDate("4/09/98");
		med[1].setPrice(300);
		med[1].setExpiryDate("1/07/87");
		med[2].setPrice(400);
		med[2].setExpiryDate("05/06/03");
		med[3].setPrice(500);
		med[3].setExpiryDate("10/02/25");
		med[4].setPrice(600);
		med[4].setExpiryDate("6/3/13");
		Random rand = new Random();
		int num=rand.nextInt(4);
		if(num==0)
		{
			Medicine tab=new Tablet();
			tab.getDetails();
			tab.displaylabel();
		}
		else if(num==1)
		{
			Medicine syrup=new Syrup();
			syrup.getDetails();
			syrup.displaylabel();
		}
		else
		{
			Medicine ointment=new Ointment();
			ointment.getDetails();
			ointment.displaylabel();

		}
	}

}