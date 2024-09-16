package com.xworkz.Rules.runner;

import com.xworkz.Rules.impl.BankRule;

public class BankRuleRunner {

	public static void main(String[] args) {

		
		BankRule bankRule=new BankRule();
		
		bankRule.AccountClosureRules();
		bankRule.AccountDormancy();
		bankRule.AccountHolderName();
		bankRule.ChequeClearance();
		bankRule.CorrectAccountNumber();
		bankRule.CustomerGrievanceRedressal();
		bankRule.FraudDetectionandAlerts();
		bankRule.InterestCalculation();
		bankRule.OverdraftProtection();
		bankRule.OverdraftProtection();
		bankRule.PrivacyandDataProtection();
		bankRule.SeeAccountHolderName();
		bankRule.LoanEligibility();
		
	
	}

}
