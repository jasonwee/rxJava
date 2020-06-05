package com.codingsaint.learning.rxjava.operators.filtering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class ElementAtOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ElementAtOperator.class);
	
	public static void main(String[] args) {
		LOGGER.info("ElementAt Operator");
		Observable.fromIterable(RxUtils.postiveNumbers(10))
		// or 4
		.elementAt(11).subscribe(new MaybeObserver<Integer>() {

			@Override
			public void onSubscribe(Disposable d) {
				LOGGER.info("onSubscribe");
			}

			@Override
			public void onSuccess(Integer t) {
				LOGGER.info("onSuccess {}", t);
			}

			@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				LOGGER.info("onError ", e.getMessage());
			}

			@Override
			public void onComplete() {
				LOGGER.info("onComplete");
				
			}
			
		});
	}

}
