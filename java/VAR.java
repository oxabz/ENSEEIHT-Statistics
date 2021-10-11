package java;

import java.util.List;

public class VAR<K> {
    private final List<Classe<K>> model;
    private final int effectif;
    public VAR(List<Classe<K>> model) {
        this.model = model;
        this.effectif = model.stream().map(classe -> classe.effectif).reduce(0, Integer::sum);
    }

    public K get() {
        double random = Math.random();
        double val = 0;
        for (Classe<K> classe : model) {
            val += (double) classe.effectif / effectif;
            if (random <= val) {
                return classe.valeur;
            }
        }
        return null;
    }

    public static <K> VAR<K> fromModel(List<Classe<K>> model) {
        return new VAR<>(model);
    }
}
