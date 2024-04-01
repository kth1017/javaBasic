package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        // 아래 코드 실행시 위의 data 인스턴스는 gc 대상
        data = null;
        System.out.println("3. data = " + data);
    }
}
