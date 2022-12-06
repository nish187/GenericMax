package Generic;

public class MainClass {
    public static <T> void main(String[] args) {
        Integer[] intArray = {5, 7, 6, 8};
        Float[] floatArray = {5.9F, 8.6F, 7.3F, 3.2F};
        String[] stringArray = {"Nishant", "Rohan", "Radha", "Neha"};
        MaxValue<Integer> maxValue = new MaxValue<>(intArray);
        maxValue.testMaximum();
        MaxValue<Float> maxValue1 = new MaxValue<>(floatArray);
        maxValue1.testMaximum();
        MaxValue<String> maxValue2 = new MaxValue<>(stringArray);
        maxValue2.testMaximum();
    }
}