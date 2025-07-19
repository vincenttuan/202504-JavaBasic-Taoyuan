// for-loop
public class Hello21 {
	public static void main(String[] args) {
		// 印出 1~10
		System.out.println("印出 1~10");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("----------");
		// 印出 1~10 的偶數
		System.out.println("印出 1~10 的偶數");
		for(int i=1;i<=10;i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}

	}
}