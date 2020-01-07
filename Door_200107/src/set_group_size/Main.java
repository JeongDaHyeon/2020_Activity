package set_group_size;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(in.readLine());
		
		int min = Integer.MAX_VALUE;
		
		int max = 0;
		
		// hash table 1개 -> 배열을 저장 나중에 이 배열을 다시 만들거.
		// hash table 1개 -> 부모를 저장 나중에 고칠 때 고칠거.
		
		Hashtable<String, ArrayList<String>> set = new Hashtable<String, ArrayList<String>>();
		Hashtable<String, String> root = new Hashtable<String, String>();
		
		for(int i = 0; i < N; i++) {
			String[] line = in.readLine().split(" ");
			
			boolean existed = false;
			String union = "";
			// 대표를 구함
			for(int j = 0; j < line.length; j++) {
				if(set.containsKey(line[j])) {
					existed = true;
					union = root.get(line[j]);
					break;
				}
			}
			
			// 대표가 있을 때.
			if(existed) {
				for(int j = 0; j < line.length; j++) {
					// 대표가 같지 않을 때
					if(!root.get(line[j]).equals(union)) {
						// 그룹으로 존재할 때
						if(set.containsKey(line[j])) {
							
						}
						
						// 그룹으로 존재하지 않을 때
						
					}
				}
				
			} else {
				set.put(line[0], new ArrayList<String>());
				for(int j = 0; j < line.length; j++) {
					set.get(line[0]).add(line[0]);
					root.put(line[j], line[0]);
				}
				max = Math.max(max, set.get(line[0]).size());
				min = Math.min(min, set.get(line[0]).size());
			}
		}
		
		System.out.println(min + " " + max);
		
	}

}
