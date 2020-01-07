package tomato;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;


public class Main1 {
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = {0, 1, 0, -1};

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputs = in.readLine().split(" ");
		int N = Integer.parseInt(inputs[0]);
		int M = Integer.parseInt(inputs[1]);
		
		Hashtable<String, Integer> box = new Hashtable<String, Integer>();
		Queue<String> q = new LinkedList<String>();
		
		// box
		for(int i = 0; i < M; i++) {
			String[] line = in.readLine().split(" ");
			for(int j = 0; j < N; j++) {
				box.put(i + " " + j, Integer.parseInt(line[j]));
				if(Integer.parseInt(line[j]) == 1) q.add(i + " " + j);
			}
		}
		
		while(!q.isEmpty()) {
			String cur = q.poll();
			String[] p = cur.split(" ");
			for(int i = 0; i < 4; i++) {
				int cr = Integer.parseInt(p[0]) + dr[i];
				int cc = Integer.parseInt(p[1]) + dc[i];
				if(cr < 0 || M <= cr) continue;
				if(cc < 0 || N <= cc) continue;
				if(box.get(cr + " " + cc) == 0) {
					box.put(cr + " " + cc, box.get(cur) + 1);
					q.add(cr + " " + cc);
				}
			}
		}
		
		boolean ok = true;
		int d = 1;
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(box.get(i + " " + j) == 0) ok = false;
				d = Math.max(d, box.get(i + " " + j));
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
