// 格式化輸出範例
public class Hello5 {
	public static void main(String[] args) {
		// 第一項
		String name1 = "可樂"; // 品名
		double price1 = 25.5;  // 單價
		int qty1 = 121; // 數量
		double subTotal1 = price1 * qty1; // 小計

		System.out.printf("品名:%s 單價:%.1f 數量:%,d 小計:%,.1f%n", name1, price1, qty1, subTotal1);

		// 第二項
		String name2 = "雪碧"; // 品名
		double price2 = 18.3;  // 單價
		int qty2 = 85; // 數量
		double subTotal2 = price2 * qty2; // 小計

		System.out.printf("品名:%s 單價:%.1f 數量:%,d 小計:%,.1f%n", name2, price2, qty2, subTotal2);

		double pi = 3.1415926;
		System.out.printf("圓周率: %.2f %n", pi); // 3.14
		System.out.printf("圓周率: %.4f %n", pi); // 3.1416 (會自動四捨五入)

	}
}