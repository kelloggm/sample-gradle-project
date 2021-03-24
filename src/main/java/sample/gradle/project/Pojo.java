package sample.gradle.project;

import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Pojo {
    private @NonNull String foo;

    public static void main(String[] args) {
        System.out.println(args[1]);
        returnNN();
    }

    public static @NonNegative int returnNN() {
        return -1;
    }

}
