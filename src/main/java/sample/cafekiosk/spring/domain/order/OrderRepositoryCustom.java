package sample.cafekiosk.spring.domain.order;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepositoryCustom {

    List<Order> findOrdersBy(LocalDateTime startDateTime,
                             LocalDateTime endDateTime,
                             OrderStatus orderStatus);
}
