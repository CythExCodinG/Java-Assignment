package com.app.util;

import com.app.core.Point;

/** A synchronized, user-defined singly linked list for producer/consumer use. */
public class PointList {
	private static final class Node {
		private final Point value;
		private Node next;

		private Node(Point value) {
			this.value = value;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public synchronized void add(Point point) throws InterruptedException {
		if (point == null) {
			throw new IllegalArgumentException("point cannot be null");
		}
		Node node = new Node(point);
		if (tail == null) {
			head = tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
		notifyAll();

		if (size > 250) {
			while (size > 15) {
				wait();
			}
		}
	}

	public synchronized Point remove() throws InterruptedException {
		while (head == null) {
			wait();
		}
		Point point = head.value;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
		notifyAll();
		return point;
	}

	public synchronized int size() {
		return size;
	}
}
