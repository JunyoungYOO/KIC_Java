package chap4;
/*
 * 
 * break : switch, 반복문에서 블럭 밖으로 제어 이동.
 * continue : 반복문에서 블럭의 끝(처음)으로 제어 이동
 * 
 * */
public class LoopEx5 {

	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			System.out.println("\n"+i+"단");
			for (int j=2;j<=9;j++) {
				//if(j==5) break;
				if(j==5) continue;
				System.out.println(i+"*"+j+"="+(i*j));
			}
		} 

	}

}
