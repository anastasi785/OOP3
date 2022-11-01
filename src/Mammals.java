import java.util.Objects;

public class Mammals extends Animals{

    private int speedOfMoving;
    private String typeOfFood;

    public Mammals(String name, int age, String areaOfLiving,String typeOfFood, int speedOfMoving) {
        super(name, age, areaOfLiving);
        this.speedOfMoving = speedOfMoving;
        this.typeOfFood=validofDefault(typeOfFood,"no information");
    }
    private void walking(){
        System.out.println("Пора на прогулку");
    }

    @Override
    public void eat() {
        System.out.println("Пора кушать");

    }

    @Override
    public void go() {
        System.out.println(" Гулять!");

    }


    public int getSpeedOfMoving() {
        return speedOfMoving;
    }

    public void setSpeedOfMoving(int speedOfMoving) {
        this.speedOfMoving = speedOfMoving;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    @Override
    public String toString() {
        System.out.println(getClass());

        System.out.println(super.toString());

        return "speedOfMoving=" + speedOfMoving +
                ", typeOfFood='" + typeOfFood + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speedOfMoving == mammals.speedOfMoving && Objects.equals(typeOfFood, mammals.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speedOfMoving, typeOfFood);
    }
}
