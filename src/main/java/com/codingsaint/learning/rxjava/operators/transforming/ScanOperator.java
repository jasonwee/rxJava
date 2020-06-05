package com.codingsaint.learning.rxjava.operators.transforming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;

public class ScanOperator {
	private static final Logger LOGGER = LoggerFactory.getLogger(ScanOperator.class);

	public static void main(String[] args) {
		Observable.fromIterable(RxUtils.postiveNumbers(10))
		   .scan((t1, t2) -> { return t1+t2; })
		   .subscribe(new DemoObserver());
	}
}
