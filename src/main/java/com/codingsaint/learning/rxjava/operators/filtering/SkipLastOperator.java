package com.codingsaint.learning.rxjava.operators.filtering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;

public class SkipLastOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SkipLastOperator.class);

	public static void main(String[] args) {
		LOGGER.info("SkipLast Operator");
		Observable.fromIterable(RxUtils.postiveNumbers(10))
		   .skipLast(5)
		   .subscribe(new DemoObserver());

	}

}
