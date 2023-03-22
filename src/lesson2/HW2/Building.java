package lesson2.HW2;

public class Building implements HasHealthPoint {

    private int life;

    public Building(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }
}

