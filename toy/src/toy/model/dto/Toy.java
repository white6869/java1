package toy.model.dto;

import java.util.Objects;
import java.util.Set;

public class Toy {

	private String toyName; // 장난감 이름
	private int age;		// 사용 연령
	private int price;		// 가격
	private String color;	// 색상
	private String manufactureDate;		// 제조년원일
	private Set<String> materials; 	// 사용재료
	
	public Toy() {
		
	}

	public Toy(String toyName, int age, int price, String color, String manufactureDate, Set<String> materials) {
		super();
		this.toyName = toyName;
		this.age = age;
		this.price = price;
		this.color = color;
		this.manufactureDate = manufactureDate;
		this.materials = materials;
	}

	public String getToyName() {
		return toyName;
	}

	public void setToyName(String toyName) {
		this.toyName = toyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Set<String> getMaterials() {
		return materials;
	}

	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}

	@Override
	public String toString() {
		return "이름: " + toyName + " / 가격: " + price + " / 색상: " + color+ " / 사용가능연령: " + age + " / 제조년월일: " + manufactureDate
				+ " / 재료: " +  getMaterialsAsString() +"\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, color, manufactureDate, price, materials, toyName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) && manufactureDate == other.manufactureDate && price == other.price
				&& Objects.equals(materials, other.materials) && Objects.equals(toyName, other.toyName);
	}

	public String getMaterialsAsString() {
		StringBuilder sb = new StringBuilder(); // 가변 문자열 객체(비동기)
		
		if(materials.size() == 0) {
			return "없음";
		}
		
		
		for(String material : materials) {
			sb.append(material).append(", "); // 문자열 뒤에 이어쓰기
		}
		
		sb.setLength(sb.length() - 2);
		
		return sb.toString();
		
	}
	
	
	
	
}
