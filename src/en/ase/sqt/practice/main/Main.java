package en.ase.sqt.practice.main;

import en.ase.sqt.practice.*;
import en.ase.sqt.practice.GSM.ConnectionType;
import en.ase.sqt.practice.GSM.GSMConnection;
import en.ase.sqt.practice.GSM.GSMConnectionRegistry;
import en.ase.sqt.practice.GSM.IGSMConnection;
import en.ase.sqt.practice.features.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- Requirement 1 ---");
        // Create features using the Simple Factory
        AFeature battery = FeatureFactory.createFeature(FeatureType.BATTERY, "Battery1", 100);
        AFeature speaker = FeatureFactory.createFeature(FeatureType.SPEAKER,  "Speaker1", 100);
        AFeature compass = FeatureFactory.createFeature(FeatureType.COMPASS,  "Compass1", 100);

        //Package-private constructor
        //Battery battery1 = new Battery("Battery", 100);

        // Add features to a list
        List<AFeature> features = new ArrayList<AFeature>();
        features.add(battery);
        features.add(speaker);
        features.add(compass);

        // Create a phone with identifier and version
        Phone customPhone = new Phone("BrainX-3000", "v1.1", features);
        System.out.println(customPhone);



        System.out.println("\n--- Requirement 2 ---");
        IGSMConnection conn1 = GSMConnection.getInstance();
        IGSMConnection conn2 = GSMConnection.getInstance();

        conn1.call();

        System.out.println("Are both connections the same? " + (conn1 == conn2));


        System.out.println("\n--- Requirement 3 ---");
        // Three different types of connections
        GSMConnectionRegistry urgentConn = GSMConnectionRegistry.getGSMConnection(ConnectionType.URGENT);
        GSMConnectionRegistry priorityConn = GSMConnectionRegistry.getGSMConnection(ConnectionType.PRIORITY);
        GSMConnectionRegistry regularConn = GSMConnectionRegistry.getGSMConnection(ConnectionType.REGULAR);

        GSMConnectionRegistry anotherUrgentConn = GSMConnectionRegistry.getGSMConnection(ConnectionType.URGENT);

        System.out.println("Urgent Connection: " + urgentConn);
        System.out.println("Priority Connection: " + priorityConn);
        System.out.println("Regular Connection: " + regularConn);
        System.out.println("urgentConn == anotherUrgentConn? " + (urgentConn == anotherUrgentConn));
    }
}
