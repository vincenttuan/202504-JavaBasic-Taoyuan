// 綜合練習
import java.util.Scanner;
public class Hello19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int price = 15; // 飲料一瓶 15 元
		int qty = 10;   // 飲料庫存 10 瓶
		int cash = 100; // 有現金 100 元
		// 重複購買
		while(true) {
			System.out.printf("現金餘額:%d%n", cash);
			System.out.printf("飲料:%d/瓶元 庫存:%d瓶 請輸入購買數量 => ", price, qty);
			// 1.購買數量
			int amount = scanner.nextInt();
			// 2.檢查庫存是否充足
			if(qty < amount) {
				System.out.println("庫存不足");
				break;
			}
			// 3.檢查金額是否足夠支付
			int pay = price * amount;
			if(cash < pay) {
				System.out.println("金額不足");
				break;
			}
			// 4.付款購買/庫存扣抵
			cash = cash - pay;
			qty = qty - amount;
			System.out.printf("購買成功!");

		}

	}
}