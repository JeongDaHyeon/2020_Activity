package tree_preorder;

import java.util.Scanner;

class Node {
	Node left;
	Node right;
	int data;
	
	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public void add(int data) {
		// add left
		if(data < this.data) {
			if(left == null) {
				left = new Node(data);
			} else {
				left.add(data);
			}
		} else {
			if(right == null) {
				right = new Node(data);
			} else {
				right.add(data);
			}
		}
	}
	
	public void preorder() {
		System.out.print(data + " ");
		if(left != null) left.preorder();
		if(right != null) right.preorder();
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		Node root = new Node(scan.nextInt());
		for(int i = 1; i < n; i++) {
			root.add(scan.nextInt());
		}
		
		root.preorder();
		

	}
}
