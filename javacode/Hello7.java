/** 換匯案例
 * 對日匯率: 0.2002
 * 20,000 台幣可以換多少日幣
 */ 
public class Hello7 {

	public static void main(String[] args) {
		double r = 0.2002; // 對日匯率
		
		double twd = 20_000; // 台幣 20000.0
		double jpy = twd / r; // 換匯
		System.out.printf("匯率: %.4f 台幣: %,.0f 可換日幣: %,.0f%n", r, twd, jpy);

		double jpy2 = 12_345;
		double twd2 = jpy2 * r; // 換匯
		System.out.printf("匯率: %.4f 日幣: %,.0f 可換台幣: %,.0f%n", r, jpy2, twd2);
	}

}

