public class Main {

    public static void main(String[] args) {

        ArrayCollection<Artifact> catalog = new ArrayCollection<>();

        Artifact artifact1 =
                new Artifact("A101", "Ancient Hammer", "Ancient");

        Artifact artifact2 =
                new Artifact("B205", "Renaissance Painting", "Renaissance");

        Artifact artifact3 =
                new Artifact("C309", "Roman Coin", "Roman");

        // Add artifacts to the collection
        catalog.add(artifact1);
        catalog.add(artifact2);
        catalog.add(artifact3);

        System.out.println("Initial collection size: " + catalog.size());

        // Create a search key using only the ID
        Artifact searchKey =
                new Artifact("B205", "", "");

        // Search for the artifact
        System.out.println("\nSearching for B205...");

        if (catalog.contains(searchKey)) {
            Artifact found = catalog.get(searchKey);

            System.out.println("Artifact found:");
            System.out.println(found);
        } else {
            System.out.println("Artifact not found.");
        }

        // Remove B205
        System.out.println("\nRemoving B205...");

        catalog.remove(searchKey);

        System.out.println("Collection size after removal: "
                + catalog.size());

        // Show remaining artifacts
        System.out.println("\nRemaining artifacts:");

        Artifact keyA = new Artifact("A101", "", "");
        Artifact keyC = new Artifact("C309", "", "");

        System.out.println(catalog.get(keyA));
        System.out.println(catalog.get(keyC));
    }
}