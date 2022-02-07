package lesson1;

public class Track implements iChallenge {
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean goThrough(iMovable rn) {
        if(rn.run(this)){
            System.out.println("Ему удается пробежать дистанцию "+distance+" км");
            return true;
        }
        System.out.println("Ему не удается пробежать дистанцию "+distance+" км");
        return false;
    }
}
