public class Flying extends Birds{
    public Flying(String name, int age, String areaOfLiving, String typeOfMoving) {
        super(name, age, areaOfLiving, typeOfMoving);
    }
    public void fly(){
        System.out.println( "Пора полетать!");
    }
}
