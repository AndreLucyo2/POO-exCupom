package Entidades;


import java.math.BigDecimal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andre
 */
public class PagamentoVenda {

    private int id;
    private Venda venda;
    private FormaPagamento formaPagto;
    private BigDecimal valorPago;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public FormaPagamento getFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(FormaPagamento formaPagto) {
        this.formaPagto = formaPagto;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

}
