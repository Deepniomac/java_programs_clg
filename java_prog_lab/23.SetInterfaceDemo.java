// Ex9-b Set interface implementation
import java.util.HashSet;
import java.util.Set;

public class SetInterfaceDemo {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Hyderabad");
        cities.add("Chennai");
        cities.add("Hyderabad");
        cities.add("Pune");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
