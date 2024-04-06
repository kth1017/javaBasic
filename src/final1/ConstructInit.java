package final1;

public class ConstructInit {
    // final을 멤버 변수에 사용시 선언시 초기화가 아니면 반드시 생성자로만 할당 가능
    final int value;

    public ConstructInit(int value) {
        this.value = value;
    }
}
