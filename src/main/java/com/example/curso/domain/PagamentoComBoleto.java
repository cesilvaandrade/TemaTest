package com.example.curso.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class PagamentoComBoleto extends Pagamento {

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataVencimento;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataPagamento;
}
