package com.codingsaint.learning.rxjava.operators.filtering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.observables.DemoObserver;

import io.reactivex.Observable;

public class DistinctOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DistinctOperator.class);

	public static void main(String[] args) {
		LOGGER.info("Distinct Operator");
		Observable.just(1, 2, 3, 2, 4,1,2,3,4,5)
		   .distinct()
		   .subscribe(new DemoObserver());

	}

}
