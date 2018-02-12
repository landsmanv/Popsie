/* Vytvoøte proceduru, která nakreslí domeèek,
 * Pro nakreslení domeèku je vhodné použít trojúhelník a ètverec
 * Vytvoøte proceduru která nakreslí ulici, 
 * (4 domky vedle sebe), použijte proceduru Domecek v cyklu
 * Vytvoøte cyklus, který z ulice vytvoøí ètverhrané námìstí
 * 
 * Úkoly navíc: 
 * Každý domeèek bude mít náhodnou barvu, použijte funkci lib/Random(15);
 * Základna námìstí bude 8 úhelník
 * Každý domeèek bude mít své okno.
 */
public class Namesti {
	public static Popsie B1 = new Popsie(550, 100, 2);
	public static void Domek() {
		B1.RotateRight(30);
		for (int i = 0; i < 3; i++) {
			B1.Forward(40);
			B1.RotateRight(120);
		}
		B1.RotateRight(240);
		for (int i = 0; i < 3; i++) {
			B1.RotateLeft(90);
			B1.Forward(40);
		}
	}
	public static void Okno() {
		B1.PenUp();
		B1.RotateRight(225);
		B1.Forward(28);
		B1.RotateRight(45);
		B1.PenDown();
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				B1.RotateRight(90);
				B1.Forward(10);
			}
			B1.RotateRight(90);
		}
		B1.PenUp();
		B1.RotateRight(135);
		B1.Forward(28);
		B1.RotateLeft(45);
		B1.PenDown();
	}
	public static void Ulice() {
		for (int i = 0; i < 4; i++) {
			Domek();
			Okno();
			B1.Color(B1.Random(15));
		}
		B1.PenUp();
		B1.Backward(40);
		B1.RotateRight(45);
		B1.Forward(40);
		B1.PenDown();
	}
	public static void main(String[] args) {
		B1.Width(2);
		for (int i = 0; i < 8; i++)
			Ulice();
	}
}
