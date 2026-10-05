import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        LinkedCollection<Artifact> ledger =
                new LinkedCollection<>();

        Artifact artifact1 =
                new Artifact("A101", "Ancient Hammer", "Ancient");

        Artifact artifact2 =
                new Artifact("B205", "Renaissance Painting", "Renaissance");

        Artifact artifact3 =
                new Artifact("C309", "Roman Coin", "Roman");

        Artifact artifact4 =
                new Artifact("D410", "Medieval Sword", "Medieval");

        // Add artifacts
        ledger.add(artifact1);
        ledger.add(artifact2);
        ledger.add(artifact3);
        ledger.add(artifact4);

        System.out.println("Linked collection size: "
                + ledger.size());

        // Search using an ID-only Artifact
        Artifact searchKey =
                new Artifact("B205", "", "");

        System.out.println("\nSearching for B205...");

        if (ledger.contains(searchKey)) {
            System.out.println("Artifact found:");
            System.out.println(ledger.get(searchKey));
        } else {
            System.out.println("Artifact not found.");
        }

        // Remove B205
        System.out.println("\nRemoving B205...");

        boolean removed = ledger.remove(searchKey);

        System.out.println("Was artifact removed? " + removed);
        System.out.println("Collection size after removal: "
                + ledger.size());

        // Verify B205 is gone
        System.out.println("\nChecking B205 again...");

        if (ledger.contains(searchKey)) {
            System.out.println("B205 is still in the collection.");
        } else {
            System.out.println("B205 was successfully removed.");
        }

        // Verify another artifact is still there
        Artifact remainingKey =
                new Artifact("C309", "", "");

        System.out.println("\nChecking C309...");

        if (ledger.contains(remainingKey)) {
            System.out.println("C309 is still in the collection:");
            System.out.println(ledger.get(remainingKey));
        }
    }
}
