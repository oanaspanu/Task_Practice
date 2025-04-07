package en.ase.sqt.practice.OS;

import java.util.HashMap;
import java.util.Map;

public class OSRegistry {
    private static Map<String, OS> prototypes = new HashMap<>();

    static{
        try {
            prototypes.put("V1", new OS(1));
            prototypes.put("V2", new OS(2));
            prototypes.put("V3", new OS(3));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static OS getOS(VersionType type) throws CloneNotSupportedException {
        switch (type) {
            case V1: return (OS) prototypes.get("V1").clone();
            case V2: return (OS) prototypes.get("V2").clone();
            case V3: return (OS) prototypes.get("V3").clone();
            default: throw new CloneNotSupportedException();
        }
    }
}
