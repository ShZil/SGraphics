import java.awt.Color;

// we do NOT need this class, a point can store rbg values
// But it looks better

class SColor {
	int r;
	int g;
	int b;
	// red/green/blue 0-255 format.
	// Optimization idea: use byte instead of int, and add 128 in each calculation. byte = Int.8Bit

	private static int floatToInt(float x) {
		return (int)(x * 255);
	}

	public SColor() {
		this.r = 0;
		this.g = 0;
		this.b = 0;
	}

	public SColor(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public SColor(int[] rgb) {
		this.r = rgb[0];
		this.g = rgb[1];
		this.b = rgb[2];
	}

	public SColor(int gray) {
		this.r = gray;
		this.g = gray;
		this.b = gray;
	}

	public SColor(float r, float g, float b) {
		this.r = SColor.floatToInt(r);
		this.g = SColor.floatToInt(g);
		this.b = SColor.floatToInt(b);
	}

	public SColor(float[] rgb) {
		this.r = SColor.floatToInt(rgb[0]);
		this.g = SColor.floatToInt(rgb[1]);
		this.b = SColor.floatToInt(rgb[2]);
	}

	public SColor(float gray) {
		int staticColor = this.floatToInt(gray);
		this.r = staticColor;
		this.g = staticColor;
		this.b = staticColor;
	}

	public SColor copy() {
		return new SColor(this.r, this.g, this.b);
	}

	public Color getColor() {
		return new Color(this.r, this.g, this.b);
	}

	// Format:
	// "GREY:brightness" or "RGB:r,g,b"
	public String toString() {
		if (r == g && g == b) {
			return "GREY:"+r;
		} else {
			return "RGB:"+r+","+g+","+b;
		}
	}

	// Get the average value of r, g, and b.
	public int getBrightness() {
		return (r + g + b) / 3;
	}
}
