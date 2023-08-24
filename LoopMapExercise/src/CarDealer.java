import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CarDealer {

    public static void main(String[] args) {
        //HashMap<String,String> vehicles = new HashMap<>();
        Map<String, String> vehicles = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        //The model is the Key, the make is the Value.

        vehicles.put("Camry","Toyota");
        vehicles.put("Corolla","Toyota");
        vehicles.put("Mustang","Ford");
        vehicles.put("Civic","Honda");
        vehicles.put("Accord","Honda");
        vehicles.put("F-Series","Ford");
        vehicles.put("Corvette","Chevrolet");
        vehicles.put("Silverado","Chevrolet");
        vehicles.put("Wrangler","Jeep");
        vehicles.put("Grand Cherokee","Jeep");
        vehicles.put("Ultima","Nissan");
        vehicles.put("Rogue","Nissan");


        Scanner in = new Scanner(System.in);
        String model = in.nextLine();
        //if we have it
        if(vehicles.containsKey(model))
            System.out.println("Oh, you're looking for a " + Character.toUpperCase(model.charAt(0)) + model.substring(1).toLowerCase() + "? Our " + vehicles.get(model) +" selection is right over here...");
        //if we don't
        else{
            System.out.println("Unfortunately, we do not carry that model.");
        }
    }
}
