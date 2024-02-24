package sample.cafekiosk.spring.domain.order;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

import static sample.cafekiosk.spring.domain.order.QOrder.order;

@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepositoryCustom{

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Order> findOrdersBy(LocalDateTime startDateTime, LocalDateTime endDateTime, OrderStatus orderStatus) {
        return jpaQueryFactory
            .selectFrom(order)
            .where(order.registeredDateTime.between(startDateTime, endDateTime.minusNanos(1)),
                order.orderStatus.eq(orderStatus))
            .fetch();
    }
}
