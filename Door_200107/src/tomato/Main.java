package tomato;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Node {
	int day;
	int r;
	int c;

	public Node(int r, int c, int day) {
		this.r = r;
		this.c = c;
		this.day = day;
	}
}

public class Main {
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = {0, 1, 0, -1};

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputs = in.readLine().split(" ");
		int N = Integer.parseInt(inputs[0]);
		int M = Integer.parseInt(inputs[1]);
		
		Node[][] box = new Node[M][N];
		
		Queue<Node> q = new LinkedList<Node>();
		
		// set box
		for(int i = 0; i < M; i++) {
			String[] line = in.readLine().split(" ");
			
			for(int j = 0; j < N; j++) {
				box[i][j] = new Node(i,j, Integer.parseInt(line[j]));
				if(box[i][j].day == 1) q.add(box[i][j]);
			}
		}
		
		while(!q.isEmpty()) {
			Node cur = q.poll();
			for(int i = 0; i < 4; i++) {
				int cr = cur.r + dr[i];
				int cc = cur.c + dc[i];
				if(cr < 0 || M <= cr) continue;
				if(cc < 0 || N <= cc) continue;
				if(box[cr][cc].day == 0) {
					box[cr][cc].day = cur.day + 1;
					q.add(box[cr][cc]);
				}
			}
		}
		
		boolean ok = true;
		int d = 1;
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(box[i][j].day == 0) ok = false;
				d = Math.max(d, box[i][j].day);
			}
			if(ok == false) break;
		}
		
		if(ok) {
			System.out.println(d - 1);
		} else {
			System.out.println(-1);
		}
		

	}

}
