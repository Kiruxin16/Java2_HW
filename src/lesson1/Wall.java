package lesson1;

public class Wall implements iChallenge {
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public boolean goThrough(iMovable jum) {
        if(jum.jump(this)){
            System.out.println("Ему удается перепрыгнуть стену высотой "+height+" м");
            return true;
        }
        System.out.println("Ему не удается перепрыгнуть стену высотой "+height+" м");
        return false;
    }

    public float getHeight() {
        return height;
    }
}
