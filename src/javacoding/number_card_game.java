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
		
		//������ �迭 �Է¹ޱ�
		int[][] array = new int[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//�� �ະ�� �����ϱ�
		//�����Ͽ� �� �ະ�� ù��° ���� ���� ���� ��
		for(int i=0; i<N; i++) {
			Arrays.sort(array[i]);
		}
		
		//ù��° ���� ���Ͽ� ū ���� �����´�
		int result = 0;
		for(int i=0; i<N; i++) {
			if(array[i][0] > result) {
				result = array[i][0];
			}
		}
		System.out.println(result);
		
	}

}
