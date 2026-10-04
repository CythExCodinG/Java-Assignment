package com.app.thread;

import com.app.core.Point;
import com.app.util.PointList;

/** Continuously generates points and places them in the shared list. */
public class ProducerThread extends Thread {
	private static final int AMPLITUDE = 100;
	private static final double PIE = 3.14;
	private static final int FREQUENCY = 1;

	private final PointList points;
	private int xPoint;
	private int angle;

	public ProducerThread(PointList points) {
		super("ProducerThread");
		this.points = points;
	}

	@Override
	public void run() {
		try {
			while (!isInterrupted()) {
				double yPoint = AMPLITUDE * Math.sin(angle * PIE / 180.0);
				points.add(new Point(xPoint, yPoint));
				xPoint += 2 * FREQUENCY;
				angle += 3;
				if (angle >= 360) {
					angle = 0;
				}
			}
		} catch (InterruptedException e) {
			interrupt();
		}
	}
}
