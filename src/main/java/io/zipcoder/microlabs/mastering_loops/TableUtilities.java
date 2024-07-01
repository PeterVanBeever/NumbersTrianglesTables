package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String outcome ="";
        outcome = getMultiplicationTable(5);
        return outcome;
    }

    public static String getLargeMultiplicationTable() {
        String outcome = getMultiplicationTable(10);
        return outcome;

    }

    public static String getMultiplicationTable(int tableSize) {
        String outcome ="";
        // first loop
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++){
                outcome += String.format("%3d |", j*i);
            }
            outcome += "\n";

//
        }
        return outcome;
    }
    // ( i % 2 == 0 ) if true, i is Even.
    static boolean isFive(int i) {
        return (i % 5 == 0);
        }
}


// "  1 |  2 |  3 |  4 |  5 |\n" +
//         "  2 |  4 |  6 |  8 | 10 |\n" +
//         "  3 |  6 |  9 | 12 | 15 |\n" +
//         "  4 |  8 | 12 | 16 | 20 |\n" +
//         "  5 | 10 | 15 | 20 | 25 |\n";