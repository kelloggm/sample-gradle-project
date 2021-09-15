package sample.gradle.project;

public class App {

    public static void main(String[] args) {
        Pojo p = new Pojo();
        // a warning should be issued on this line
        p.foo = null;
    }
}
