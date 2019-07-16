package cl.ejeldes.java.challenge3;

/**
 * Created by ejeldes on Jul 16, 2019
 */
public class MountainBike extends Bicycle {

    private int seatHeight;

    public MountainBike(int cadence, int gear, int speed, int seatHeight) {
        super(cadence, gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
}
