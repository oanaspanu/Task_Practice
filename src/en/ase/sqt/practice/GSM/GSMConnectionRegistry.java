package en.ase.sqt.practice.GSM;

import java.util.HashMap;
import java.util.Map;

public class GSMConnectionRegistry {
    private static Map<String, GSMConnectionRegistry> connections = new HashMap<>();
    String type;

    private GSMConnectionRegistry(String type) {
        this.type = type;
        System.out.println("GSMConnectionRegistry created!");
    }

    public static GSMConnectionRegistry getGSMConnection(ConnectionType type) {
        GSMConnectionRegistry conn = connections.get(type.toString());
        if (conn == null) {
            conn = new GSMConnectionRegistry(type.toString());
            connections.put(type.toString(), conn);
        }
        return conn;
    }

    @Override
    public String toString() {
        return "GSMConnectionRegistry{" +
                "type='" + type + '\'' +
                '}';
    }
}
