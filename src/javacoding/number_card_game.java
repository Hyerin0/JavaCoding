package javacoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class number_card_game {

	public static void main(String[] args) throws IOException {
		
		//N, M �Է¹ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int result = 0;
		//���پ� �Է¹޾� Ȯ���ϱ�
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			//�����ٿ��� ���� ���� ���� ã��
			int min_value = 10001;
			for(int j=0; j<M; j++) {
				int x = Integer.parseInt(st.nextToken());
				min_value = Math.min(min_value, x);
			}
			
			//���� ���� ���� �߿��� ���� ū �� ã��
			result = Math.max(min_value, result);
		}
		
		System.out.println(result);
		
	}

}
