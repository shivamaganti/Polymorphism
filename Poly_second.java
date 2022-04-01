
class shape {
	
	public void draw() {
		System.out.println("Drawing Shape.");
	}
	
	public void erase() {
		System.out.println("Erasing Shape.");
	}
}

class circle extends shape {
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle.");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Circle.");
	}
}

class Triangle extends shape {
	
	@Override
	public void draw() {
		System.out.println("Drawing Triangle.");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Triangle.");
	}
}

class Square extends shape {
	
	@Override
	public void draw() {
		System.out.println("Drawing Square.");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Square.");
	}
}

class Poly_second {
	public static void main(String[] args) {
		circle c = new circle();
		Triangle t = new Triangle();
		Square s = new Square();
		
		c.draw(); c.erase();
		t.draw(); t.erase();
		s.draw(); s.erase();
	}
}