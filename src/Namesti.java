/* Vytvo�te proceduru, kter� nakresl� dome�ek,
 * Pro nakreslen� dome�ku je vhodn� pou��t troj�heln�k a �tverec
 * Vytvo�te proceduru kter� nakresl� ulici, 
 * (4 domky vedle sebe), pou�ijte proceduru Domecek v cyklu
 * Vytvo�te cyklus, kter� z ulice vytvo�� �tverhran� n�m�st�
 * 
 * �koly nav�c: 
 * Ka�d� dome�ek bude m�t n�hodnou barvu, pou�ijte funkci lib/Random(15);
 * Z�kladna n�m�st� bude 8 �heln�k
 * Ka�d� dome�ek bude m�t sv� okno.
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
