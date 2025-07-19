// while 迴圈連續處理
import java.util.Scanner;
public class Hello18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("請輸入分數:");
			int score = scanner.nextInt();
			// 若 score == -1 就離開 while 迴圈
			if(score == -1) {
				break; // 跳離迴圈
			}
			// 判斷是否及格
			if(score >= 60) {
				System.out.println("及格");
			} else {
				System.out.println("不及格");
			}
			continue;// 繼續重複執行迴圈(預設可以省略不寫)
		}

	}

}