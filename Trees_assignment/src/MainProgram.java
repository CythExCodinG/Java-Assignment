
public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode r1=new TreeNode(20);
		TreeNode r2=new TreeNode(10);
		TreeNode r3=new TreeNode(30);
		TreeNode r4=new TreeNode(40);
		TreeNode r5=new TreeNode(80);
		TreeNode r6=new TreeNode(40);
		r1.btNodeleft=r2;
		r1.btNodeRight=r3;
		r2.btNodeleft=r4;
		r3.btNodeRight=r5;
		r3.btNodeleft=r6;
		
		System.out.println("Pre Order :");
		r1.printUsingPreOrder(r1);
		System.out.println("\nPost Order :");
		r1.printUsingPostOrder(r1);
		
		r1.countLeft(r1);
		System.out.println("\nNo of leaf nodes :"+r1.count);
		
		System.out.println("No of nodes :"+r1.countNodes(r1));
		
		System.out.println("No of nodes with value 40 :"+r1.countNodesWithValue(r1, 40));
	}

	

}
