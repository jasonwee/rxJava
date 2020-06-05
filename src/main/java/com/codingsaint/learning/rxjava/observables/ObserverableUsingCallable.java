package com.codingsaint.learning.rxjava.observables;

import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.reactivex.Observable;

public class ObserverableUsingCallable {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ObserverableUsingCallable.class);

	public static void main(String[] args) {
		
		Callable<String> callable = new Callable<String>() {

			@Override
			public String call() throws Exception {
				return doSomething();
			}
		};
		
		Observable.fromCallable(callable).subscribe(new DemoObserver());

	}
	
	public static String doSomething() {
		try {
			LOGGER.info("sleeping 2 secs");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "hi";
	}

}
