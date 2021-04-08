package com.myapp.groovy.main
import com.myapp.groovy.MyRunnable

Thread t=new Thread(new MyRunnable());
t.start()

Runnable task= {5.times () {
			println "${Thread.currentThread().name}\t: ${it}"
			
		}}
Thread t1=new Thread(task)
t1.start()
