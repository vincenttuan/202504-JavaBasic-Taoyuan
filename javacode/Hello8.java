/**
 * 設計一個 Java 程式, 輸出三項麥當勞餐點訂購明細, 包含:品名, 單價, 數量, 小計
 * 若超過 300 元享有 9 折優惠
 * 輸出範例
 *  品名  單價  數量  小計
 * -----------------------
 * 大麥克  79    2    158
 * 大薯條  52    1    52
 * 中可樂  33    3    99
 * -----------------------
 * 總金額:          309
 * 折扣後應付金額:   278
 * */
 public class Hello8 {
 	public static void main(String[] args) {
 		// 第一項
 		String name1 = "大麥克"; // 品名
 		int price1 = 79; // 單價
 		int qty1 = 2; // 數量
 		int subTotal1 = price1 * qty1; // 小計

 		// 第二項
 		String name2 = "大薯條"; // 品名
 		int price2 = 52; // 單價
 		int qty2 = 1; // 數量
 		int subTotal2 = price2 * qty2; // 小計

 		// 第三項
 		String name3 = "中可樂"; // 品名
 		int price3 = 33; // 單價
 		int qty3 = 3; // 數量
 		int subTotal3 = price3 * qty3; // 小計
 		
 		// 總金額
 		int total = subTotal1 + subTotal2 + subTotal3;
 		// 折扣後應付金額
 		double pay = (total >= 300) ? total * 0.9 : total;

 		System.out.printf(" 品名  單價  數量  小計%n");
 		System.out.printf("-----------------------%n");
 		System.out.printf("%s%4d%5d%7d%n", name1, price1, qty1, subTotal1);
 		System.out.printf("%s%4d%5d%7d%n", name2, price2, qty2, subTotal2);
 		System.out.printf("%s%4d%5d%7d%n", name3, price3, qty3, subTotal3);
 		System.out.printf("-----------------------%n");
 		System.out.printf("總金額:%15d%n", total);
		System.out.printf("折扣後應付金額:%7.0f%n", pay);


 	}
 }