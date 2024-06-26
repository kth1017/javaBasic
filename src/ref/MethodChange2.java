package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        System.out.println("dataA=" + dataA);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }

    // dataX 인스턴스도 메모리에 생성
    static void changeReference(Data dataX) {
        System.out.println("dataX=" + dataX);
        dataX.value = 20;
    }
}
