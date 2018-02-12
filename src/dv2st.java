/**
 * DV2ST 
 * Projekt Popsie
 * @author Vlastimil Landsman (landsmanv@seznam.cz)
 * CZ - Plzeò, 28.10.2010
 * @version  2.0
 * 
 * Popsie B = new Popsie(240, 320, 14); ... 
 * ................................. vytvoøí berušku na pozici 240,320, barva krovek 14
 * B.Color(1); ..................... nastavení barvy pera na modrou; (nebo èíslo 2)
 * B.Forward(100); ................. beruška popojde o 100 kroku vpøed;
 * B.Backward(50); ................. beruška popojde o 50 kroku vzad;
 * B.RotateLeft(60); ............... beruška se otoèí o 60 stupòù vlevo;
 * B.RotateRight(30); .............. beruška se otoèí o 30 stupòù vpravo;
 * B.Width(3); ..................... nastaví šíøku pera berušky na 3
 * B.Reset(); ...................... vrátí berušku na výchozí pozici, vše se smaže;
 * B.Init(); ....................... vrátí berušku na výchozí pozici;
 * B.Point(10); .................... nakreslí puntík velikosti 10;
 * B.PenUp(); ...................... vypne pero Berušky;
 * B.PenDown(); .................... zapne pero Berušky;
 * B.Wait(100); .................... beruška poèká 100 ms;
 * B.Random(15); ................... Vygeneruje náhodné èíslo od 0 do 15;
 * B.Hide(); ....................... Skryje berušku
 * B.Show(); ....................... Zobrazí berušku
 * for (int i = 0;i < 8; i++) {} ... cyklus s 8 opakováními
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
