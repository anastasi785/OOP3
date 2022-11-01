public class Main {
    public static void main(String[] args) {
        Planteating gazel=new Planteating("Gazel",2,"africa","plants",40);
        System.out.println(gazel.toString());
        Planteating giraffe=new Planteating("Giraffe",3,"africa","plants",20);
        System.out.println(giraffe.toString());
        Planteating horse=new Planteating("Horse",1,"yelds","plants",50);
        System.out.println(horse.toString());
        Planteating horse1=new Planteating("Horse",1,"yelds","plants",50);
        System.out.println(horse1.toString());


        Predators hiena=new Predators("Hiena",1,"desert","Meat",60);
        System.out.println(hiena.toString());
        Predators tiger=new Predators("Tiger",1,"desert","Meat",60);
        System.out.println(tiger.toString());
        Predators bear=new Predators("Bear",1,"Forest","Meat",70);
        System.out.println(bear.toString());


        Amphibians frog=new Amphibians("Frog",1,"forest");
        System.out.println(frog);
        Amphibians freshwaterSnake= new Amphibians("Freshwater Snake",1,"");
        System.out.println(freshwaterSnake);


        Flightless peacock=new Flightless("Peacock",3,"","walking");
        System.out.println(peacock);
        Flightless penguin=new Flightless("Penguin",4,"North","walking");
        System.out.println(penguin);
        Flightless dodo=new Flightless("Dodo bird",2,"","walking");
        System.out.println(dodo);


        Flying sigal=new Flying("Sigal",1,"Russia","Flying");
        System.out.println(sigal);
        Flying albatross=new Flying("Albatross",2,"usa","Flying");
        System.out.println(albatross);
        Flying falcon=new Flying("Falcon",1,"Russia","Flying");
        System.out.println(falcon);


        System.out.println(new Planteating("Horse",1,
                "yelds","plants",50).equals(new Object()));






    }
}