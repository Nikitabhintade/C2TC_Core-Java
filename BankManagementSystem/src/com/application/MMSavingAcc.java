package com.application;

import com.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	private static final float minbal = 500;

	public MMSavingAcc() {}
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) 
	{
		super(accNo, accNm, accBal,isSalaried);
	}
	
	@Override
	public void withdraw(float accBal)
	{
		System.out.println("Dear Prajakta:\n	Your Saving Account Balance  are:"+accBal);

	}
	@Override
	public String toString() 
	{
		return "MMSavingAcc [Dear  User your minimum balance are : "+ minbal +"]";
	}

}