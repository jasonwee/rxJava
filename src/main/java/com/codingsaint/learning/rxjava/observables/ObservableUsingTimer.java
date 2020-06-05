package com.codingsaint.learning.rxjava.observables;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;

public class ObservableUsingTimer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ObservableUsingTimer.class);

	public static void main(String[] args) {
		Observable.timer(5, TimeUnit.SECONDS)
		  .subscribe(new DemoObserver());
		
		RxUtils.sleep(7000);

	}

}
