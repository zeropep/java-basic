package enums;

public class EnumEx01 {

	public static void main(String[] args) {
		EnumEx e1 = EnumEx.EAST;
		EnumEx e2 = EnumEx.WEST;
		EnumEx e3 = EnumEx.valueOf("SOUTH");
		EnumEx e4 = Enum.valueOf(EnumEx.class, "NORTH");
		EnumEx e5 = EnumEx.valueOf("EAST");
		EnumEx e6 = Enum.valueOf(EnumEx.class, "WEST");
		EnumEx e7 = Enum.valueOf(EnumEx.class, "SOUTH");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		System.out.println(e1 == e2); // false
		System.out.println(e3 == e4); // false
		System.out.println(e1 == e5); // true
		System.out.println(e2 == e6); // true
		System.out.println(e3 == e7); // true
		System.out.println(e3.equals(e7)); // true
		
		EnumEx[] enArr = EnumEx.values();
		
		for (EnumEx num : enArr) {
			System.out.println(num.name() + " : " + num.ordinal());
		}
	}

}
