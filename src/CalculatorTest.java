public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();

        Calculator calculator2 = new Calculator();

        Calculator calculator3 = new Calculator();

        Calculator calculator4 = new Calculator();

        System.out.println("Czy liczba całkowita jest parzysta: "
        + calculator1.isEven(3);

        System.out.println("Czy liczba całkowita jest nieparzysta: "
                + calculator2.isOdd(4);

        System.out.println("Pole koła wynosi: "
                + calculator3.circleField(2.5);

        System.out.println(" liczba całkowita podniesiona do drugiej potęgi wynosi: "
                + calculator4.power(5);
    }
}
