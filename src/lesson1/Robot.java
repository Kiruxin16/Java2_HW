package lesson1;

public class Robot implements iMovable{
    static private final int MAX_RUN =100;
    static private final float MAX_JUMP =6f;
    private String name;
    private int runAbil;
    private float jumpAbil;

    public Robot(String name, int runAbil, float jumpAbil) {
        this.name = name;
        this.runAbil = runAbil<MAX_RUN? runAbil: MAX_RUN;
        this.jumpAbil = jumpAbil<MAX_JUMP? jumpAbil: MAX_JUMP;
    }

    @Override
    public String toString() {
        return  "Робот именованный как" + name +
                ", может пробежать до " + runAbil +
                "км, может перепрыгнуть стену высотой до " + jumpAbil +"м";
    }

    @Override
    public boolean run(Track tr) {
        System.out.println("Робот "+name+" побежал!");
        runAbil-=tr.getDistance();
        return runAbil>=0;

    }

    @Override
    public boolean jump(Wall wall) {
        System.out.println("Робот "+name+" прыгает!");
        return (wall.getHeight()<=jumpAbil);

    }
}
