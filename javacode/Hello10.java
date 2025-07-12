// 飲料折扣戰(除法與餘數的使用案例)
public class Hello10 {
	public static void main(String[] args) {
		// 飲料一瓶 10 元, 買一送一, 買 5 瓶要多少錢?
		int price = 10; // 飲料單價
		int qty = 5; // 購買數量
		int bottles = qty/2 + qty%2;
		int pay = price * bottles;

		System.out.printf("飲料單價: %d%n", price);
		System.out.printf("購買瓶數: %d%n", qty);
		System.out.printf("買一送一%n");
		System.out.printf("需要支付的瓶數: %d%n", bottles);
		System.out.printf("需要支付的金額: %d%n", pay);

	}
}