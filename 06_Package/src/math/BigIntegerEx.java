package math;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerEx {

	public static void main(String[] args) {
		BigInteger big = BigInteger.ONE;
		System.out.println(big);
		
		BigDecimal bd1 = new BigDecimal("123.456");
		System.out.println(bd1);
		
		double db1 = Double.parseDouble("123.456");
		System.out.println(db1);
	}

}
