package lesson2.HW2;

public class Character implements HasHealthPoint, Tiredness {

    private int life;
    private int fatigue;

    public Character(int life, int fatigue) {
        this.life = life;
        this.fatigue = fatigue;
    }

    public int getLife() {
        return life;
    }

    public int getFatigue() {
        return fatigue;
    }
}

