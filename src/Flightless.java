public class Flightless extends Birds{
    public Flightless(String name, int age, String areaOfLiving, String typeOfMoving) {
        super(name, age, areaOfLiving, typeOfMoving);
    }
    private void walk(){
        System.out.println("Пора гулять");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
