package in.blagush.learn.java.lambda;

public class Lambda03 {
    public static void main(String[] args) {

        // old way as anonymous class
        TwoParametersInterface example1 = new TwoParametersInterface() {
            @Override
            public int multiply(int a, int b) {
                return a * b;
            }
        };
        System.out.println(example1.multiply(5, 4));

        // new way by java8.in.blagush.learn.java.lambda
        TwoParametersInterface example2 = (a, b) -> a * b;
        System.out.println(example2.multiply(5, 4));
    }
}
