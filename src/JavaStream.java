import java.util.ArrayList;

public class JavaStream {

	public  void main(String[] args) {
		{

			ArrayList<String> a = new ArrayList<String>();
			a.add("Sangeetha");
			a.add("Yaadhu");
			a.add("Krithu");
			a.add("Dharu");
			a.add("Sanjana");
			a.add("Sakthi");

			Long c = a.stream().filter(s -> s.startsWith("S")).count();
			System.out.println(c);

		}
	}
}
