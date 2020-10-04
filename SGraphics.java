import java.awt.Graphics;

class SGraphics {
	Graphics g;
	SFrame previous = null;
	SFrame current = new SFrame(SFrame.FROM_BG_COLOR, new SColor());

	public SGraphics(Graphics g) {
		this.g = g;
	}

	public void finishFrame() {
		current.evaluatePixelGrid();
		pervious = current.copy();
		current.render(g);
	}

	public void drawRect(Rect s, SColor c) {
		this.drawRect(s, new STexture(c));
	}

	public void drawRect(Rect s, STexture t) {
		current.addObject(new SRect(s, t));
	}
}

// https://docs.oracle.com/javase/7/docs/api/java/awt/Graphics.html
