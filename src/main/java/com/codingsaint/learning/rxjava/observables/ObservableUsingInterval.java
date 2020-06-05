package com.codingsaint.learning.rxjava.observables;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;

public class ObservableUsingInterval {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ObservableUsingInterval.class);
	
	public static void main(String[] args) {
		Observable.interval(1, TimeUnit.SECONDS)
		  .subscribe(new DemoObserver());
		
		RxUtils.sleep(3000);
	}
	
}
