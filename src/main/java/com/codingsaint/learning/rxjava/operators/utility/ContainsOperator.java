package com.codingsaint.learning.rxjava.operators.utility;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class ContainsOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ContainsOperator.class);

	public static void main(String[] args) {
		LOGGER.info("Contains Operator");
		Observable<Integer> positiveNumbers = Observable.fromIterable(RxUtils.postiveNumbers(10));
		positiveNumbers.contains(10).subscribe(new SingleObserver<Boolean>() {

				@Override
				public void onSubscribe(Disposable d) {
					
				}

				@Override
				public void onSuccess(Boolean t) {
					LOGGER.info("element present {}", t);
				}

				@Override
				public void onError(Throwable e) {
					
				}
				
		});
		
	}

}
