package com.example.demo.Persistencia.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductoFacturaPK {
    @Column(name="cod_factura")
    private String CodFactura;

    @Column(name = "cod_producto")
    private String CodProducto;




    public String getCodFactura() {
        return CodFactura;
    }

    public void setCodFactura(String codFactura) {
        CodFactura = codFactura;
    }

    public String getCodProducto() {
        return CodProducto;
    }

    public void setCodProducto(String codProducto) {
        CodProducto = codProducto;
    }


}
