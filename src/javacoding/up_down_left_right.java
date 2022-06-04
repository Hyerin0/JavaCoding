package javacoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class up_down_left_right {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.parseInt(br.readLine());
		int x = 1; //ó�� ��ġ (1,1)�� ��Ÿ���� ���ؼ�
		int y = 1;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			String s = st.nextToken();

			if(s.equals("L")) { //L�϶�
				if(y==1) { //( ,1)�� ����
					y = 1;
				} else {
					y -= 1;
				}
			} else if(s.equals("R")) { //R�϶�
				if(y==N) { //( ,N)�� ����
					y = N;
				} else {
					y += 1;
				}
			} else if(s.equals("U")) { //U�϶�
				if(x==1) { //(1, )�� ����
					x = 1;
				} else {					
					x -= 1;
				}
			} else if(s.equals("D")) { //D�϶�
				if(x==N) { //(N, )�� ����
					x = N;
				} else {
					x += 1;					
				}
			}
				
		}
		System.out.println(x+" "+y);

	}

}
