public class Main {

    public static void main(String[] args) {

        // Single-dimensional arrays
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array: rows = cities, columns = consoles
        int[][] sales = {
            {1000, 2000, 3000},   // Cape Town
            {2000, 3000, 4000},   // Port Elizabeth
            {1500, 1100, 1200}    // Pretoria
        };

        // Single-dimensional array to hold each city's total
        int[] cityTotals = new int[cities.length];

        // ---------- Calculate totals ----------
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                cityTotals[i] += sales[i][j];
            }
        }

        // ---------- Find city with the most sales ----------
        int maxIndex = 0;
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > cityTotals[maxIndex]) {
                maxIndex = i;
            }
        }

        // ---------- Display the report ----------
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------------------");

        // Header row
        System.out.printf("%-16s", "");
        for (String console : consoles) {
            System.out.printf("%-10s", console);
        }
        System.out.println();

        // Sales rows
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-16s", cities[i].toUpperCase());
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-10d", sales[i][j]);
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-16s%d%n", cities[i].toUpperCase(), cityTotals[i]);
        }

        System.out.println("-------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex].toUpperCase());
        System.out.println("-------------------------------------------------");
    }
}