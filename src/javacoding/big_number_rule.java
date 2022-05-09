package javacoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
		
		//�����Ͽ� ù��°�� ū��, �ι�°�� ū�� ã��
		Arrays.sort(array);
		int firstBig = array[N-1];
		int secondBig = array[N-2];
		
		//ù��°�� ū���� (M/(K+1))*K + M%(K+1) ���� ���ϸ� �ǰ�
		//�ι�°�� ū���� M-(ù��°�� ū���� ���� Ƚ��) ���� ���ϸ� �ȴ�
		int result = 0;
		int count = (M/(K+1))*K + M%(K+1);
		result += firstBig * count;
		result += secondBig * (M-count);
		
		System.out.println(result);
	}
	
}
