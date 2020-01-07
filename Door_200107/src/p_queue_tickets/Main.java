package p_queue_tickets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((x, y) -> y - x);
		
		String[] line = in.readLine().split(" ");
		int nt = Integer.parseInt(line[0]); // number of tickets
		int nc = Integer.parseInt(line[1]); // number of clients
		
		line = in.readLine().split(" ");
		
		for(int i = 0; i < nt; i++) {
			pq.add(Integer.parseInt(line[i]));
		}
		
		
		int answer = 0;
		
		for(int i = 0; i < nc; i++) {
			int t = pq.poll();
			answer += t;
			
			pq.add(t-1);
			
		}
		System.out.println(answer);
	

	}

}
