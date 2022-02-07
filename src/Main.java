import lesson1.*;
public class Main {
    public static void main(String[] args) {
       /* iMovable at1=new Cat("Барсик",30,1.8f);
        iChallenge ch1 =new Wall(2);
        iChallenge ch2 = new Treadmill(2);
        System.out.println(at1);
        ch2.goThrough(at1);*/

        iMovable[] atlets = new iMovable[]{
                new Cat ("Барсик",20,1.4f),
                new Robot ("ПрыБе 8.2",80,2.4f),
                new Robot ("HP LJ 1212nf",0,0f),
                new Human ("Борис",15,1.3f),
                new Cat ("Маркиз",24,1.8f),
                new Human ("Алексей",20,1.7f),
        };

        iChallenge[] wod = new iChallenge[]{
                new Track(3),
                new Wall(0.8f),
                new Track(3),
                new Wall(1.2f),
                new Track(4),
                new Wall(1.4f),
                new Track(4)
        };
        for (iMovable atl:
                atlets) {
            System.out.println(atl);
            for (iChallenge ch:
                 wod) {
                if(!ch.goThrough(atl)){
                    System.out.println("Кандидат сходит с полосы");
                    break;
                }

            }
        }

    }
}
