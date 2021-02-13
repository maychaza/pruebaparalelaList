package ada.prueba;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    List<Item> items;
    private Double montoTotal;
    private Double descuento;

    public Factura() {
        items= new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public void agregarItem(Item i) {
        items.add(i);
    }
}
