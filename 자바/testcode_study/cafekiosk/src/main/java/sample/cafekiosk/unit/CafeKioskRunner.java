package sample.cafekiosk.unit;

import sample.cafekiosk.unit.beverage.Americano;
import sample.cafekiosk.unit.beverage.Latte;

public class CafeKioskRunner {
    public static void main(String[] args) {
        CafeKiosk ck = new CafeKiosk();
        ck.add(new Americano());
        System.out.println(">>>> 아메리카노 추가");

        ck.add(new Latte());
        System.out.println(">>>> 라떼 추가");

        int totalPrice = ck.calculateTotalPrice();
        System.out.println("총 주문 가격 : "+totalPrice);
    }
}
