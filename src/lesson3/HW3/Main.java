package lesson3.HW3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook(1000, 8, "Model A"));
        notebooks.add(new Notebook(1500, 16, "Model B"));
        notebooks.add(new Notebook(800, 4, "Model C"));
        notebooks.add(new Notebook(1200, 8, "Model D"));

        // Sort by ascending price
        Collections.sort(notebooks, Comparator.comparing(Notebook::getCost));

        System.out.println("Notebooks sorted by ascending price:");
        for (Notebook notebook : notebooks) {
            System.out.println(notebook.getModel() + " - " + notebook.getCost() + " - " + notebook.getRam());
        }

        // Sort by descending price
        Collections.sort(notebooks, Comparator.comparing(Notebook::getCost).reversed());

        System.out.println("Notebooks sorted by descending price:");
        for (Notebook notebook : notebooks) {
            System.out.println(notebook.getModel() + " - " + notebook.getCost() + " - " + notebook.getRam());
        }

        // Sort by RAM in descending order. If the RAMs are equal - in descending order of price.
        Collections.sort(notebooks, Comparator.comparing(Notebook::getRam).reversed().thenComparing(Comparator.comparing(Notebook::getCost).reversed()));

        System.out.println("Notebooks sorted by RAM in descending order:");
        for (Notebook notebook : notebooks) {
            System.out.println(notebook.getModel() + " - " + notebook.getCost() + " - " + notebook.getRam());
        }

        // Sort by model
        Collections.sort(notebooks, Comparator.comparing(Notebook::getModel));

        System.out.println("Notebooks sorted by model:");
        for (Notebook notebook : notebooks) {
            System.out.println(notebook.getModel() + " - " + notebook.getCost() + " - " + notebook.getRam());
        }
    }
}
