
class fruit {
	String name, taste;
	int size;
	public fruit(String Name, String Taste, int Size) {
		//System.out.println("Name : " + Name + " Taste : " + " Size : " + Size);
		name = Name;
		taste = Taste;
		size = Size;
		
	}
	void eat() {
		System.out.println("Name : " + name + " Taste : " + taste+ " Size : " + size);
	}
}

class Apple extends fruit {

	public Apple(String Name, String Taste, int Size) {
		super(Name, Taste, Size);
	}
	
	@Override
	public void eat() {
		super.eat();
	}
	
}

class Orange extends fruit {

	public Orange(String Name, String Taste, int Size) {
		super(Name, Taste, Size);
		
	}
	@Override
	public void eat() {
		super.eat();
	}
	
	
}

class Poly_first {
	public static void main (String[] args) {
		Apple a = new Apple("Apple", "Super", 30);
		Orange o = new Orange("Orange", "Good", 28);
		a.eat();
		o.eat();
	}
}