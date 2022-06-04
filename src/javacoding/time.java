package javacoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class time {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for(int h=0; h<=N; h++) { //시간
			String hh = String.valueOf(h); 
			for(int m=0; m<60; m++) { //분
				String mm = String.valueOf(m);
				for(int s=0; s<60; s++) { //초
					String ss = String.valueOf(s);
					//hh, mm, ss를 문자열로 표현해서 3을 포함하면 cnt를 1씩 증가시킨다
					if(hh.contains("3") || mm.contains("3") || ss.contains("3")) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);

	}

}
