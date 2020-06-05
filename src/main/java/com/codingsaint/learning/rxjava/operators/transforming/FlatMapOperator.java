package com.codingsaint.learning.rxjava.operators.transforming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;

public class FlatMapOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FlatMapOperator.class);

	public static void main(String[] args) {
		Observable.fromIterable(RxUtils.postiveNumbers(10))
		   .flatMap(integer -> { return twice(integer);})
		   .subscribe(new DemoObserver());
	}
	
	public static Observable<Integer> twice(Integer integer) {
		return Observable.create(observableEmitter -> {
			if (!observableEmitter.isDisposed()) {
				observableEmitter.onNext(integer*2);
			} else {
				observableEmitter.onComplete();
			}
		});
	}

}
