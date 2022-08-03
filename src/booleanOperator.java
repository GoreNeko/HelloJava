public class booleanOperator {
    public static void main(String[] args) {
        int i = 6;
        int j = 6;
        System.out.println(i == j);
        System.out.println(i != j);

        int a = 30;
        int b = 7;
        int c = 7;
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(b <= c);
        System.out.println(b >= c);
        System.out.println();

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        //논리 곱 (&&) : 피 연산자가 모두 TRUE일시 TRUE
        System.out.println(b1 && b2);
        System.out.println(b1 && b3);
        System.out.println();
        int score = 93;
        if (score <= 100 && score >= 70) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
        System.out.println();
        //논리 합 (||): 피 연산자 둘 중 하나만 TRUE여도 TRUE
        System.out.println(b1 || b2);
        System.out.println(b1 || b3);
        System.out.println();
        //논리 부정 (!) : TRUE -> FALSE, FALSE -> TRUE
        System.out.println(!b1);
        System.out.println(!b2);
        System.out.println();
        //베타적논리합 (^) : 피연산자가 서로 다른 값일경우 TRUE
        System.out.println(b1 ^ b2);
        System.out.println(b1 ^ b3);
        System.out.println();

    }
}
