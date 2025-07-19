// 綜合練習 Coin
import java.util.Scanner;

public class Hello20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int balanceTWD = 10000; // 台幣餘額
		int coinBalance = 0; // 虛擬幣(整數枚數)

		int basePrice = 2000; // 基準價格
		int minPrice = basePrice * 80 / 100; // 最低 80%
		int maxPrice = basePrice * 120 / 100; // 最高 120%

		while(true) {
			int coinPrice = minPrice + (int)(Math.random() * (maxPrice - minPrice)); // 透過 random 隨機跑出一個價格
			System.out.println("--- 虛擬貨幣購買系統 ---");
			System.out.printf("目前每一枚虛擬幣價格: %,d 元%n", coinPrice);
			System.out.printf("你的台幣餘額: %,d 元%n", balanceTWD);
			System.out.printf("你的虛擬幣庫存: %,d 枚 帳面價值: %,d 元%n", coinBalance, (coinBalance*coinPrice));
			System.out.printf("你的獲利金額: %,d 元%n", (balanceTWD - 10000));
			System.out.println("--------------------------------");
			System.out.println("0: 離開系統");
			System.out.println("1: 買進虛擬幣");
			System.out.println("2: 賣出虛擬幣");
			System.out.println("3: 詢價");
			System.out.println("--------------------------------");
			System.out.print("請選擇 ==> ");
			int choice = scanner.nextInt();
			if(choice == 0) {
				System.out.println("交易結束, 再見!");
				break;
			} else if(choice == 1) { // 買進
				System.out.print("請輸入欲購買的虛擬幣枚數 ==> ");
				int buyAmount = scanner.nextInt();
				// 總購入成本
				int totalCost = coinPrice * buyAmount;
				// 判斷餘額是否足夠
				if(balanceTWD < totalCost) {
					System.out.println("台幣餘額不足");
					continue;
				}
				// 交易進行
				balanceTWD = balanceTWD - totalCost;
				coinBalance = coinBalance + buyAmount;
				System.out.printf("成功購買: %,d 枚 虛擬幣, 花費: %,d 元%n", buyAmount, totalCost);
				System.out.printf("剩餘台幣: %,d 元 虛擬幣: %,d 枚%n", balanceTWD, coinBalance);
				System.out.println("=================================");
			} else if(choice == 2) { // 賣出
				System.out.printf("請輸入欲賣出的虛擬幣枚數(你的庫存: %d 枚) ==> ", coinBalance);
				int sellAmount = scanner.nextInt();
				// 賣出數量不可 > 庫存量
				if(sellAmount > coinBalance) {
					System.out.println("庫存量不足");
					continue;
				}
				// 進行交易
				// 總賣出金額
				int totalRevenue = coinPrice * sellAmount;
				balanceTWD = balanceTWD + totalRevenue;
				coinBalance = coinBalance - sellAmount;
				System.out.printf("成功賣出: %,d 枚 虛擬幣, 金額: %,d 元%n", sellAmount, totalRevenue);
				System.out.printf("剩餘台幣: %,d 元 虛擬幣: %,d 枚%n", balanceTWD, coinBalance);
				System.out.println("=================================");

			} else {
				continue;
			}
			
		}
	}
}