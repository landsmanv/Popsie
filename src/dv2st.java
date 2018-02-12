/**
 * DV2ST 
 * Projekt Popsie
 * @author Vlastimil Landsman (landsmanv@seznam.cz)
 * CZ - Plze�, 28.10.2010
 * @version  2.0
 * 
 * Popsie B = new Popsie(240, 320, 14); ... 
 * ................................. vytvo�� beru�ku na pozici 240,320, barva krovek 14
 * B.Color(1); ..................... nastaven� barvy pera na modrou; (nebo ��slo 2)
 * B.Forward(100); ................. beru�ka popojde o 100 kroku vp�ed;
 * B.Backward(50); ................. beru�ka popojde o 50 kroku vzad;
 * B.RotateLeft(60); ............... beru�ka se oto�� o 60 stup�� vlevo;
 * B.RotateRight(30); .............. beru�ka se oto�� o 30 stup�� vpravo;
 * B.Width(3); ..................... nastav� ���ku pera beru�ky na 3
 * B.Reset(); ...................... vr�t� beru�ku na v�choz� pozici, v�e se sma�e;
 * B.Init(); ....................... vr�t� beru�ku na v�choz� pozici;
 * B.Point(10); .................... nakresl� punt�k velikosti 10;
 * B.PenUp(); ...................... vypne pero Beru�ky;
 * B.PenDown(); .................... zapne pero Beru�ky;
 * B.Wait(100); .................... beru�ka po�k� 100 ms;
 * B.Random(15); ................... Vygeneruje n�hodn� ��slo od 0 do 15;
 * B.Hide(); ....................... Skryje beru�ku
 * B.Show(); ....................... Zobraz� beru�ku
 * for (int i = 0;i < 8; i++) {} ... cyklus s 8 opakov�n�mi
 */

public class dv2st {
	public static void main(String[] args) {
		Popsie B1 = new Popsie(960, 300, 4);
		Popsie B2 = new Popsie(320, 300, 2);
		Popsie B3 = new Popsie(1100, 400, 3);
		Popsie B4 = new Popsie(400, 500, 12);
		Popsie B5 = new Popsie(640, 700, 14);
		B1.Width(5);
		B2.Width(5);
		B3.Width(5);
		B4.Width(5);
		B5.Color(1);
		for (int i = 0; i < 15; i++) {
			B1.Forward(200);
			B2.Forward(200);
			B3.Backward(200);
			B4.Forward(50);
			B4.Color(B4.Random(15));
			B4.Point(15);
			B4.Color(B4.Random(15));
			B5.PenUp();
			B5.Forward(20);
			B1.Wait(200);
			B5.PenDown();
			B5.Forward(20);
			B1.RotateRight(144);
			B2.RotateRight(168);
			B3.RotateRight(120);
			B4.RotateLeft(30);
			B1.Wait(200);
		}
	}
}
