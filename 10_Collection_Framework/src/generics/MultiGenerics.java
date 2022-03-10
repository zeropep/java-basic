package generics;

import java.util.ArrayList;
import java.util.List;

class Product {
	private String pno;
	private int price;
	
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

class User {
	private String name;
	private List<Product> prodList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProdList() {
		return prodList;
	}
	public void setProdList(List<Product> prodList) {
		this.prodList = prodList;
	}
}

public class MultiGenerics {

	public static void main(String[] args) {
		// 예를 들면, 사용자 목록에 그 사용자들이 어떤 상품을 구매했는지,
		// 혹은 게시판 글 목록에서 한 글에 달린 댓글 리스트
		// 지점별 주문 목록에서 주문취소 목록 조회
		
		List<User> userList = new ArrayList<>();
		List<Product> prodList = userList.get(0).getProdList(); // 0번 유저의 상품구매목록
		
		List<List<Product>> myList = new ArrayList<>(); // 리스트에 상품리스트 객체를 담는다.
		// 조회시 중첩 반복문을 고려해야 하므로 잘 사용하지는 않는다.
	}

}
