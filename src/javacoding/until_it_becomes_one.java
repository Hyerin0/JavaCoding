package javacoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class until_it_becomes_one {
	
	public static void main(String[] args) throws IOException {
		
		//N, K 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int count = 0;

		while(N>1) {
			//N이 K로 나누어 떨어질때 N을 K로 나누고
			//안 될때 N에서 1을 뺀다
			if(N%K==0) {
				N = N/K;
				count++;
			} else {
				N -= 1;
				count++;
			}
			
			//N이 1이 될때 종료한다.
			if(N==1) {
				break;
			}
		}
		System.out.println(count);
	}

}
