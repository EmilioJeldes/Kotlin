package cl.ejeldes.java.oop;

/**
 * Created by ejeldes on Jul 14, 2019
 */
public class JavaEmployee {

    private final String firstName;
    private final boolean fullTime;

    public JavaEmployee(String firstName) {
        this.firstName = firstName;
        this.fullTime = true;
    }

    public JavaEmployee(String firstName, boolean fullTime) {
        this.firstName = firstName;
        this.fullTime = fullTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isFullTime() {
        return fullTime;
    }
}
