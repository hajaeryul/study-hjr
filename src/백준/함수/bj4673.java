package 백준.함수;

public class bj4673 {

	public static void main(String[] args) {
		boolean[] flag = new boolean[10001]; //1부터 10,000까지
		
		for(int i = 1; i <= 10000; i++) {
			int n = d(i); // !셀프넘버 저장
			
			if(n < 10001) {
				flag[n] = true; // !셀프넘버 인덱스 저장
			}
		}
		for(int i = 1; i <=10000; i++) {
			if(!flag[i]) {
				System.out.println(i); // 셀프넘버만 출력
			}
		}

	}
	
	public static int d(int num) {
		int sum = num;
		
		while(num != 0) { //일의자리부터 돌면서 더하고 0이면 탈출
			sum = sum + (num%10);
			num = num/10;
		}
		return sum; //생성자가 있는 값 리턴(!셀프넘버)
	}

}
