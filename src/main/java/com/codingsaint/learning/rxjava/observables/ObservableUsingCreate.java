package com.codingsaint.learning.rxjava.observables;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.models.Shape;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public class ObservableUsingCreate {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ObservableUsingCreate.class);
	
	public static void main(String[] args) {
		List<Shape> shapes = RxUtils.shapes(15);
		
		
		Observable.create(new ObservableOnSubscribe<Object>() {

			@Override
			public void subscribe(ObservableEmitter<Object> emitter) throws Exception {
				try {
					shapes.forEach(emitter::onNext);
				} catch (Exception e) {
					emitter.onError(e);
				}
				emitter.onComplete();
			}
			
		}).subscribe(new DemoObserver());

	}

}
