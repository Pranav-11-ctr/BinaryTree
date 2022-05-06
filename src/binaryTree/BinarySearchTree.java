package binaryTree;

public class BinarySearchTree {
	private BinaryTreeNode<Integer> root;
	
	public void insert(int data)
	{
		
	}
	
	public void deleteData(int data)
	{
		
	}
	
	
	private boolean hasDataHelper(int data,BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data==data)
		{
			return true;
		}
		else if(data>root.data)
		{
			return hasDataHelper(data,root.right);
		}
		else
		{
			return hasDataHelper(data,root.left);
		}
	}
	public boolean hasData(int data)
	{
		return hasDataHelper(data,root);
	}

}
