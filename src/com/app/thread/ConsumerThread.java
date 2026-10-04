package com.app.thread;

import com.app.core.Point;
import com.app.util.PointList;

/** Displays each point as it is removed from the shared list. */
public class ConsumerThread extends Thread {
	private final PointList points;

	public ConsumerThread(PointList points) {
		super("ConsumerThread");
		this.points = points;
	}

	@Override
	public void run() {
		try {
			while (!isInterrupted()) {
				Point point = points.remove();
				System.out.println(point);
			}
		} catch (InterruptedException e) {
			interrupt();
		}
	}
}
