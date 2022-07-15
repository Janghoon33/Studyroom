package mouse;

public class mousemain {

	public static void main(String[] args) {
		
		mouse m1 = new mouse();
		m1.leftclick();
		m1.rightclick();
		m1.drag();
		
		wheelMouse m2 = new wheelMouse();
		m2.leftclick();
		m2.rightclick();
		m2.drag();
		m2.scroll();
		
		humanMouse m3 = new humanMouse();
		m3.leftclick();
		m3.rightclick();
		m3.drag();
		m3.human();
		
	}

}
