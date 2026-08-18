package sample.cafekiosk.unit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sample.cafekiosk.unit.beverage.Americano;
import sample.cafekiosk.unit.beverage.Latte;
import sample.cafekiosk.unit.order.Order;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CafeKioskTest {

    // 사람이 맞는지 체크
    @Test
    void add_manual_test() {
        CafeKiosk ck = new CafeKiosk();
        ck.add(new Americano());
        System.out.println(" >>> 담긴 음료 수 : "+ck.getBeverages().size());
        System.out.println(" >>> 담긴 음료 : "+ck.getBeverages().get(0).getName());
    }

    // 기능을 통해서 언어가 체크
    @DisplayName("음료 1개를 추가하면 주문 목록에 담긴다.")
    @Test
    void add() {
        CafeKiosk ck = new CafeKiosk();
        ck.add(new Americano());

//        assertThat(ck.getBeverages().size()).isEqualTo(1);
        assertThat(ck.getBeverages()).hasSize(1); // 위 코드와 동일한 기능
        assertThat(ck.getBeverages().get(0).getName()).isEqualTo("아메리카노");
    }

    @Test
    void remove() {
        CafeKiosk ck = new CafeKiosk();
        Americano americano = new Americano();

        ck.add(americano);
        assertThat(ck.getBeverages()).hasSize(1);

        ck.remove(americano);
//        assertThat(ck.getBeverages()).hasSize(0);
        assertThat(ck.getBeverages()).isEmpty(); // hasSize 0과 동일한 기능
    }

    @Test
    void clear() {
        CafeKiosk ck = new CafeKiosk();
        Americano americano = new Americano();
        Latte latte = new Latte();

        ck.add(americano);
        ck.add(latte);
        assertThat(ck.getBeverages()).hasSize(2);

        ck.clear();
        assertThat(ck.getBeverages()).isEmpty();

    }

    // 해피 케이스
    @Test
    void addSeveralBeverages() {
        CafeKiosk ck = new CafeKiosk();
        Americano americano = new Americano();

        ck.add(americano, 2);

        assertThat(ck.getBeverages().get(0)).isEqualTo(americano);
        assertThat(ck.getBeverages().get(1)).isEqualTo(americano);
    }

    // 예외 케이스
    @Test
    void addZeroBeverages() {
        CafeKiosk ck = new CafeKiosk();
        Americano americano = new Americano();

        assertThatThrownBy(()-> ck.add(americano, 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("음료는 1잔 이상부터 주문 가능합니다.");
    }



    @Test
    void createOrderWithCurrentTime() {
        CafeKiosk ck = new CafeKiosk();
        Americano americano = new Americano();

        ck.add(americano);

        Order order = ck.createOrder(LocalDateTime.of(2026, 8, 7, 10,0));

        assertThat(ck.getBeverages()).hasSize(1);
        assertThat(ck.getBeverages().get(0).getName()).isEqualTo("아메리카노");
    }

    @Test
    void createOrderOutsideOpenTime() {
        CafeKiosk ck = new CafeKiosk();
        Americano americano = new Americano();

        ck.add(americano);


        assertThatThrownBy(()-> ck.createOrder(LocalDateTime.of(2026, 8, 7, 23,0)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("주문 시간이 아닙니다. 관리자에게 문의해 주세요.");
    }

    @DisplayName("주문 목록에 담긴 상품들의 총 금액을 계산할 수 있다.")
    @Test
    void calculateTotalPrice(){ // 메소드명을 한글로 해서 문서화 또한 가능
        // given : 시나리오 진행에 필요한 모든 준비 과정
        CafeKiosk ck = new CafeKiosk();
        Americano americano = new Americano();

        Latte latte = new Latte();

        ck.add(americano);
        ck.add(latte);

        // when : 시나리오 행동 진행
        int totalPrice = ck.calculateTotalPrice();

        // then : 시나리오 진행에 대한 결과 명시, 검증
        assertThat(totalPrice).isEqualTo(8500);
    }

}
