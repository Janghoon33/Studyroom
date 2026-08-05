package sample.cafekiosk.unit;

import org.junit.jupiter.api.Test;
import sample.cafekiosk.unit.beverage.Americano;
import sample.cafekiosk.unit.beverage.Latte;

import static org.assertj.core.api.Assertions.assertThat;

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
}
