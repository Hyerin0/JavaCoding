package javacoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
		
		//정렬하여 첫번째로 큰수, 두번째로 큰수 찾기
		Arrays.sort(array);
		int firstBig = array[N-1];
		int secondBig = array[N-2];
		
		//첫번째로 큰수는 (M/(K+1))*K + M%(K+1) 번을 더하면 되고
		//두번째로 큰수는 M-(첫번째로 큰수를 더한 횟수) 번을 더하면 된다
		int result = 0;
		int count = (M/(K+1))*K + M%(K+1);
		result += firstBig * count;
		result += secondBig * (M-count);
		
		System.out.println(result);
	}
	
}
