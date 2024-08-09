package main_app;
import com.example.model.Employee;

public class MainApp {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.name = "Mg Mg";
		emp1.age = 29;
		emp1.address = "Dawei";
		
		Employee emp2 = new Employee();
		
		emp2.name = "Kyaw Kyaw";
		emp2.age = 30;
		emp2.address = "Yangon";
		
		Employee emp3 = new Employee();
		
		emp2.name = "Ni Ni";
		emp2.age = 30;
		emp2.address = "Thai";
		
		
		emp2.display();
		

	}

}
