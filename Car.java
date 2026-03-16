public class Car {
    public final int wheels = 4;
    public double power;
    public String color;
    private boolean isDrive;
    private int speed;
    private int maxSpeed = 180;
    private static int counterCar = 0;
    private static int counterCar2 = 0;

    public Car(int max) {
        maxSpeed = max;
        //wheels = 5;
        counterCar++;
    }

    public Car() {
        counterCar2++;
    }

    public int getCounterCar() {
        return counterCar;
    }
    public int getCounterCar2() {
        return counterCar2;
    }

    public void Drive() {
        if (speed < maxSpeed) {
            speed += 5;
        }        
    }

    public boolean isDriving() {
        if (speed > 0) {
            isDrive = true;
        } else if (speed == 0) {
            isDrive = false;
        }
        return isDrive;
    }

    public void Slow() {
        if (speed > 0) {
            speed -= 5;
        }        
    }

    public int getSpeed() {
        return speed;
    }
}
