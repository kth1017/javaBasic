package poly.ex.pay0;

import java.util.HashMap;

public class PayService {

    public void processPay(String option, int amount) {

        boolean result;
        Dummy dummy = new Dummy();
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        HashMap<String, Pay> stringPayHashMap = new HashMap<>();
        stringPayHashMap.put("kakao", new KakaoPay());
        stringPayHashMap.put("naver", new NaverPay());

        result = (stringPayHashMap.getOrDefault(option, dummy).pay(amount) != 0);


        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

}