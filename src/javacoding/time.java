package javacoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class time {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for(int h=0; h<=N; h++) { //�ð�
			String hh = String.valueOf(h); 
			for(int m=0; m<60; m++) { //��
				String mm = String.valueOf(m);
				for(int s=0; s<60; s++) { //��
					String ss = String.valueOf(s);
					//hh, mm, ss�� ���ڿ��� ǥ���ؼ� 3�� �����ϸ� cnt�� 1�� ������Ų��
					if(hh.contains("3") || mm.contains("3") || ss.contains("3")) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);

	}

}
