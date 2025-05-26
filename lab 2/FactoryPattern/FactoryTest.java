package FactoryPattern;

public class FactoryTest {
    public static void main(String[] args) {
        Food food1 = Factory.getFood("pizza");
        food1.prepare();

        Food food2 = Factory.getFood("burger");
        food2.prepare();
    }
}