package Streams;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TotalTransactions {

    public static void main(String[] args) {
        List<Transactions> transactionsList = List.of(
                new Transactions(1,1000.00,"Headphones", LocalDate.of(2026,6,2)),
                new Transactions(2,2000.00,"Headphones", LocalDate.of(2026,6,12)),
                new Transactions(3,10000.00,"Mobile", LocalDate.of(2026,5,2)),
                new Transactions(4,15000.00,"Mobile", LocalDate.of(2026,6,20)),
                new Transactions(5,70000.00,"Laptop", LocalDate.of(2026,4,2)),
                new Transactions(6,100000.00,"Laptop", LocalDate.of(2026,3,2)),
                new Transactions(7,40000.00,"TV", LocalDate.of(2026,6,12))
        );

        Map<String,Double> map = transactionsList.stream()
                .filter(t -> t.date().plusDays(30).isAfter(LocalDate.now()))
                .collect(Collectors.groupingBy(Transactions::category,Collectors.collectingAndThen(
                        Collectors.toList(),list-> list
                                .stream()
                                .map(Transactions::amount)
                                .reduce((double) 0,(a, b) -> a+b)
                )));

        System.out.println(map);

    }

}
