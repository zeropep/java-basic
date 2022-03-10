package generics;

public class FruitBox {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<>();
		Box<Apple> appleBox = new Box<>();
		Box<Toy> toyBox = new Box<>();
		
		// Box<Apple> appleBox2 = new Box<Orange>(); => generics에 의해 타입제한으로 에러.
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Orange());
		fruitBox.add(new Apple());
		// fruitBox.add(new Toy()); => fruit타입과 관련이 없으므로 에러.
		// toyBox.add(new Apple()); => toy타입과 관련이 없으므로 에러.
	}

}
