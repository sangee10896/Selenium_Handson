import java.util.ArrayList;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) {
		

			ArrayList<String> a = new ArrayList<String>();
			a.add("Sangeetha");
			a.add("Yaadhu");
			a.add("Krithu");
			a.add("Dharu");
			a.add("Sanjana");
			a.add("Sakthi");

			long c = a.stream().filter(s -> s.startsWith("S")).count();
			
			a.stream().forEach(s -> System.out.println(s));

			System.out.println(c);

		
	}
}
