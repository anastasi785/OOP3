public class Amphibians extends Animals{


    public Amphibians(String name, int age, String areaOfLiving) {
        super(name, age, areaOfLiving);

    }



    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }
    private void hunting(){
        System.out.println("Пора на охоту!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
