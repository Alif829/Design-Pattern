package strategy;


import java.util.Collection;

//strategy
public interface OrderPrinter {
    void print(Collection<Order> orders);
}
