public class Birds extends Animals{
    private final String typeOfMoving;

    public Birds(String name, int age, String areaOfLiving, String typeOfMoving) {
        super(name, age, areaOfLiving);
        this.typeOfMoving = validofDefault(typeOfMoving,"no information");
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }
    private void hunting(){
        System.out.println("Люблю охоту");
    }

    public String getTypeOfMoving() {
        return typeOfMoving;
    }

    @Override
    public String toString() {
        System.out.println(getClass());

        System.out.println(super.toString());
        return
                "typeOfMoving='" + typeOfMoving + '\'' +
                '}';
    }
}
