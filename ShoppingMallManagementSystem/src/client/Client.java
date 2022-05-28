package client;

import application.GSNormalAcc;
import application.GSPrimeAcc;
import application.GSShopFactory;

public class Client
{
	public static void main(String[] args)
	{
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAcc(1189,"Swati", 499, true);
		gssfactory.getNewNormalAcc(2454,"Sujata", 899, 40);
		
		GSPrimeAcc gsprime = new GSPrimeAcc();
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharges();
		
		gsprime.bookProduct(8000);
		gsprime.toString();
		
		GSNormalAcc gsnormal = new GSNormalAcc();
		gsnormal.getAccNm();
		gsnormal.getAccNo();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharges();
		
		gsnormal.bookProduct(11000);
		gsnormal.toString();
	}
}