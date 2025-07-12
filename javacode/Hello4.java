/** 
 * 變數的應用
 * 飲料一瓶 10 元買 150 瓶要多少錢?
 */
public class Hello4 {

	public static void main(String[] args) {
		int price = 10; // 飲料一瓶 10 元
		int qty = 150; // 買 150 瓶
		int total = price * qty; // 總支出

		// 一般輸出
		System.out.println("總支出 = " + total);

		// 格式化輸出
		System.out.printf("總支出 = %,d %n", total);
	}

}