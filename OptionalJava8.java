import java.util.Optional;

public class OptionalJava8 {

	public static Optional<String> getName() {
		String name = "somesh";
		Optional<String> op = Optional.ofNullable(name);
		return op;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = null;// Optional ek static class hai
		Optional<String> optional = Optional.ofNullable(str); // yah optional object ko create karne ke liye hota hai
		System.out.println(optional.isPresent());  // yah check karta hai value present hai ya nahi 
		System.out.println(optional.orElse("No Value in this Object"));//agar optional class ke container me koi bhi value present nahi hai to yah value return Hogi
	    System.out.println(optional.get());
		Optional<String> nameOptional = getName();
		System.out.println(nameOptional.orElse("null return "));

	}

}
