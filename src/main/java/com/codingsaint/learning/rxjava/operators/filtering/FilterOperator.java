package com.codingsaint.learning.rxjava.operators.filtering;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codingsaint.learning.rxjava.models.Shape;
import com.codingsaint.learning.rxjava.observables.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;

import io.reactivex.Observable;

public class FilterOperator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TakeOperator.class);

	public static void main(String[] args) {
		LOGGER.info("Filter Operator");
		List<Shape> shapes = RxUtils.shapes(10);
		for (Shape s : shapes) {
			LOGGER.info("shape -> {}", s);
		}
		Observable.fromIterable(shapes)
		  .filter(s -> {
			  return s.getColor().equals("blue");
		  })
		  .subscribe(new DemoObserver());

	}

}
