package tree_lca;

import java.util.Queue;
import java.util.Scanner;


class Node {
	Node left;
	Node right;
	Node parent;
	int data;
	int level;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
		this.parent = null;
		this.level = 0;
	}

	public void add(int data) {
		// add left
		if (data < this.data) {
			if (left == null) {
				left = new Node(data);
				left.parent = this;
				left.level = level + 1;
			} else {
				left.add(data);
			}
		} else {
			if (right == null) {
				right = new Node(data);
				right.parent = this;
				right.level = level + 1;
			} else {
				right.add(data);
			}
		}
	}

	public void lca() {
		
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();	

		Node root = new Node(scan.nextInt());
		for (int i = 1; i < n; i++) {
			root.add(scan.nextInt());
		}
		
		int c1 = scan.nextInt();
		int c2 = scan.nextInt();
		
		
	}

}
