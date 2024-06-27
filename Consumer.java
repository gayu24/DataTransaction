package com.transactions;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    private final BlockingQueue<Transaction> queue;
    private final TransactionHistory transactionHistory;

	public Consumer(BlockingQueue<Transaction> queue, TransactionHistory transactionHistory) {
		this.queue = queue; 
		this.transactionHistory = transactionHistory; 
	}
 @Override
	public void run() {
		try {
			while (true) {
				
				Transaction transaction = queue.take();
             if (transaction.getTransactionID().equals("POISON_PILL")) {
					break; 
				}
           System.out.println("Consumed transaction: " + transaction);
           transactionHistory.add(transaction);
			}
		} catch (InterruptedException e) {
		
			Thread.currentThread().interrupt();

}
}
}