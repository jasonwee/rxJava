package com.codingsaint.learning.rxjava.operators.utility;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class SkipWhileOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SkipWhileOperator.class);

	public static void main(String[] args) {
		LOGGER.info("SkipWhile Operator");
		Observable<Integer> positiveNumbers = Observable.fromIterable(RxUtils.postiveNumbers(10));
		
		positiveNumbers.skipWhile(integer -> {
			return integer < 4;
		}).subscribe(new DemoObserver());
		
	}

}
