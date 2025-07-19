import java.util.Scanner;
// 隨堂練習
// 耳機一副 123 元
// 付款 1000 元支援手動輸入
// 試問要找多少錢 ? 如何找 ?
// 請考慮紙鈔與硬幣面額
public class Hello15 {
	public static void main(String[] args) {
		// 商品
		int price = 123; // 飲料價格
		System.out.printf("飲料價格:%d%n", price);
		
		// 付款(支援手動輸入)
		System.out.print("請輸入付款金額:");
		Scanner scanner = new Scanner(System.in); // System.in = 鍵盤
		int pay = scanner.nextInt(); // 取得使用者在鍵盤上所輸入數字

		// 找零
		int change = pay - price;
		System.out.printf("找零:%d%n", change);
		System.out.println("-----------------");
		int fiveHundred = change / 500;
		change = change % 500;

		int hundred = change / 100;
		change = change % 100;

		int fifty = change / 50;
		change = change % 50;

		int ten = change / 10;
		change = change % 10;

		int five = change / 5;
		change = change % 5;

		int one = change;

		System.out.printf("500元找 %d 枚%n", fiveHundred);
		System.out.printf("100元找 %d 枚%n", hundred);
		System.out.printf("50元找 %d 枚%n", fifty);
		System.out.printf("10元找 %d 枚%n", ten);
		System.out.printf("5元找 %d 枚%n", five);
		System.out.printf("1元找 %d 枚%n", one);


	}
}