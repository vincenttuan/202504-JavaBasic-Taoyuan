// if -> if else -> else 語法
public class Hello17 {

	public static void main(String[] args) {
		int score = 85;
		if(score >= 90 && score <= 100) {
			System.out.println("A 級");
		} else if(score >= 80 && score < 90) {
			System.out.println("B 級");
		} else if(score >= 70 && score < 80) {
			System.out.println("C 級");
		} else if(score >= 60 && score < 70) {
			System.out.println("D 級");
		} else {
			System.out.println("F 級");
		}
	}

}