package com.transactions;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TransactionProcessor {
	public static final int NUM_CONSUMERS = 7;
    public static void main(String[] args) {
		
		BlockingQueue<Transaction> queue = new LinkedBlockingQueue<>();

		TransactionHistory transactionHistory = new TransactionHistory();

        Thread producerThread = new Thread(new Producer(queue));
		producerThread.start();

		for (int i = 0; i < NUM_CONSUMERS; i++) {
			Thread consumerThread = new Thread(new Consumer(queue, transactionHistory));
			consumerThread.start();
		}
	}
}
