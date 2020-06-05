package com.codingsaint.learning.rxjava.operators.filtering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;

public class SkipOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SkipOperator.class);

	public static void main(String[] args) {
		LOGGER.info("Skip Operator");
		Observable.fromIterable(RxUtils.postiveNumbers(10))
		   .skip(5)
		   .subscribe(new DemoObserver());

	}

}
