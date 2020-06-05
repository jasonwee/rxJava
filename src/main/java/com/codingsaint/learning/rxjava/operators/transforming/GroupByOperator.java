package com.codingsaint.learning.rxjava.operators.transforming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.models.Shape;
import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.observables.GroupedObservable;
import io.reactivex.schedulers.Schedulers;

public class GroupByOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GroupByOperator.class);

	public static void main(String[] args) {
		Observable.fromIterable(RxUtils.shapes(20))
		   .groupBy(new Function<Shape, Object>() {

			@Override
			public Object apply(Shape shape) throws Exception {
				return shape.getShape();
			}
		}).observeOn(Schedulers.newThread())
		   .subscribe(new Observer<GroupedObservable<Object, Shape>>() {

			@Override
			public void onSubscribe(Disposable d) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onNext(GroupedObservable<Object, Shape> t) {
				LOGGER.info("key {}", t.getKey());
				t.subscribe(new DemoObserver());
			}

			@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onComplete() {
				// TODO Auto-generated method stub
				
			}
		});
		RxUtils.sleep(10000);

	}

}
