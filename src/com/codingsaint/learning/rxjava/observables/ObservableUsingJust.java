package com.codingsaint.learning.rxjava.observables;

import io.reactivex.Observable;
import io.reactivex.Observer;

public class ObservableUsingJust {
	
	public static void main(String[] args) {
		//Observable.just("a", "b", "c", "d", "d", "e", "f", "g", "h", "i", "j")
		Observable.just("a", "b", "c", "d", "e", "f", "g", "h", "i", "j")
		    .subscribe(new Observer() {
		    	
			});
	}

}
