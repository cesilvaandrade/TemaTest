package com.example.curso.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class ItemPedidoPK  implements Serializable {

    private static final long serialersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "produt_id")
    private Produto produto;
}
