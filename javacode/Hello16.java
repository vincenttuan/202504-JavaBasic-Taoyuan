// if-else 語法
import java.util.Scanner;

public class Hello16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入分數:");
		int score = scanner.nextInt();
		if(score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}

	}

}