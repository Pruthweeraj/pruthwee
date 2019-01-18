package com.infinite.executor_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	public static void main(String[] args) {

		PrintJob[] jobs = {	new PrintJob("Play"),
							new PrintJob("Sleep"),
							new PrintJob("Code"),
							new PrintJob("Eat"),
							new PrintJob("Drink"),
							new PrintJob("Immagin")	};
		
		// Starting Executer service
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		//assigning the job to the executorService
		for(PrintJob job: jobs){
			executorService.submit(job);
		}

		//After completing all jobs shutdown the executorService
		executorService.shutdown();
		
	}
}
