/*
변수는 첫번째 문자가 항상 소문자.
두단어 이상의 변수는 두번째 단어의 첫글자를 대문자로 쓰자.
ex) int guestName
 */
public class Variable {
    public static void main(String[] args) {
        int count; // 정수형 변수(int)
        count = 10;
        count = 20;
        double average = 5.7; // 실수형 변수(double)
        System.out.println(count);
        System.out.println(count + average);
        String name = "GoreNeko";
        System.out.println(name);
    }
}
