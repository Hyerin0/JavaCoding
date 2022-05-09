package javacoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class change {
	
	public static void main(String[] args) throws IOException {
		
		int[] coins = new int[]{500, 100, 50, 10};
//		int[] coins = {500, 100, 50, 10};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for(int i=0; i<4; i++) {
			cnt += money/coins[i];
			money = money%coins[i];
		}
		
		System.out.println(cnt);
	}
}
