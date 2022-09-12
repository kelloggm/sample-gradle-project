package sample.gradle.project;

import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.nullness.qual.NonNull;

public class App {

    public static void stuff() {
    }

    public static @NonNegative int returnNN() {
        return -1;
    }

    public static @NonNull Object foo() {
        return new Object();
    }

    public static void main(String[] args) {
        System.out.println(args[1]);
        stuff();
        returnNN();
        foo();
    }
}
