package en.ase.sqt.practice.GSM;

public class GSMConnection implements IGSMConnection {
    private static GSMConnection instance = null;

    private GSMConnection() {
        System.out.println("GSM Connection created.");
    }

    public static synchronized GSMConnection getInstance() {
        if (instance == null) {
            instance = new GSMConnection();
        }
        return instance;
    }

    @Override
    public void call() {
        System.out.println("GSM Connection call started.");
    }

}
