package javacoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class royal_night {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String loc =  br.readLine();
		//나이트의 현재 위치
		int nowx = loc.charAt(0) - 'a' + 1;  
		int nowy = loc.charAt(1) - '1' + 1; 
		
		//나이트가 이동할 수 있는 방향 정의 (8가지)
		int[] x = {-2,-2,+2,+2,+1,-1,+1,-1};
		int[] y = {+1,-1,+1,-1,-2,-2,+2,+2};
		
		//나이트가 이동할 수 있는지 확인
		int count = 0;
		for(int i=0; i<8; i++) {
			int nextx = nowx + x[i];
			int nexty = nowy + y[i];
			if(nextx >=1 && nextx <=8 && nexty >=1 && nexty <=8) {
				count++;
			}
		}
		System.out.println(count);

		
	}

}
