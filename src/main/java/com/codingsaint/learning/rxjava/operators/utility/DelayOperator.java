package com.codingsaint.learning.rxjava.operators.utility;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;

public class DelayOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DelayOperator.class);

	public static void main(String[] args) {
		LOGGER.info("Delay Operator");
		Observable.fromIterable(RxUtils.postiveNumbers(10))
		   .delay(2, TimeUnit.SECONDS)
		   .subscribe(new DemoObserver());
		RxUtils.sleep(5000);

	}

}
