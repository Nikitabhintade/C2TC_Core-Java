package framework;

public class  NormalAcc extends ShopAcc
{
	protected float deliveryCharges = 49;
	
	public NormalAcc() {}
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}
	
	@Override
	public void bookProduct(float charges)
	{
		
	}

	public float getDeliveryCharges() 
	{
		return deliveryCharges;
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}
}