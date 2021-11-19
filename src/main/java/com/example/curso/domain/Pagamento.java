package com.example.curso.domain;

import com.example.curso.domain.Enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pagamento implements Serializable {

    @Id
    private Integer id;
    private EstadoPagamento estado;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "pedido_id")
    @MapsId
    private Pedido pedido;
}
