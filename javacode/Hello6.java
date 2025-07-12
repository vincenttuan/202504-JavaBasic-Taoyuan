/**
 * 格式化輸出員工薪資表
 * 設計一個 Java 程式, 輸出三位員工的薪資資料
 * 每位員工包含"姓名", "職稱", "底薪", "獎金", "總薪資"
 * 請用 System.out.printf() 來顯示每一項員工資料, 最後並計算全體員工薪資總和
 * 
 * 要求:
 * 底薪, 獎金總薪資都要加上千分號, 並保留小數點2位
 * 輸出要整齊美觀
 * 
 * 輸出範例:
 * 姓名   職稱    底薪    獎金   總薪資
 * -------------------------------------
 * 王小明 經理 65,000.00 5,000 70,000.00
 * 李小華 主任 55,000.00 3,000 58,000.00
 * 陳大文 專員 45,000.00 1,500 46,500.00
 * -------------------------------------
 * 總薪資支出: 174,500.00
 * 
 * */

 public class Hello6 {

 	public static void main(String[] args) {
 		// 第一位員工
 		String name1 = "王小明"; // 姓名
 		String title1 = "經理";  // 職稱
 		double base1 = 65_000.0; // 底薪
 		double bonus1 = 5_000.0; // 獎金
 		double total1 = base1 + bonus1; // 總薪資

		// 第二位員工
 		String name2 = "李小華"; // 姓名
 		String title2 = "主任";  // 職稱
 		double base2 = 55_000.0; // 底薪
 		double bonus2 = 3_000.0; // 獎金
 		double total2 = base2 + bonus2; // 總薪資

 		// 第三位員工
 		String name3 = "陳大文"; // 姓名
 		String title3 = "專員";  // 職稱
 		double base3 = 45_000.0; // 底薪
 		double bonus3 = 1_500.0; // 獎金
 		double total3 = base3 + bonus3; // 總薪資

 		// 總薪資支出
 		double total = total1 + total2 + total3;

 		System.out.printf("姓名   職稱    底薪    獎金   總薪資%n");
 		System.out.printf("-------------------------------------%n");
 		System.out.printf("%s %s %,.2f %,.0f %,.2f%n", name1, title1, base1, bonus1, total1);
 		System.out.printf("%s %s %,.2f %,.0f %,.2f%n", name2, title2, base2, bonus2, total2);
 		System.out.printf("%s %s %,.2f %,.0f %,.2f%n", name3, title3, base3, bonus3, total3);
 		System.out.printf("-------------------------------------%n");
 		System.out.printf("總薪資支出: %,.2f%n", total);
 	}

 }