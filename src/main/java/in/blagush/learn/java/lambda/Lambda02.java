package in.blagush.learn.java.lambda;

public class Lambda02 {
    public static void main(String[] args) {

        // old way as anonymous class
        OneParameterInterface example1 = new OneParameterInterface() {
            @Override
            public int cube(int i) {
                int y = i * i;
                System.out.println(y);
                return y;
            }
        };
        example1.cube(5);

        // new way by java8.in.blagush.learn.java.lambda
        OneParameterInterface example2 = i -> {
            int y = i * i;
            System.out.println(y);
            return y;
        };
        example2.cube(5);
    }
}
