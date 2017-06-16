package com.CustomerDetails.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BankService {

	BankDao bankDao;

	public BankService() {
		bankDao = BankDao.instance;
	}

	public void createBank(Bank bank) {
		bankDao.getBanks().put(bank.getAccNo(), bank);
	}

	public Bank getBank(String accNo) {
		return bankDao.getBanks().get(accNo);
	}

	public Map<String, Bank> getBanks() {
		return bankDao.getBanks();
	}

	public List<Bank> getBankAsList() {
		List<Bank> bankList = new ArrayList<Bank>();
	bankList.addAll(bankDao.getBanks().values());
		return bankList;
	}



}