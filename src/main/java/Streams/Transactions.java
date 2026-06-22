package Streams;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record Transactions(Integer id,double amount, String category, LocalDate date) {
}
