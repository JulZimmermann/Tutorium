package termin17Januar18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        Map<String, List<String>> freunde = new HashMap<>();

        freunde.put("Dominik", new ArrayList<String>());

        List<String> dominiksFreunde = freunde.get("Dominik");
        dominiksFreunde.add("Hanz");

        for(Map.Entry<String, List<String>> entry : freunde.entrySet()) {
            entry.getValue();
        }

    }

}
