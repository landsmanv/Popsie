public class Cykly {
	public static Popsie B1 = new Popsie(640, 360, 12);
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			B1.Forward(80);
			B1.RotateRight(90);
		} // ètverec
		for (int i = 0; i < 3; i++) {
			B1.Forward(80);
			B1.RotateRight(120);
		} // trojuhelník
		for (int i = 0; i < 8; i++) {
			B1.Forward(80);
			B1.RotateRight(45);
		} // osmiúhelník
		for (int i = 0; i < 5; i++) {
			B1.Forward(160);
			B1.RotateRight(144);
		} // 5 hvìzda
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 3; j++) {
				B1.Forward(100);
				B1.RotateRight(120);
			}  	
			B1.RotateLeft(60);
		} // šestiúhelník pomocí troj
		for (int j = 0; j < 36; j++) {
			B1.Forward(300);
			B1.RotateRight(170);
		} // ornament
		for (int j = 0; j < 5; j++) {
			B1.Point(20);
			B1.Backward(50);
			B1.RotateRight(72);
		} // 5 úhelník s puntíky
	} // pozn: tvary se nakreslí pøes sebe
}