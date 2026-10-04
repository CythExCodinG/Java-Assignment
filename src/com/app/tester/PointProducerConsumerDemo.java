package com.app.tester;

import com.app.thread.ConsumerThread;
import com.app.thread.ProducerThread;
import com.app.util.PointList;

public class PointProducerConsumerDemo {
	public static void main(String[] args) {
		PointList points = new PointList();
		new ConsumerThread(points).start();
		new ProducerThread(points).start();
	}
}
