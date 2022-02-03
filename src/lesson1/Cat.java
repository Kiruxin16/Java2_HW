package lesson1;

public class Cat implements iMovable{
    static private final int MAX_RUN =30;
    static private final float MAX_JUMP =2f;
    private String name;
    private int runAbil;
    private float jumpAbil;

    public Cat(String name, int runAbil, float jumpAbil) {
        this.name = name;
        this.runAbil = runAbil<MAX_RUN? runAbil: MAX_RUN;
        this.jumpAbil = jumpAbil<MAX_JUMP? jumpAbil: MAX_JUMP;
    }

    @Override
    public String toString() {
        return  "Кот по имени " + name +
                ", может пробежать до " + runAbil +
                "км, может перепрыгнуть стену высотой до " + jumpAbil +"м";
    }

    @Override
    public boolean run(Track tr) {
        System.out.println("Кот "+name+" побежал!");
        runAbil-=tr.getDistance();
        return runAbil>=0;

    }

    @Override
    public boolean jump(Wall wall) {
        System.out.println("Кот "+name+" прыгает!");
        return (wall.getHeight()<=jumpAbil);

    }


}
