public abstract class Animals {
  private final String name;
  private final int age;
  private final String areaOfLiving;
    protected String validofDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }




    public Animals(String name, int age, String areaOfLiving) {
        this.name = validofDefault(name,"no information");
        this.age = age;
        this.areaOfLiving = validofDefault(areaOfLiving,"no information");
    }
    public abstract void eat();

    public abstract void go();

    public void sleep(){
        System.out.println("Мне пора спать" + getName());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAreaOfLiving() {
        return areaOfLiving;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", areaOfLiving='" + areaOfLiving + '\'' +
                '}';
    }
}

