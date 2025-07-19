// switch-case 應用
public class Hello22 {

	public static void main(String[] args) {
		int gender = 1; // 1->男生 2->女生 其他->錯誤

		switch(gender) {
			case 1:
				System.out.println("男生");
				break;
			case 2:
				System.out.println("女生");
				break;
			default:
				System.out.println("錯誤");
		}


	}

}