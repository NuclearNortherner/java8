package in.blagush.learn.java.lambda;

public class Lambda01 {
    public static void main(String[] args) {

        // old way as anonymous class
        OneParameterInterface example1 = new OneParameterInterface() {
            @Override
            public int cube(int i) {
                return i*i;
            }
        };
        System.out.println(example1.cube(5));

        // new way by java8.in.blagush.learn.java.lambda
        OneParameterInterface example2 = i -> i*i;
        System.out.println(example2.cube(5));
    }
}
