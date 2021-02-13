package ada.prueba;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<Factura> facturas= new ArrayList<>();

	Factura a = new Factura();

	List<Item> items= a.getItems();

	Item p= new Item(1, "tarta", 1, 250.0);
	Item q= new Item(2, "ddl", 3, 120.0);
	Item r= new Item(3, "merengue", 2, 80.0);
	Item s= new Item(4, "vela", 1, 50.0);
	Item t= new Item(5, "cobertor", 1, 150.0);

    items.add(p);
    items.add(q);
    items.add(r);
    items.add(s);
    items.add(t);

    a.agregarItem(p);
    a.agregarItem(r);
    a.agregarItem(s);
    a.agregarItem(q);
    a.agregarItem(t);
    }
}
