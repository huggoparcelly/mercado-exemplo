package exemplo;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoteRepository {

    Map<String, Lote> estoque = new HashMap<>();

    public void addLote(Lote lote) {
        estoque.put(lote.getId(), lote);
    }

    public void atualizarLote(Lote lote) {
        estoque.replace(lote.getId(), lote);
    }

    public void removerUmLote(Lote lote) {
        estoque.remove(lote.getId(), lote);
    }

    public Lote getLote(String id) {
        return estoque.get(id);
    }

    public Collection<Lote> listarLote() {
        return estoque.values();
    }


}
