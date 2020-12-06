package randomNumberGame;

import java.util.Scanner;

public class RandomNumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = null;
		char yn;
		boolean replay = false;
		
		while(!replay){
			int coin =10;
			System.out.println("1~100사이 랜덤숫자를 찾으세요");
			
			int rnum =((int)(Math.random()*100)+1); //정답 변수
			boolean right = false;
			while(coin >0 && !right) {// 우저 숫자 입력
				System.out.println("숫자를 입력해 주세요");
				int num =sc.nextInt();
				boolean pass = false;
				while(!pass) {
					if(num <=0 || num>=100) {
						System.out.println("1에서 100사이를 숫자를 입력해 주세요");
						num =sc.nextInt();
						pass= false;
					}else {
						pass = true;
						coin--;
					}// 결과 메세지
					if(num>rnum) answer ="입력한 숫자가 너무 큽니다";
					else if(num<rnum) answer ="입력한 숫자가 너무 작습니다";
					else if(num == rnum) answer ="정답입니다";
				}
				System.out.println(answer);
				if(num ==rnum) { //정답시 탈출
					right = true;
				}else {
					System.out.println(coin+"회 남았습니다");
				    right =false;
				}
			}
			// 재도전 여부 체크
			System.out.println("다시하겠습니까? Y(y) / N(n)");
			yn = sc.next().charAt(0);
			if(yn == "Y" || yn =="y") {
				replay = false;
			}else {
				replay = true;
			}
		}

	}

}
