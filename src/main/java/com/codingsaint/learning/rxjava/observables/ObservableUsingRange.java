package com.codingsaint.learning.rxjava.observables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.reactivex.Observable;

public class ObservableUsingRange {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ObservableUsingRange.class);

	public static void main(String[] args) {
		Observable.range(2, 10).subscribe(new DemoObserver());
		

	}

}
