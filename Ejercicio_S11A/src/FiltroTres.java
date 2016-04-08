import processing.core.PImage;

public class FiltroTres {
	private PImage img;

	public FiltroTres(PImage imgRec) {
		this.img = imgRec;
	}

	public void filter() {
		img.loadPixels();
		for (int i = 0; i < img.width; i++) {
			for (int j = 0; j < img.height; j++) {
				int rec = i + j * img.width;
			}
		}
	}
}
