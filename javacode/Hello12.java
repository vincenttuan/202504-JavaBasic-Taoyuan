// 飲料折扣戰(除法與餘數的使用案例)
public class Hello12 {

	public static void main(String[] args) {
		// 飲料一瓶 10 元, 買二送一, 買 7 瓶要多少錢?
		// 飲料一瓶 10 元, 買三送一, 買 10 瓶要多少錢?
		// 飲料一瓶 10 元, 買五送二, 買 15 瓶要多少錢?
		// 飲料一瓶 price 元, 買 x 送 y, 買 qty 瓶要多少錢?
		int price = 10;
		int qty = 15;
		int x = 2, y = 1; // 買 x 送 y
		//int bottles = (qty/3)*2 + qty%3;
		int bottles = (qty/(x+y))*x + qty%(x+y);
		int pay = price * bottles;

		System.out.printf("飲料單價: %d%n", price);
		System.out.printf("購買數量: %d%n", qty);
		System.out.printf("買 %d 送 %d%n", x, y);
		System.out.printf("需要支付的瓶數: %d%n", bottles);
		System.out.printf("需要支付的金額: %d%n", pay);

	}



}