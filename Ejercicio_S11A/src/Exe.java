import processing.core.PApplet;

public class Exe extends PApplet {
	private Logic log;

	@Override
	public void setup() {
		size(500, 500);
		log = new Logic(this);
	}

	@Override
	public void draw() {
		background(255);
		log.pintar();
	}

	@Override
	public void mousePressed() {
		log.press();
	}
}
