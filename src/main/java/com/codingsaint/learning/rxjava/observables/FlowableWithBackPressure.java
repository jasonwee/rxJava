package com.codingsaint.learning.rxjava.observables;

import java.util.concurrent.atomic.AtomicInteger;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;

public class FlowableWithBackPressure {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FlowableWithBackPressure.class);

	public static void main(String[] args) {
		Flowable<Integer> flowablePositiveNumbers = Flowable.fromIterable(RxUtils.postiveNumbers(1000_000))
		.repeat()
		.observeOn(Schedulers.newThread(), false, 5)
		.subscribeOn(Schedulers.newThread())
		.doOnNext(integer -> LOGGER.info("emitting integer -> {}", integer));
		
		flowablePositiveNumbers.subscribe(new Subscriber<Integer>() {
			
			private Subscription subscription;
			private AtomicInteger counter = new AtomicInteger(0);

			@Override
			public void onSubscribe(Subscription s) {
				// TODO Auto-generated method stub
				LOGGER.info("onSubscribe");
				subscription = s;
				subscription.request(5);
			}

			@Override
			public void onNext(Integer t) {
				// TODO Auto-generated method stub
				LOGGER.info("onNext -> {}", t);
				RxUtils.sleep(100);
				if (counter.incrementAndGet() % 5 == 0) {
					subscription.request(5);
				}
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				LOGGER.info("onError {}", t.getMessage());
			}

			@Override
			public void onComplete() {
				// TODO Auto-generated method stub
				LOGGER.info("onComplete");
			}
		});
		
		RxUtils.sleep(10000);

	}

}
