public class If {
    public static void main(String[] args) {
        int x = 50;
        int y = 60;
// 조건 뒤에 중괄호 필수
        if (x < y) {
            System.out.println("x < y");
        }

        if (x == y) {
            System.out.println("x == y");
        }
        else if (x < y){
            System.out.println("x < y");
        }
        else {
            System.out.println("x != y");

        }
    }
}