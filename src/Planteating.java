public class Planteating extends Mammals{


    public Planteating(String name, int age, String areaOfLiving, String typeOfFood, int speedOfMoving) {
        super(name, age, areaOfLiving, typeOfFood, speedOfMoving);
    }

    private void pasture(){
        System.out.println("Пора пастись");

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
