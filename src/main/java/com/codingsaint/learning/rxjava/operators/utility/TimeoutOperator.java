package com.codingsaint.learning.rxjava.operators.utility;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;

public class TimeoutOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TimeoutOperator.class);

	public static void main(String[] args) {
		LOGGER.info("Timeout Operator");
		Observable.timer(2, TimeUnit.SECONDS)
		.timeout(1, TimeUnit.SECONDS)
		.subscribe(new DemoObserver());
		
		RxUtils.sleep(3000);
		   


	}

}
