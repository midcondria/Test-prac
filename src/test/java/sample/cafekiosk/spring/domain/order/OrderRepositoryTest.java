package sample.cafekiosk.spring.domain.order;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import sample.cafekiosk.spring.config.QueryDslConfig;


@DataJpaTest
@Import(QueryDslConfig.class)
class OrderRepositoryTest {

    @Autowired
    private OrderRepository orderRepository;

    @DisplayName("입력한 날짜와 결제 상태에 해당하는 주문들을 조회한다.")
    @Test
    void findOrdersBy() {
        // given

        // when

        // then

    }

}