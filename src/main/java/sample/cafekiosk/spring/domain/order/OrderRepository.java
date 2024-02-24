package sample.cafekiosk.spring.domain.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>, OrderRepositoryCustom {

//    @Query("select o from Order o where o.registeredDateTime >= :startDateTime" +
//        " and o.registeredDateTime < :endDateTime" +
//        " and o.orderStatus = :orderStatus")
//    List<Order> findOrdersBy(@Param("startDateTime") LocalDateTime startDateTime,
//                             @Param("endDateTime") LocalDateTime endDateTime,
//                             @Param("orderStatus") OrderStatus orderStatus);
}
