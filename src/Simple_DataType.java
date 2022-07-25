public class Simple_DataType {
    public static void main(String[] args) {
        boolean isFun = true;
        System.out.println(!isFun);

        char c = 'f'; // 한 개의 문자 표현 가능
        int x = 59;
        long a = 1981968549L; // 마지막에 L
        float f = 89.41f; // 마지막에 f
        double d = 19819.7419871;
        System.out.println(c);
        System.out.println(x);
        System.out.println(a);
        System.out.println(f);
        System.out.println(d);

        // 강제 형변환
        int y = 50000;
        long z = y;

        long y2 = 5;
        // int x2 = y2;
        int x2 = (int)y2;

    }
}
