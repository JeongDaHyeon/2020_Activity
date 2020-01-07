package map_word_count;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(in.readLine());
		Hashtable<String, Integer> cnt = new Hashtable<String, Integer>();
		
		int max = 1;
		
		for(int i = 0; i < N; i++) {
			String[] line = in.readLine().split(" ");
			
			for(int j = 0; j < line.length; j++) {
				if(cnt.containsKey(line[j])) {
					cnt.put(line[j], cnt.get(line[j]) + 1);
				} else {
					cnt.put(line[j], 1);
				}
				max = Math.max(max, cnt.get(line[j]));
			}
		}
		
		System.out.println(max);

	}

}
