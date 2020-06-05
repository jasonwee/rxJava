package com.codingsaint.learning.rxjava.operators.utility;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class AllOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AllOperator.class);

	public static void main(String[] args) {
		LOGGER.info("All Operator");
		Observable<Integer> positiveNumbers = Observable.fromIterable(RxUtils.postiveNumbers(10));
		positiveNumbers.all(
					integer -> integer > 5
		).subscribe(new SingleObserver<Boolean>() {

				@Override
				public void onSubscribe(Disposable d) {
					
				}

				@Override
				public void onSuccess(Boolean t) {
					LOGGER.info("Do all of the events are greater than 5 {}", t);
				}

				@Override
				public void onError(Throwable e) {
					
				}
				
		});
		
	}

}
