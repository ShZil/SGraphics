class SFrame {
	SObject[] objects = new SObject[256];
	SPixelGrid pg;

	public SFrame(int w, int h) {
		pg = new SPixelGrid(w, h);
	}

	public void addObject(SObject) {
		SObject[] arr = SUtil.replaceSingleNull(this.objects, SObject);
		if (arr == null) {
			System.out.println("The Array is Full! Increase the size or remove elements");
		} else {
			this.objects = arr;
		}
	}

	public void evaluatePixelGrid() {
		for (SObject o : objects) {
			pg.drawObject(o);
		}
	}

	public void render(Graphics gr) {
		pg.render(gr);
	}

	@Override
	public SFrame copy() {
		// Fill Method
	}
}
