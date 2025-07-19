// 綜合練習 Coin
import java.util.Scanner;

public class Hello20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int balanceTWD = 10000; // 台幣餘額
		int coinBalance = 0; // 虛擬幣(整數枚數)

		while(true) {
			int coinPrice = 2000; // 每枚虛擬幣價格
			System.out.println("--- 虛擬貨幣購買系統 ---");
			System.out.printf("目前每一枚虛擬幣價格: %,d 元%n", coinPrice);
			System.out.printf("你的台幣餘額: %,d 元%n", balanceTWD);
			System.out.println("--------------------------------");
			System.out.print("請輸入欲購買的虛擬幣枚數(輸入 0 可以離開系統) ==> ");
			int buyAmount = scanner.nextInt();
			if(buyAmount <= 0) {
				System.out.println("交易結束, 再見!");
				break;
			}
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
		}

	}

}