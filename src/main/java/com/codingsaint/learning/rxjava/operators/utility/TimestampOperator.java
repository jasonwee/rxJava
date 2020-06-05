package com.codingsaint.learning.rxjava.operators.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;

public class TimestampOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TimestampOperator.class);

	public static void main(String[] args) {
		LOGGER.info("Timestamp Operator");
		Observable.fromIterable(RxUtils.shapes(10))
		.timestamp()
		.subscribe(new DemoObserver());
		   


	}

}
