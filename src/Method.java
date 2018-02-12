public class Method {
	public static Popsie B1 = new Popsie(640, 360, 2);
	public static void Trojuhelnik() {
		for (int i = 0; i < 3; i++) {
			B1.Forward(80);
			B1.RotateRight(120);
		}
	}
	public static void Ctverec(int strana) {
		for (int i = 0; i < 4; i++) {
			B1.Forward(strana);
			B1.RotateRight(90);
		}
	}
	public static void PlnyCtverec(int strana, int barva) {
		B1.Width(2);
		B1.Color(barva);
		for (int j = 0; j < strana; j++) {
			for (int i = 0; i < 4; i++) {
				B1.Forward(j);
				B1.RotateRight(90);
			}
		}
	}
	public static void main(String[] args) {
		 Trojuhelnik();
		 Ctverec(50);
		 PlnyCtverec(30, 2);
	}
}
