package com.xworkz.Rules.impl;

import com.xworkz.Rules.media.Account;
import com.xworkz.Rules.media.Bank;

public class BankRule implements Bank, Account{
	
	public BankRule()
	{
		super();
		System.out.println("Ruuning no-args const in BankRule");
	}

	@Override
	public int LoanEligibility() {
		System.out.println("running LoanEligibility");
		return 0;
	}

	@Override
	public boolean FraudDetectionandAlerts() {
		System.out.println("running FraudDetectionandAlerts");
		return false;
	}

	@Override
	public String OverdraftProtection() {
		System.out.println("running LoanEligibility");
		return null;
	}

	@Override
	public String AccountDormancy() {
		System.out.println("running AccountDormancy");
		return null;
	}

	@Override
	public int InterestCalculation() {
		System.out.println("running InterestCalculation");
		return 0;
	}

	@Override
	public String AccountClosureRules() {
		System.out.println("running AccountClosureRules");
		return null;
	}

	@Override
	public String CustomerGrievanceRedressal() {
		System.out.println("running CustomerGrievanceRedressal");
		return null;
	}

	@Override
	public boolean PrivacyandDataProtection() {
		System.out.println("running PrivacyandDataProtection");
		return false;
	}

	@Override
	public int FeesandCharges() {
		System.out.println("running FeesandCharges");
		return 0;
	}

	@Override
	public int ChequeClearance() {
		System.out.println("running ChequeClearance");
		return 0;
	}

	@Override
	public String AccountHolderName() {
		System.out.println("running AccountHolderName");
		return null;
	}

	@Override
	public int CorrectAccountNumber() {
		System.out.println("running CorrectAccountNumber");
		return 0;
	}

	@Override
	public String SeeAccountHolderName() {
		System.out.println("running SeeAccountHolderName");
		return null;
	}
	
	

}
