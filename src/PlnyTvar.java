public class PlnyTvar {
	public static Popsie B1 = new Popsie(640, 360, 12);
	public static void main(String[] args) {
		B1.Width(5);
		B1.Color(7);
		for (int j = 0; j < 40; j++) {
			for (int i = 0; i < 4; i++) {
				B1.Forward(j * 4);
				B1.RotateRight(90);
			} // ètverec
		}
		B1.Color(5);
		for (int j = 0; j < 40; j++) {
			for (int i = 0; i < 3; i++) {
				B1.Forward(j * 4);
				B1.RotateRight(120);
			} // ètverec
		}
	}
}
