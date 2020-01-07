package tree_topview;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


// map 사용
// queue를 사용

class Node {
	static Queue<Node> q = new LinkedList<Node>();
	static PriorityQueue<Node> pq = new PriorityQueue<Node>();
	Node left;
	Node right;
	int level;
	int data;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
		this.level = 0;
	}

	public void add(int data) {
		// add left
		if (data < this.data) {
			if (left == null) {
				left = new Node(data);
				left.level = this.level - 1;
			} else {
				left.add(data);
			}
		} else {
			if (right == null) {
				right = new Node(data);
				right.level = this.level + 1;
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
	
	public void topview() {
		
		
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		Node root = new Node(scan.nextInt());
		root.level = 0;
		for (int i = 1; i < n; i++) {
			root.add(scan.nextInt());
		}

		root.topview();

	}
}
