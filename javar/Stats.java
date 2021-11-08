package javar;

import java.util.List;

public class Stats {
    public static void main(String[] args) {
        List<Classe<CoupleTailleMasse>> stats = List.of(
                new Classe<>(new CoupleTailleMasse(162.5, 47.5), 1),
                new Classe<>(new CoupleTailleMasse(167.5, 57.5), 1),
                new Classe<>(new CoupleTailleMasse(172.5, 52.5), 4),
                new Classe<>(new CoupleTailleMasse(172.5, 57.5), 1),
                new Classe<>(new CoupleTailleMasse(172.5, 62.5), 3),
                new Classe<>(new CoupleTailleMasse(172.5, 67.5), 1),
                new Classe<>(new CoupleTailleMasse(172.5, 72.5), 2),
                new Classe<>(new CoupleTailleMasse(177.5, 52.5), 1),
                new Classe<>(new CoupleTailleMasse(177.5, 57.5), 1),
                new Classe<>(new CoupleTailleMasse(177.5, 62.5), 2),
                new Classe<>(new CoupleTailleMasse(177.5, 67.5), 3),
                new Classe<>(new CoupleTailleMasse(177.5, 72.5), 4),
                new Classe<>(new CoupleTailleMasse(177.5, 77.5), 1),
                new Classe<>(new CoupleTailleMasse(177.5, 92.5), 1),
                new Classe<>(new CoupleTailleMasse(182.5, 67.5), 1),
                new Classe<>(new CoupleTailleMasse(182.5, 72.5), 1),
                new Classe<>(new CoupleTailleMasse(182.5, 77.5), 2),
                new Classe<>(new CoupleTailleMasse(182.5, 97.5), 1)
        );

        VAR<CoupleTailleMasse> x = VAR.fromModel(stats);
        System.out.println(x.get());
    }
}
