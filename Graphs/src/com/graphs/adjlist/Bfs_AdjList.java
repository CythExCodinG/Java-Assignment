package com.graphs.adjlist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Bfs_AdjList {
	public static void bfsTraversal(List<List<Integer>> adjList,int startNode,boolean[] visited) {
		Queue<Integer> queue=new ArrayDeque<Integer>();
		
		visited[startNode]=true;
		queue.offer(startNode);
		
		while(!queue.isEmpty()) {
			int current=queue.poll();
			System.out.print(current+" ");
			
			for(int neighbour:adjList.get(current)) {
				if(!visited[neighbour]) {
					visited[neighbour]=true;
					queue.offer(neighbour);
				}
			}
		}	
	}
	
	public static void main(String[] args) {
		List<List<Integer>> adj=new ArrayList<List<Integer>>();
		int V=5;
		for(int i=0;i<V;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		boolean[] visited=new boolean[V];
		adj.get(0).addAll(Arrays.asList(1,2));
		adj.get(1).addAll(Arrays.asList(0,3));
		adj.get(2).addAll(Arrays.asList(3));
		adj.get(3).addAll(Arrays.asList(1,2,4));
		adj.get(4).addAll(Arrays.asList(3));
		
		bfsTraversal(adj, 0, visited);
		
	}
}
