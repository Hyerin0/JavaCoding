package javacoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class up_down_left_right {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.parseInt(br.readLine());
		int x = 1; //처음 위치 (1,1)을 나타내기 위해서
		int y = 1;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			String s = st.nextToken();

			if(s.equals("L")) { //L일때
				if(y==1) { //( ,1)은 무시
					y = 1;
				} else {
					y -= 1;
				}
			} else if(s.equals("R")) { //R일때
				if(y==N) { //( ,N)은 무시
					y = N;
				} else {
					y += 1;
				}
			} else if(s.equals("U")) { //U일때
				if(x==1) { //(1, )은 무시
					x = 1;
				} else {					
					x -= 1;
				}
			} else if(s.equals("D")) { //D일때
				if(x==N) { //(N, )은 무시
					x = N;
				} else {
					x += 1;					
				}
			}
				
		}
		System.out.println(x+" "+y);

	}

}
