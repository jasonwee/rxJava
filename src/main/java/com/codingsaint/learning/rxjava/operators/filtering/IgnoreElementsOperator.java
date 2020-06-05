package com.codingsaint.learning.rxjava.operators.filtering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class IgnoreElementsOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(IgnoreElementsOperator.class);

	public static void main(String[] args) {
		LOGGER.info("IgnoreElements Operator");
		Observable.fromIterable(RxUtils.primeNumbers(10))
		.ignoreElements()
		.subscribe(new CompletableObserver() {
			
			@Override
			public void onSubscribe(Disposable d) {
				LOGGER.info("onSubscribe");
			}
			
			@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				LOGGER.info("onError");
			}
			
			@Override
			public void onComplete() {
				// TODO Auto-generated method stub
				LOGGER.info("onComplete");
				
			}
		});

	}

}
