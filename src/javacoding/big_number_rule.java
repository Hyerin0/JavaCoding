package javacoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class big_number_rule {

	public static void main(String[] args) throws IOException {
		
		//N, M, K �Է¹ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		//N���� �ڿ��� �Է¹ޱ�
		int[] array = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		//ù��°�� ū��, �ι�°�� ū�� ã��
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
		
		//ù��°�� ū���� K�� ���ϰ� �ι�°�� ū���� 1�� ���ؼ� M�� �������� �ؾ���
		//-> M==0�϶� break
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
