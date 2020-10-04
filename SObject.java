class SObject {
	SShape s;
	STexture t;

	public Rect getBoundingBox() {
		return s.getBoundingBox();
	}

	public SColor getPixel(int x, int y) {
		return getPixel(new Pt(x, y));
	}

	public SColor getPixel(Pt a) {
		if (s.collides(a)) {
			return t.getColorByPosition(a);
		} else {
			return null;
		}

	public SObject(SShape s, STexture t){
		this.s = s;
		this.t = t;
	}

	public SObject copy(){
		return new SObject(s, t);
	}
}
