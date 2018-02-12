import javax.swing.JDialog;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
class Popsie {
	static Platno dt = new Platno(1280, 720, Color.WHITE, true);
	public double x = 0;
	public double y = 0;
	public double a = 0;
	int c = 14;
	public int pom = 1;
	public boolean p = true;
	public int barva = 0;
	public int widths = 1;
	public boolean active = true;
	public Color pole[][] = new Color[28][28];
	public double initx;
	public double inity;
	public Popsie(double x, double y, int c) {
		this.x = x;
		this.y = y;
		this.c = c;
		initx = x;
		inity = y;
		dt.setColor(Color.black);
		dt.setTitle("Vlastimil Landsman Popsie v2.0;     x =  " + (int) x + "; y = " + (int) y + ";");
		if (active)
			Save();
		Forward(0);
	}
	public void Bludiste() {
		Width(4);
		PenUp();
		Forward(50);
		RotateRight(-90);
		Forward(50);
		PenDown();
		RotateRight(90);
  	Backward(300);
		RotateRight(90);
		Forward(500);
		RotateRight(-90);
		Forward(500);
		RotateRight(-90);
		Forward(500);
		RotateRight(-90);
		PenUp();
		Forward(100);
		PenDown();
		RotateRight(-90);
		Forward(400);
		
		RotateRight(90);
		Forward(300);
		RotateRight(90);
		Forward(300);
		RotateRight(90);
		Forward(200);
		RotateRight(-90);
		Forward(100);
		PenUp();
		Backward(50);
		RotateRight(90);
		Backward(50);
		PenDown();
		dt.drawText("Cíl", 600, 165);
		Width(1);
	}
	public void Color(int color) {
		switch (color) {
			case 0 :
				Popsie.dt.setColor(Color.black);
				barva = 0;
			break;
			case 1 :
				Popsie.dt.setColor(Color.blue);
				barva = 1;
			break;
			case 3 :
				Popsie.dt.setColor(Color.cyan);
				barva = 3;
			break;
			case 6 :
				Popsie.dt.setColor(Color.darkGray);
				barva = 6;
			break;
			case 8 :
				Popsie.dt.setColor(Color.gray);
				barva = 8;
			break;
			case 2 :
				Popsie.dt.setColor(Color.green);
				barva = 2;
			break;
			case 7 :
				Popsie.dt.setColor(Color.lightGray);
				barva = 7;
			break;
			case 5 :
				Popsie.dt.setColor(Color.magenta);
				barva = 5;
			break;
			case 4 :
				Popsie.dt.setColor(Color.orange);
				barva = 4;
			break;
			case 13 :
				Popsie.dt.setColor(Color.pink);
				barva = 13;
			break;
			case 12 :
				Popsie.dt.setColor(Color.red);
				barva = 12;
			break;
			case 15 :
				Popsie.dt.setColor(Color.white);
				barva = 15;
			break;
			case 14 :
				Popsie.dt.setColor(Color.yellow);
				barva = 14;
			break;
			default :
				Popsie.dt.setColor(Color.black);
				barva = 0;
			break;
		}
	}
	public void Hide() {
		active = false;
		Load();
	}
	public void Show() {
		active = true;
		Forward(0);
	}
	public void Color(Color fg) {
		dt.setColor(fg);
	}
	public void Width(int width) {
		dt.Stroke(width);
		widths = width;
	}
	public int WhatColor() {
		Hide();
		Color c = dt.RetPix((int) x, (int) y);
		System.out.println("" + c);
		int col = 0;
		if (c == Color.black)
			col = 0;
		if (c == Color.blue)
			col = 1;
		if (c == Color.cyan)
			col = 3;
		if (c == Color.darkGray)
			col = 6;
		if (c == Color.gray)
			col = 8;
		if (c == Color.green)
			col = 2;
		if (c == Color.lightGray)
			col = 7;
		if (c == Color.magenta)
			col = 5;
		if (c == Color.orange)
			col = 4;
		if (c == Color.pink)
			col = 13;
		if (c == Color.red)
			col = 12;
		if (c == Color.white)
			col = 15;
		if (c == Color.yellow)
			col = 14;
		Show();
	  return col;
	}
	public void Ber() {
		dt.stopUpdate();
		int pom = barva;
		double xx = x;
		double yy = y;
		double radi = (Math.PI / 180) * a;
		xx = xx + (Math.sin(radi) * -8);
		yy = yy + (Math.cos(radi) * -8);
		dt.Stroke(1);
		dt.setColor(Color.black);
		Pointw(10, xx, yy);
		Color(c);
		Pointw(16, x, y);
		xx = xx + (Math.sin(radi) * +5);
		yy = yy + (Math.cos(radi) * +5);
		dt.setColor(Color.black);
		Pointw(2, xx, yy);
		xx = xx + (Math.sin(radi) * +5);
		yy = yy + (Math.cos(radi) * +5);
		Pointw(2, xx, yy);
		Color(pom);
		dt.startUpdate();
	}
	public int Random(int high) {
		java.util.Random randomGenerator = new java.util.Random();
		return randomGenerator.nextInt(high);
	}
	public void Point(int r) {
		if (active)
			Load();
		int xx = (int) x;
		int yy = (int) y;
		dt.drawOval(xx - (r / 2), yy - (r / 2), r, r);
		if (active)
			Save();
		if (active)
			Ber();
	}
	public void Pointw(int r, double o, double p) {
		int xx = (int) o;
		int yy = (int) p;
		dt.drawOval(xx - (r / 2), yy - (r / 2), r, r);
	}
	public void Reset() {
		dt.clear();
		for (int i = 0; i < 40; i++)
			for (int j = 0; j < 40; j++)
				pole[i][j] = (Color.white);
		x = 640;
		y = 360;
		a = 0;
		Forward(0);
	}
	public void Init() {
		if (active)
			Load();
		x = initx;
		y = inity;
		a = 0;
		Forward(0);
	}
	public void PenDown() {
		p = true;
	}
	public void PenUp() {
		p = false;
	}
	public void Wait(int ms) {
		dt.Cekej(ms);
	}
	public void Backward(double way) {
		Forward(way * -1);
	}
	public double RotateRight(int angle) {
		if (active)
			Load();
		a = a + angle * -1;
		dt.setTitle("Vlastimil Landsman Popsie v2.0;     x =  " + (int) x + "; y = " + (int) y + ";");
		if (active)
			Save();
		if (active)
			Ber();
		return a;
	}
	public double RotateLeft(int angle) {
		if (active)
			Load();
		a = a + (angle);
		dt.setTitle("Vlastimil Landsman Popsie v2.0;     x =  " + (int) x + "; y = " + (int) y + ";");
		if (active)
			Save();
		if (active)
			Ber();
		return a;
	}
	public void Save() {
		for (int i = 0; i < 28; i++)
			for (int j = 0; j < 28; j++)
				pole[i][j] = dt.RetPix(((int) x) + i - 14, ((int) y) + j - 14);
	}
	public void Load() {
		dt.stopUpdate();
		for (int i = 0; i < 28; i++)
			for (int j = 0; j < 28; j++) {
				dt.setColor(pole[i][j]);
				dt.line(((int) x) + i - 14, ((int) y) + j - 14, ((int) x) + i - 14, ((int) y) + j - 14);
			}
		dt.startUpdate();
		Color(barva);
	}
	public void Forward(double way) {
		dt.stopUpdate();
		if (active)
			Load();
		double rad = (Math.PI / 180) * a;
		double pomx = x;
		double pomy = y;
		Width(widths);
		x = x + (Math.sin(rad) * way * -1);
		y = y + (Math.cos(rad) * way * -1);
		if (y < 19 | y > 701) {
			dt.Zobraz("Beruška mimo plochu plátna!");
			System.exit(0);
		}
		if (x < 19 | x > 1261) {
			dt.Zobraz("Beruška mimo plochu plátna!");
			System.exit(0);
		}
		if (p)
			dt.line((int) pomx, (int) pomy, (int) x, (int) y);
		dt.setTitle("Vlastimil Landsman Popsie v2.0;     x =  " + (int) x + "; y = " + (int) y + ";");
		if (active)
			Save();
		if (active)
			Ber();
		dt.Stroke(1);
		dt.startUpdate();
	}
}
/**
 * Platno is designed for drawing simple graphic objects or animations.<br>
 * This public class creates and displays centered drawing area and offers
 * public methods for drawing that implements DrawingArea class.
 * <p>
 * Changes from last version:
 * <ul>
 * <li>Line color setting in line() deprecated.
 * <li>setColor() method added.
 * <li>New constructor supported.
 * </ul>
 * 
 * @author Vlastimil Landsman (landsmanv@seznam.cz), Roman Tesar
 *         (romant@kiv.zcu.cz) <br>
 *         Czech Republic - Pilsen, 2010
 * @version 3.0
 */
class Platno extends JFrame {
	/** Represents area for drawing */
	private DrawingArea drawingArea;
	private int tm;
	/**
	 * Platno constructor.
	 * 
	 * @param width
	 *          the drawing area width
	 * @param height
	 *          the drawing area height
	 */
	public Platno(int width, int height) {
		this(width, height, Color.WHITE, false);
	}
	/**
	 * Platno constructor.
	 * 
	 * @param width
	 *          the drawing area width
	 * @param height
	 *          the drawing area height
	 * @param bgColor
	 *          the background color of drawing area
	 */
	public Platno(int width, int height, Color bgColor) {
		this(width, height, bgColor, false);
	}
	/**
	 * Platno constructor.
	 * 
	 * @param width
	 *          the drawing area width
	 * @param height
	 *          the drawing area height
	 * @param antialiasing
	 *          antialiasing on/off
	 */
	public Platno(int width, int height, boolean antialiasing) {
		this(width, height, Color.WHITE, antialiasing);
	}
	/**
	 * Platno constructor.
	 * 
	 * @param width
	 *          the drawing area width
	 * @param height
	 *          the drawing area height
	 * @param bgColor
	 *          the background color of drawing area
	 * @param antialiasing
	 *          antialiasing on/off
	 */
	public Platno(int width, int height, Color bgColor, boolean antialiasing) {
		drawingArea = new DrawingArea(new Dimension(width, height), bgColor, antialiasing);
		// Add components to layout
		Container content = this.getContentPane();
		content.setLayout(new BorderLayout());
		content.add(drawingArea, BorderLayout.CENTER);
		// Prepare the main frame
		this.setTitle("Platno  (" + width + "x" + height + ")");
		this.setBackground(bgColor);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		// Center the main window of Platno
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screen.width - this.getSize().width) / 2, (screen.height - this.getSize().height) / 2);
		this.setVisible(true);
	}
	public void Cekej(int tm) {
		drawingArea.Cekej(tm);
	}
	public Color RetPix(int x, int y) {
		return drawingArea.RetPix(x, y);
	}
	public void Stroke(int stroke) {
		drawingArea.Stroke(stroke);
	}
	public String Cti(String text) {
		return drawingArea.Cti(text);
	}
	public void Zobraz(String text) {
		drawingArea.Zobraz(text);
	}
	/**
	 * Draw line.
	 * 
	 * @param x1
	 *          starting line position (coordinate x)
	 * @param y1
	 *          starting line position (coordinate y)
	 * @param x2
	 *          ending line position (coordinate x)
	 * @param y2
	 *          ending line position (coordinate y)
	 */
	public void line(int x1, int y1, int x2, int y2) {
		drawingArea.line(new Point(x1, y1), new Point(x2, y2));
	}
	/**
	 * Nakreslí text na daných souøadnicích(konstruktor).
	 * 
	 * @param text
	 *          text
	 * @param x
	 *          souøadnice x
	 * @param y
	 *          souøadnice y
	 */
	public void drawText(String text, int x, int y) {
		drawingArea.drawText(text, x, y);
	}
	/**
	 * Nakreslí oval na zadaných souøadnicích(konstruktor).
	 * 
	 * @param
	 * @param a
	 *          souøadnice x
	 * @param b
	 *          souøadnice y
	 * @param x
	 *          polomìr x
	 * @param y
	 *          polemìr y
	 */
	public void drawOval(int a, int b, int x, int y) {
		drawingArea.drawOval(a, b, x, y);
	}
	public void drawImage(String text, int x, int y) {
		drawingArea.drawText(text, x, y);
	}
	/**
	 * Clear drawing area.
	 */
	public void clear() {
		drawingArea.clear();
	}
	/**
	 * Set foreground color of drawing area.
	 * 
	 * @param fgColor
	 *          the foreground color of drawing area
	 */
	public void setColor(Color fgColor) {
		drawingArea.setColor(fgColor);
	}
	/**
	 * Disable displaying of drawing area updates.
	 */
	public void stopUpdate() {
		drawingArea.stopUpdate();
	}
	/**
	 * Enable displaying of drawing area updates.
	 */
	public void startUpdate() {
		drawingArea.startUpdate();
	}
}
/**
 * This inner class represents drawing area and implements methods for drawing
 * available from Platno class. Double buffering is used to get rid of the
 * flickering problem.
 * 
 * @author Roman Tesar (romant@kiv.zcu.cz) <br>
 *         Czech Republic - Pilsen, March 2005 <br>
 *         PLEASE SEND ME REPORTS OF ANY BUGS OR SUGGESTIONS YOU HAVE FOR
 *         IMPROVEMENT.
 * @version 1.1
 */
class DrawingArea extends JPanel {
	/** public úprava pro eclipse */
	/** dimension of drawing area */
	private Dimension dimension;
	/** back buffer */
	private BufferedImage image = null;
	/** graphic context of the back buffer */
	private Graphics2D gcImage = null;
	/** antialiasing on/off */
	private boolean antialiasing;
	/** drawing to screen on/off */
	private boolean invalidate = false;
	/**
	 * DrawingArea constructor.
	 * 
	 * @param dimension
	 *          the drawing area dimension
	 * @param bgColor
	 *          the background color of drawing area
	 * @param antialiasing
	 *          antialiasing on/off
	 */
	public DrawingArea(Dimension dimension, Color bgColor, boolean antialiasing) {
		this.dimension = dimension;
		this.setBackground(bgColor);
		this.antialiasing = antialiasing;
		setPreferredSize(dimension);
		this.setVisible(true);
	}
	/**
	 * Initialize back buffer.
	 */
	private void init() {
		if (image == null) {
			image = (BufferedImage) (this.createImage(dimension.width, dimension.height));
			gcImage = image.createGraphics();
			gcImage.setBackground(this.getBackground());
			gcImage.clearRect(0, 0, dimension.width, dimension.height);
			if (antialiasing) {
				gcImage.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				gcImage.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
			}
		}
	}
	/**
	 * Draw back buffer to screen when the JPanel component is repainted. <br>
	 * See JavaDoc JPanel classs for details.
	 */
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (invalidate == false && image != null)
			((Graphics2D) g).drawImage(image, null, 0, 0);
	}
	/**
	 * Draw back buffer to screen.
	 */
	private void drawOnScreen() {
		if (invalidate == false)
			((Graphics2D) this.getGraphics()).drawImage(image, null, 0, 0);
	}
	/**
	 * Draw line.
	 * 
	 * @param startPoint
	 *          starting line point (x,y)
	 * @param endPoint
	 *          ending line point (x,y)
	 */
	public void line(Point startPoint, Point endPoint) {
		init();
		gcImage.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
		drawOnScreen();
	}
	/**
	 * Nakreslí text na daných souøadnicích.
	 * 
	 * @param text
	 *          text
	 * @param x
	 *          souøadnice x
	 * @param y
	 *          souøadnice y
	 */
	public void drawText(String text, int x, int y) {
		init();
		gcImage.drawString(text, x, y);
		drawOnScreen();
	}
	/**
	 * Nakreslí oval na zadaných souøadnicích.
	 * 
	 * @param
	 * @param a
	 *          souøadnice x
	 * @param b
	 *          souøadnice y
	 * @param x
	 *          polomìr x
	 * @param y
	 *          polemìr y
	 */
	public void drawOval(int a, int b, int x, int y) {
		init();
		gcImage.drawOval(a, b, x, y);
		gcImage.fillOval(a, b, x, y);
		drawOnScreen();
	}
	/**
	 * Set foreground color of drawing area.
	 * 
	 * @param fgColor
	 *          the foreground color of drawing area
	 */
	public void setColor(Color fgColor) {
		init();
		gcImage.setColor(fgColor);
	}
	/**
	 * Clear drawing area.
	 */
	public void clear() {
		init();
		gcImage.clearRect(0, 0, dimension.width, dimension.height);
		drawOnScreen();
	}
	/**
	 * Disable displaying of drawing area updates.
	 */
	public void stopUpdate() {
		init();
		invalidate = true;
	}
	public void Stroke(int stroke) {
		init();
		gcImage.setStroke(new BasicStroke(stroke));
		drawOnScreen();
	}
	/**
	 * Enable displaying of drawing area updates.
	 */
	public void startUpdate() {
		init();
		invalidate = false;
		drawOnScreen();
	}
	public void Cekej(int a) {
		/** Zastavi program na Cas v sekundach */
		try {
			Thread.sleep(a);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public String Cti(String text) {
		return (String) JOptionPane.showInputDialog(new JFrame(), text, "Vstup", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("java2sLogo.GIF"), null, "");
	}
	public void Zobraz(String text) {
		String message = text;
		JOptionPane pane = new JOptionPane(message);
		JDialog dialog = pane.createDialog(new JFrame(), "Výstup");
		dialog.show();
	}
	public Color RetPix(int x, int y) {
		int c = image.getRGB(x, y);
		int red = (c & 0x00ff0000) >> 16;
		int green = (c & 0x0000ff00) >> 8;
		int blue = c & 0x000000ff;
		return new Color(red, green, blue);
	}
}
