import java.util.HashMap;
import java.util.Map;

public class TransportService {

    public void selectCheapestTransport() {

        HashMap<String, Double> transporters = new HashMap<>();
        transporters.put("DHL", 500.0);
        transporters.put("BlueDart", 450.0);
        transporters.put("FedEx", 600.0);

        String best = "";
        double minCost = Double.MAX_VALUE;

        for(Map.Entry<String, Double> entry : transporters.entrySet()) {
            if(entry.getValue() < minCost) {
                minCost = entry.getValue();
                best = entry.getKey();
            }
        }

        System.out.println("Best Transporter: " + best + " Cost: ₹" + minCost);
    }
}