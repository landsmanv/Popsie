/* Vytvoøte cyklus, který nakreslí ètverec, trojuhelník, osmiúhelník, 5ti cípou hvìzdu,
 * Nápovìda: zkuste vložit do cyklu èekání aby jste vidìli co beruška dìlá
 * Nakreslete pravidelný trojúhelník složený ze 6 trojúhelníkù, porovnejte s kódem bez cyklu
 * Vytvoøte nìjaký zajímavý ornament, tip: použijte tupý úhel
 */
public class Pavouk {
	public static Popsie B1 = new Popsie(640, 360, 2);
	public static void main(String[] args) {
		for (int k = 0; k < 40; k++) {
		for (int j = 0; j < 40; j++) {
			B1.RotateRight(30);
			for (int i = 0; i < 3; i++) {
				B1.Forward(k*2);
				B1.RotateRight(120);
			}
		}
	}
	}
}
