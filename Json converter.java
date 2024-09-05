import java.util.HashMap;
import java.util.Map;

public class JsonConverter {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("headerParameters", "headerParameters");
        map.put("startTime", "300");
        map.put("typeofTrn", "O");
        map.put("APIServices", "APIServices");
        map.put("timeTaken", "timeTaken");
        map.put("getMethod", "getMethod");
        map.put("getRequestURI", "getRequestURI");
        map.put("getQueryString", "getQueryString");
        map.put("company_ID", "kfslk32");
        map.put("message_Sender", "IMTP");

        // Manually converting the map to a JSON-like string
        String json = mapToJson(map);
        System.out.println(json);
    }

    public static String mapToJson(Map<String, String> map) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");

        int mapSize = map.size();
        int count = 0;

        for (Map.Entry<String, String> entry : map.entrySet()) {
            jsonBuilder.append("\"")
                        .append(entry.getKey())
                        .append("\": \"")
                        .append(entry.getValue())
                        .append("\"");

            // Add a comma after each entry except the last one
            if (count < mapSize - 1) {
                jsonBuilder.append(", ");
            }
            count++;
        }

        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }
}
