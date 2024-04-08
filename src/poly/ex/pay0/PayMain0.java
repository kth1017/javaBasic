package poly.ex.pay0;

import java.util.Scanner;

public class PayMain0 {

    public static void main(String[] args) {
        PayService payService = new PayService();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("결제수단 입력");
            String option = scanner.nextLine();

            System.out.println("결제금액 입력");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(option, amount);
        }


    }

}
