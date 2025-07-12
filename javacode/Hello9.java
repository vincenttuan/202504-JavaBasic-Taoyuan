// 飲料折扣戰(除法的使用案例)
public class Hello9 {

	public static void main(String[] args) {
		// 飲料一瓶 10 元, 買一送一, 買 4 瓶要花多少錢?
		int price = 10; // 飲料單價
		int qty = 4; // 買 4 瓶
		int bottles = qty / 2; // 需要支付的瓶數
		int pay = price * bottles;

		System.out.printf("飲料單價: %d%n", price);
		System.out.printf("購買瓶數: %d%n", qty);
		System.out.printf("買一送一%n");
		System.out.printf("需要支付的瓶數: %d%n", bottles);
		System.out.printf("需要支付的金額: %d%n", pay);


	}

}

