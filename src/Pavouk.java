/* Vytvo�te cyklus, kter� nakresl� �tverec, trojuheln�k, osmi�heln�k, 5ti c�pou hv�zdu,
 * N�pov�da: zkuste vlo�it do cyklu �ek�n� aby jste vid�li co beru�ka d�l�
 * Nakreslete pravideln� troj�heln�k slo�en� ze 6 troj�heln�k�, porovnejte s k�dem bez cyklu
 * Vytvo�te n�jak� zaj�mav� ornament, tip: pou�ijte tup� �hel
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
