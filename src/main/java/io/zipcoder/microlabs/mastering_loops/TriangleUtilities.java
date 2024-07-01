package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {
            // call getRows
    public static String getTriangle(int numberOfRows) {
        String outcome ="";
        for (int i = 1; i < numberOfRows; i = i + 1) {
            outcome += getRow(i);
            outcome += "\n";
        }
        return outcome;
    }

    public static String getRow(int numberOfStars) {
        String s = "";
        for (int i = 0; i < numberOfStars; i = i + 1) {
            s += "*";
        }
        return s;
    }

    public static String getSmallTriangle() {

        return getTriangle(5);
    }

    public static String getLargeTriangle() {

        return getTriangle(10);}

}
