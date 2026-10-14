
public class TreeNode {
	int data;
	TreeNode btNodeleft;
	TreeNode btNodeRight;
	
	public TreeNode(int data) {
		// TODO Auto-generated constructor stub
		this.data=data;
		btNodeleft=null;
		btNodeRight=null;
	}
	
	

private void printInPreOrder(TreeNode n) {
    if (n == null) {
        return;
    }

    System.out.print(n.data+" "); 

    printInPreOrder(n.btNodeleft);  
    printInPreOrder(n.btNodeRight); 
}


	
	public  void printUsingPreOrder(TreeNode n) {
		printInPreOrder(n);
	}
	
	private void printPostOrder(TreeNode n) {
	    if (n == null) {
	        return;
	    }


	    printInPreOrder(n.btNodeleft);  
	    printInPreOrder(n.btNodeRight); 
	    System.out.print(n.data+" "); 
	}

		
		public  void printUsingPostOrder(TreeNode n) {
			printPostOrder(n);
		}
		public int count=0;
		public void countLeft(TreeNode root) {
			if(root.btNodeleft==null) {
				count++;
				return;
			}
			if(root.btNodeRight==null) {
				count++;
				return;
			}
			countLeft(root.btNodeleft);
			countLeft(root.btNodeRight);
		}
		
		public int countNodes(TreeNode n) {
		    if (n == null) {
		        return 0;
		    }

		    return 1 + countNodes(n.btNodeleft)
		             + countNodes(n.btNodeRight);
		}
		
		public int countNodesWithValue(TreeNode n, int value) {
		    if (n == null) {
		        return 0;
		    }

		    int count = (n.data == value) ? 1 : 0;

		    count += countNodesWithValue(n.btNodeleft, value);
		    count += countNodesWithValue(n.btNodeRight, value);

		    return count;
		}
	
}
