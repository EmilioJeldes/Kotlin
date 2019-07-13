package cl.ejeldes.java.datatypes;

/**
 * Created by ejeldes on Jul 10, 2019
 */
public class DummyType {

    public String isVacationTime(boolean isOnVacation) {
        return isOnVacation ? "Is on vacation time" : "It's working";
    }

    public void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
