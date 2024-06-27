package com.transactions;

import java.util.UUID;

public class Transaction {
	private String transactionID;
    private long timestamp;
    private String type;
    private double amount;

		public Transaction(String transactionID, long timestamp, String type, double amount) {
			this.transactionID = transactionID; 
			this.timestamp = timestamp; 
			this.type = type; 
			this.amount = amount; 
		}
          public String getTransactionID() {
			return transactionID;
		}

         public long getTimestamp() {
			return timestamp;
		}

	    public String getType() {
			return type;
		}

		public double getAmount() {
			return amount;
		}

	    @Override
		public String toString() {
			return "Transaction{" + "transactionID='" + transactionID + '\'' + ", timestamp=" + timestamp + ", type='"
					+ type + '\'' + ", amount=" + amount + '}';
		}
	
}
