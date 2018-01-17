package termin20Dezember17.serializableGenerisch;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Datenbank<T extends Serializable> {

    private List<T> data = new ArrayList<>();

    public List<T> getItem() {
        return data;
    }

    public void addItem(T item) {
        data.add(item);
    }

}
