package com.graph.dfs;



public class Dfs_Traversal {
	
		public static void main(String[] args) {
			int arr[][]= {
					{0,1,1,0},{0,0,0,0},{0,0,0,1},{0,0,0,0}
			};
			
			boolean visited[]= new boolean[4];
			dfsTraversal(arr,0, visited);
			
		}
	
	public static void dfsTraversal(int arr[][],int vertex,boolean[] visited) {
		visited[vertex]=true;
		System.out.println("Start=>"+vertex);
		
		for(int i=0;i<4;i++) {
			if(arr[vertex][i]==1 && !visited[i]) {
				
				dfsTraversal(arr, i, visited);
			}
		}
	}
}
