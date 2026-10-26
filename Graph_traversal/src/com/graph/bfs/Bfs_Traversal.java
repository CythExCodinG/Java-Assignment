package com.graph.bfs;

import java.util.ArrayDeque;
import java.util.Queue;

public class Bfs_Traversal {
	
	public static void main(String[] args) {
		int arr[][]= {
				{0,0,1,0},{0,1,0,1},{0,1,0,0},{0,0,1,0}
		};
		
		boolean visited[]= new boolean[4];
		bfsTraverse(arr,0, visited);
		
	}
	public static void bfsTraverse(int arr[][],int vertex,boolean visited[]) {
		Queue<Integer> q=new ArrayDeque<Integer>();
		visited[vertex]=true;
		q.offer(vertex);
		System.out.print("Start=> "+vertex+" ");
		
		while(!q.isEmpty()) {
			int currentIndex=q.poll();
			for(int i=0;i<4;i++) {
				if(arr[currentIndex][i]==1 && !visited[i]) {
					System.out.print(i+" ");
					q.offer(i);
					visited[i]=true;
				}
			}
		}
	}
}
