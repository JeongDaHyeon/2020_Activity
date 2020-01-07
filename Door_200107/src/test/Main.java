package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String[] tries = in.readLine().split(" ");
		String[] strings = new String[n];
		
		for(int i = 0; i < n; i++) {
			strings[i] = in.readLine();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < Integer.parseInt(tries[i]); j++) {
				System.out.println(strings[i].toUpperCase());
			}
		}
	}

}
