package com.transactions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TransactionHistory  {
	private List<Transaction> transactions = new ArrayList<>();
    public synchronized void add(Transaction transaction) {
			transactions.add(transaction); 
		}
         public List<Transaction> getTransactions() {
			return new ArrayList<>(transactions); 
		}
}
	
