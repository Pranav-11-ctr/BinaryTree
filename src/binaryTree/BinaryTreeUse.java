package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
	public static BinaryTreeNode<Integer> takeInputLevelWise()
	{
		Scanner sc=new Scanner(System.in);
		Queue<BinaryTreeNode<Integer>> pending=new LinkedList<>();
		System.out.println("Enter root data");
		int rootData=sc.nextInt();
		if(rootData==-1)
		{
			return null;	
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
		pending.add(root);
		while(!pending.isEmpty())
		{
			BinaryTreeNode<Integer> first=pending.remove();
			System.out.println("Enter left child of "+first.data);
			int leftChild=sc.nextInt();
			if(leftChild!=-1)
			{
				BinaryTreeNode<Integer> left1=new BinaryTreeNode<>(leftChild);
				pending.add(left1);
				first.left=left1;
			}
			System.out.println("Enter right child of "+first.data);
			int rightChild=sc.nextInt();
			if(rightChild!=-1)
			{
				BinaryTreeNode<Integer> right1=new BinaryTreeNode<>(rightChild);
				pending.add(right1);
				first.right=right1;
			}
			
		}
		return root;
		
	}
	
	
	
	public static void printTree(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return;
		String toBePrinted=root.data+" ";
		if(root.left!=null)
		{
			toBePrinted+="L"+root.left.data+" ,";
		}
		if(root.right!=null)
		{
			toBePrinted+="R"+root.right.data;
		}
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}
	
	
	
	public static BinaryTreeNode<Integer> takeInput(Scanner sc)
	{
		int rootData;
		System.out.println("Enter root data");
		rootData=sc.nextInt();
		if(rootData==-1)
		{
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		root.left=takeInput(sc);
		root.right=takeInput(sc);
		return root;
		
	}

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		printTree(root);
		// TODO Auto-generated method stub
//		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> node1=new BinaryTreeNode<>(2);
//		BinaryTreeNode<Integer> node2=new BinaryTreeNode<>(3);
//		root.left=node1;
//		root.right=node2;
		

	}

}
