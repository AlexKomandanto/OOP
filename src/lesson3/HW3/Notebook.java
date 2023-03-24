package lesson3.HW3;
import java.util.*;

public class Notebook {
    private int cost;
    private int ram;
    private String model;

    public Notebook(int cost, int ram, String model) {
        this.cost = cost;
        this.ram = ram;
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public int getRam() {
        return ram;
    }

    public String getModel() {
        return model;
    }
}
