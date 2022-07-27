public class Main {
    public static void main(String[] args) {

        Ints calc = new IntsCalculator();

        int sum = calc.sum(4, 2);

        int mult = calc.mult(4, 2);

        int pow = calc.pow(4, 2);

        System.out.println(sum);

        System.out.println(mult);

        System.out.println(pow);

    }
}
