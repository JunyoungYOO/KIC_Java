package chap3;

import java.util.Scanner;

/*
 * 사과를 담기 위한 사과상자 갯수 구하기
 * 1개의 상자에 10개의 사과를 담을 수 있다고 할때 필요한 상자의 갯수를 출력하기
 * [결과]
 * 사과의 갯수를 입력하세요
 * 22
 * 필요한 상자의 갯수 : 3개
 * 사과의 갯수를 입력하세요
 * 30
 * 필요한 상자의 갯수 : 3개
 */
public class Test1 {
	public static void main(String[] args) {
		
		
		
		System.out.println("사과의 갯수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("필요한 상자의 갯수 : " + ((n/10==0)?(n/10):(n/10+1)) +"개");
				
		System.out.println("사과의 갯수를 입력하세요.");
		n= scan.nextInt();
		System.out.println("필요한 상자의 갯수 : " + ((n/10==0)?(n/10):(n/10+n%10)) +"개");
	}
}