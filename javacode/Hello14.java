// 販賣機找零錢程式
public class Hello14 {

	public static void main(String[] args) {
		// 硬幣有 50, 10, 5, 1 四種
		// 飲料一瓶 23 元, 付款 100 元
		// 試問要找多少錢 ? 如何找 ?
		// 答案: 找 77 元
		//       50元硬幣 1 個
		//       10元硬幣 2 個
		//        5元硬幣 1 個
		//        1元硬幣 2 個
		int price = 23; // 飲料價格
		int pay = 100; // 付款金額
		int change = pay - price; // 找錢

		System.out.printf("飲料:%d 付款:%d 找零:%d%n", price, pay, change);

		// 如何找 ?
		// 50元要找幾個 ?
		int fifty = change / 50;
		System.out.printf("50元:%d 枚%n", fifty);
		change = change % 50; // 找完 50 元後剩餘多少錢
		System.out.printf("找完50元後還剩下 %d 元%n", change);

		// 10元要找幾個 ?
		int ten = change / 10;
		System.out.printf("10元:%d 枚%n", ten);
		change = change % 10; // 找完 10 元後剩餘多少錢
		System.out.printf("找完10元後還剩下 %d 元%n", change);

		// 5元要找幾個 ?
		int five = change / 5;
		System.out.printf("5元:%d 枚%n", five);
		change = change % 5; // 找完 5 元後剩餘多少錢
		System.out.printf("找完5元後還剩下 %d 元%n", change);

		// 1元要找幾個 ?
		int one = change;
		System.out.printf("1元:%d 枚%n", one);
	}

}