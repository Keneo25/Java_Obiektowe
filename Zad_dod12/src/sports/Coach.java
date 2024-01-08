package sports;

public class Coach implements Cloneable{
    String name;
    String sport;
    int championshipWon;

    public Coach(String name, String sport, int championshipWon) {
        this.name = name;
        this.sport = sport;
        this.championshipWon = championshipWon;
    }

    public void setChampionshipWon(int championshipWon) {
        this.championshipWon = championshipWon;
    }

    @Override
    public Coach clone() {
        try {
            Coach clone = (Coach) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "{championshipWon=" + championshipWon +
                '}';
    }
}

class Test{
    public static void main(String[] args) {
        Coach coach = new Coach("Adam", "gym", 3);
        Coach coach1 = new Coach("Bartek", "tenis", 6);

        System.out.println(coach);
        System.out.println(coach1);
        coach1 = coach.clone();
        System.out.println(coach);
        System.out.println(coach1);
        coach.setChampionshipWon(10);
        System.out.println(coach);
        System.out.println(coach1);


    }
}

