package com.proyectoinfo.Sakura.dto;

public class OperacionCarrito {

    private Integer cantidad;
    private Long indumentariaId;

    public Integer getCantidad (){
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Long getIndumentariaId() {
        return indumentariaId;
    }
    public void setIndumentariaId(Long indumentariaId) {
        this.indumentariaId = indumentariaId;
    }
}
