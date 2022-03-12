package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx01 {
	
	public static void main(String[] args) {
		Stream<Double> dbStream = Stream.of(5.1, 4.7, 3.9, 6.2, 1.4, 7.8);
		dbStream.forEach(System.out::println);  // dynamic converted variable 가변변수
		
		IntStream intStream = IntStream.range(1, 46);
		intStream.forEach((n) -> {System.out.println(n%2==0);});
		
		// 랜덤 추출
		IntStream randomStream = new Random().ints(6);
		randomStream.forEach(System.out::println);
	}
}
