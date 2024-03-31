package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
    }

    // 당연히 x는 메서드 종료 후 제거되므로 위 코드의 메서드는 아무 의미없음
    static void changePrimitive(int x) {
        x = 20;
    }
}
