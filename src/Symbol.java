public class Symbol {
	public static Popsie B1 = new Popsie(640, 360, 12);
	public static void main(String[] args) {
		B1.Width(7);
		B1.Point(250);
		B1.Color(15);
		B1.RotateRight(90);
		for (int k = 0; k < 32; k++) {
			for (int j = 0; j < 3; j++) {
				B1.RotateRight(120);
				for (int i = 0; i < 3; i++) {
					B1.Forward(k * 5);
					B1.RotateRight(120);
					B1.Wait(0);
				}
			}
		}
		B1.Color(15);
		B1.Point(80);
		B1.Color(0);
		B1.Point(60);
	}
}
