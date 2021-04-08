package com.myapp.groovy

class MyRunnable implements Runnable{
	public void run() {
		10.times () {
			println "${Thread.currentThread().name}\t: ${it}"
			
		}

	}
}
