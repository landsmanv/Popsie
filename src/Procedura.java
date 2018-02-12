public class Procedura {
	public static Popsie B1 = new Popsie(200, 200, 2);
	public static void Ctverec(int color) {
		B1.PenDown();
		B1.Width(2);
		B1.Color(color);
		for (int j = 0; j < 20; j++) {
			for (int i = 0; i < 4; i++) {
				B1.Forward(j);
				B1.RotateRight(90);
			}
		}
		B1.RotateRight(90);
		B1.Forward(20);
		B1.RotateRight(-90);
		B1.PenUp();
	}
	public static void Rada1() {
		for (int j = 0; j < 4; j++) {
			Ctverec(0);
			Ctverec(1);
		}
	}
	public static void Rada2() {
		for (int j = 0; j < 4; j++) {
			Ctverec(1);
			Ctverec(0);
		}
	}
	public static void Posuv() {
		B1.Forward(-20);
		B1.RotateRight(90);
		B1.Forward(-160);
		B1.RotateRight(-90);
	}
	public static void main(String[] args) {
		B1.Hide();
		for (int k = 0; k < 4; k++) {
			Rada1();
			Posuv();
			Rada2();
			Posuv();
		}
	}
}
