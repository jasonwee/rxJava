package com.codingsaint.learning.rxjava.operators.combining;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;


public class CombiningLatestOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CombiningLatestOperator.class);
	private static List<Character> changeIt = new ArrayList<>();

	public static void main(String[] args) {
		LOGGER.info("CombiningLatest Operator");
		Observable observable = Observable.interval(1000, TimeUnit.MILLISECONDS);
		Observable observable1 = Observable.interval(2000, TimeUnit.MILLISECONDS);
		
		Observable.combineLatest(observable, observable1, (o, o2) -> {
			return "first: " + o.toString() + " second " + o2.toString();
		}).take(6).subscribe(new DemoObserver());
		
		RxUtils.sleep(10000);
	}

}
