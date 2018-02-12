public class Flower {
	public static Popsie B1 = new Popsie(640, 600, 1);
	public static void main(String[] args) {
		B1.Color(2);
		B1.Point(80);
		B1.RotateRight(90);
		B1.Forward(50);
		B1.Point(80);
		B1.Forward(-25);
		B1.RotateRight(-90);
		B1.Width(5);
		B1.Forward(200);
		B1.RotateRight(-90);
		B1.Forward(-40);
		B1.PenUp();
		B1.Color(12);
		for (int i = 0; i < 8; i++) {
			B1.Forward(80);
			B1.Point(100);
			B1.RotateRight(45);
		}
		B1.Forward(40);
		B1.RotateRight(90);
		B1.Forward(95);
		B1.Color(14);
		B1.Point(130);
	}
}