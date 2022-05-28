package com.customer;

import com.application.MMBankFactory;
import com.application.MMCurrentAcc;
import com.application.MMSavingAcc;

public class Customer {
	public static void main(String[] args) 
	{
		MMBankFactory mmbfactory = new MMBankFactory();
		mmbfactory.getNewSavingAcc(8, "Nikita", 13721, true);
		mmbfactory.getNewCurrentAcc(17, "Prajakta", 7990, 15000);
		
		MMSavingAcc mmsaving = new MMSavingAcc();
		mmsaving.getAccNo();
		mmsaving.getAccNm();
		mmsaving.getAccBal();
		
		mmsaving.withdraw(700);
		mmsaving.toString();
		
		MMCurrentAcc mmcurrent = new MMCurrentAcc();
		mmcurrent.getAccNo();
		mmcurrent.getAccNm();
		mmcurrent.getAccBal();
		mmcurrent.getCreditLimit();
		
		mmcurrent.withdraw(1100);
		mmcurrent.toString();
	}

}