/* Vytvoøte cyklus, který nakreslí ètverec, trojuhelník, osmiúhelník, 5ti cípou hvìzdu,
 * Nápovìda: zkuste vložit do cyklu èekání aby jste vidìli co beruška dìlá
 * Nakreslete pravidelný trojúhelník složený ze 6 trojúhelníkù, porovnejte s kódem bez cyklu
 * Vytvoøte nìjaký zajímavý ornament, tip: použijte tupý úhel
 */
public class Superstar {
	public static Popsie B1 = new Popsie(640, 360, 12);
	public static void main(String[] args) {
		B1.RotateRight(30);
		for (int k = 0; k < 81; k++) {
		
		for (int j = 0; j < 3; j++) {
			B1.RotateRight(120);
			for (int i = 0; i < 3; i++) {
				B1.Forward(k*3);
				B1.RotateRight(30);
			}
		}
		}
	}
}
