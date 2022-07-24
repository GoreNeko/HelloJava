public class Constant {
    public static void main(String[] args) {
        int i = 10;
        i = 5;

        // 상수를 선언할 땐 앞에 final을 붙여준다.
        // 상수는 대문자를 사용하는것이 관례
        final int J = 8;
        System.out.println(i);
        System.out.println(J);

        double circleArea;
        final double PI = 3.141592;
        circleArea = i * i * PI;
        System.out.println(circleArea);

        final int OIL_PRICE = 1980;
        int totalPrice = 40 * OIL_PRICE;
        System.out.println(totalPrice);
    }
}
