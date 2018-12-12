package io.paratek;

public class NameGenerator {

    private static int classCount = 0, methodCount = 0, fieldCount = 0;

    public static String getNextClass() {
        return "class" + classCount++;
    }

    public static String getNextMethod() {
        return "method" + methodCount++;
    }

    public static String getNextField() {
        return "field" + fieldCount++;
    }

}
