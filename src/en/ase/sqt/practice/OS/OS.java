package en.ase.sqt.practice.OS;

public class OS implements Cloneable{
    int version = 0;

    public OS(int version) throws InterruptedException {
        this.version = version;
        System.out.println("Building the OS v" + this.version + ".");
        Thread.sleep(5000);
        System.out.println("OS build finished.");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        OS clone = (OS) super.clone();
        clone.version = this.version;
        System.out.println("Cloning the OS v" + this.version + ".");
        return clone;
    }

    @Override
    public String toString() {
        return "OS{" +
                "version=" + version +
                '}';
    }
}
