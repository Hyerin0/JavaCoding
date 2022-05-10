package javacoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class until_it_becomes_one {
	
	public static void main(String[] args) throws IOException {
		
		//N, K �Է¹ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int count = 0;

		while(N>1) {
			//N�� K�� ������ �������� N�� K�� ������
			//�� �ɶ� N���� 1�� ����
			if(N%K==0) {
				N = N/K;
				count++;
			} else {
				N -= 1;
				count++;
			}
			
			//N�� 1�� �ɶ� �����Ѵ�.
			if(N==1) {
				break;
			}
		}
		System.out.println(count);
	}

}
