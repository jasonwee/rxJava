package com.codingsaint.learning.rxjava.observables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class DemoObserver<T> implements Observer<T> {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoObserver.class);

	
	@Override
	public void onSubscribe(Disposable d) {
		// TODO Auto-generated method stub
		LOGGER.info("onSubscribe");
	}

	@Override
	public void onNext(T t) {
		// TODO Auto-generated method stub
		LOGGER.info("onNext -> {}", t);
	}

	@Override
	public void onError(Throwable e) {
		// TODO Auto-generated method stub
		LOGGER.info("onError {}", e.getMessage());
	}

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub
		LOGGER.info("onComplete");
	}

}
