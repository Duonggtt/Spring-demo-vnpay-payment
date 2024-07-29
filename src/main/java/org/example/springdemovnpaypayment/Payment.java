package org.example.springdemovnpaypayment;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long amount;
    private String transactionNo;
    private String orderInfo;
    private String bankCode;
    private String payDate;
    private String responseCode;
}