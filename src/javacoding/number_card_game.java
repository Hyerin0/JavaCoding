package javacoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class number_card_game {

	public static void main(String[] args) throws IOException {
		
		//N, M 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//이차원 배열 입력받기
		int[][] array = new int[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//각 행별로 정렬하기
		//정렬하여 각 행별로 첫번째 열은 가장 작은 값
		for(int i=0; i<N; i++) {
			Arrays.sort(array[i]);
		}
		
		//첫번째 열을 비교하여 큰 값만 가져온다
		int result = 0;
		for(int i=0; i<N; i++) {
			if(array[i][0] > result) {
				result = array[i][0];
			}
		}
		System.out.println(result);
		
	}

}
