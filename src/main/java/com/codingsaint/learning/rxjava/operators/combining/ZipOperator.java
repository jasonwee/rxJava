package com.codingsaint.learning.rxjava.operators.combining;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;

public class ZipOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CombiningLatestOperator.class);
	private static List<Character> changeIt = new ArrayList<>();

	public static void main(String[] args) {
		LOGGER.info("Zip Operator");
		Observable shapes = Observable.fromIterable(RxUtils.shapes(5));
		Observable numbers = Observable.fromIterable(RxUtils.postiveNumbers(3));
		
		numbers.zipWith(shapes, (o, o2) -> {
			return o.toString() + ": " + o2.toString();
		}).subscribe(new DemoObserver());
	}

}
