package com.codingsaint.learning.rxjava.operators.utility;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class TakeUntilOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TakeUntilOperator.class);

	public static void main(String[] args) {
		LOGGER.info("TakeUntil Operator");
		Observable singleSecond = Observable.interval(1, TimeUnit.SECONDS);
		Observable fiveSecond = Observable.interval(5, TimeUnit.SECONDS);
		singleSecond.takeUntil(fiveSecond).subscribe(new DemoObserver());
		RxUtils.sleep(15000);
		
	}

}
