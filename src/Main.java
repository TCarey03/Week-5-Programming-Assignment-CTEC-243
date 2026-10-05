import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Artifact> museumList = new ArrayList<>();

        // Add artifacts in unsorted order
        museumList.add(
                new Artifact("M04", "Medieval Armor", "Medieval"));

        museumList.add(
                new Artifact("A01", "Ancient Vase", "Ancient"));

        museumList.add(
                new Artifact("Z99", "Modern Sculpture", "Modern"));

        museumList.add(
                new Artifact("B12", "Renaissance Painting", "Renaissance"));

        // Display before sorting
        System.out.println("Before sorting:");

        for (Artifact artifact : museumList) {
            System.out.println(artifact);
        }

        // Sort the list
        Collections.sort(museumList);

        // Display after sorting
        System.out.println("\nAfter sorting:");

        for (Artifact artifact : museumList) {
            System.out.println(artifact);
        }
    }
}
