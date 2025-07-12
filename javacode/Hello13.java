// Java 常用數學公式
public class Hello13 {

	public static void main(String[] args) {
		System.out.printf("圓周率: %f%n", Math.PI);
		System.out.printf("指數 2 的 3 次方 = %.1f%n", Math.pow(2, 3));
		System.out.printf("開根號 9 開根號 = %.1f%n", Math.sqrt(9));
		System.out.printf("四捨五入 4.5 = %d%n", Math.round(4.5));
		System.out.printf("無條件進入 4.1 = %.1f%n", Math.ceil(4.1));
		System.out.printf("無條件捨去 4.9 = %.1f%n", Math.floor(4.9));
		System.out.printf("浮點數轉整數 4.9 = %d%n", (int)(4.9));
		System.out.printf("絕對值 -4.9 = %.1f%n", Math.abs(-4.9));
		System.out.printf("取最大值 (15, 25) = %d%n", Math.max(15, 25));
		System.out.printf("取最小值 (15, 25) = %d%n", Math.min(15, 25));
	}

}