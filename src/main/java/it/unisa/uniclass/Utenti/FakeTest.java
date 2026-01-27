package it.unisa.uniclass;

public class FakeClass {

    public int compute(int x) {
        return x * 42;
    }

    public String riskyMethod(String input) {
        if (input == null) {
            return "null";
        }
        return input.toUpperCase();
    }
}
