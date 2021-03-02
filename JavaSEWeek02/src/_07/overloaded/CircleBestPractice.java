package _07.overloaded;

public class CircleBestPractice {

	private int xPos;
	private int yPos;
	private int radius;

	public CircleBestPractice(int x, int y, int r) {
		xPos = x;
		yPos = y;
		radius = r;
	}

	public CircleBestPractice(int x, int y) {
		this(x, y, 10);
	}

	public CircleBestPractice() {
		this(20, 20, 10);
	}
}

// bu yaklasim daha guzel bir yaklasimdir!
// constructorlari overloaded ettigimizde. reusable olarak kullanabiliriz.