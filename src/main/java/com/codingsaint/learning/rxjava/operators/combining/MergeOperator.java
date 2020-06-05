package com.codingsaint.learning.rxjava.operators.combining;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;

public class MergeOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MergeOperator.class);
	private static List<Character> changeIt = new ArrayList<>();

	public static void main(String[] args) {
		LOGGER.info("Merge Operator");
		Observable observable = Observable.fromIterable(RxUtils.shapes(5));
		Observable observable1 = Observable.fromIterable(RxUtils.postiveNumbers(5));
		
		Observable.merge(observable, observable1).subscribe(new DemoObserver());

	}

}
