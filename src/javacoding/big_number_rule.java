package javacoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class big_number_rule {

	public static void main(String[] args) throws IOException {
		
		//N, M, K 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		//N개의 자연수 입력받기
		int[] array = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		//첫번째로 큰수, 두번째로 큰수 찾기
		int firstBig = 0;
		int secondBig = 0;
		for(int i=0; i<N; i++) {
			if(array[i] >= firstBig) {
				secondBig = firstBig;
				firstBig = array[i];
			} else {
				if(array[i] > secondBig) {
					secondBig = array[i];
				}
			}
		}
		
		//첫번째로 큰수는 K번 더하고 두번째로 큰수는 1번 더해서 M이 나오도록 해야함
		//-> M==0일때 break
		int result = 0;
		while(M>0) {
			for(int i=0; i<K; i++) {
				result += firstBig;
				M--;
				
				if(M==0)
					break;
				
			}
			if(M==0)
				break;
			
			result += secondBig;
			M--;
			if(M==0)
				break;
			
		}
		
		System.out.println(result);
	}
	
}
