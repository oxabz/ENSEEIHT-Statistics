# Statistique

## Statistique descriptive unidimensionnelle (Charly)

### Parametre de position

#### Moyennes

|Nom|Moyenne brute|Moyenne pondérée|
|---|--|--|
|Moyenne Arythmétique ($ \bar x_A $)| $\bar x_A = {1\over n} \sum_{i=0}^{n} x_i$|$W = {1\over \sum_{i=0}^{n} w_i} \sum_{i=0}^{n} w_ix_i$|
|Moyenne Harmonique ($\bar x_H$)| $\overline{x}_{\rm H} = \frac{n}{\sum_{i=1}^n{1 \over x_i}}$|$\frac{\sum_{i=1}^n w_i}{\sum_{i=1}^n \frac{w_i}{x_i}}$|
|Moyenne Geometrique ($\bar x_G$)| $\overline{x}_{\rm G} = \sqrt[n]{\prod_{i=1}^n x_i}$ |$\left(\prod_{i=1}^n x_i^{w_i}\right)^{1 / \sum_{i=1}^n w_i}$ |
| Moyenne Geometrique ($\bar x_G$)| $\overline{x}_{\rm Q} = \sqrt{\frac{1}{n}\sum_{i=1}^n{x_i^2}}$ |$\sqrt{\frac{1}{\sum_{i=1}^n w_i}\sum_{i=1}^n{w_i x_i^2}}$ |

#### Quantile

- Symbole : $q-quantile$
- formule : 
  $$
  x_i \ où \ i \in \N \land i > {n \over quantile} \land min(i)

##### Quartile

- Symboles :
  - $Q1$
  - $Q2$
  - $Q3$

##### Mediane

- Symbole : $Q2$ ou $Me$

#### Equart-type

- Symbole :  $\sigma$

#### Variance

- Symbole : $V$

#### Mise en application sur notre jeu de données

Taille (cm) \ Masse (kg)|	160-165|	165-170|	170-175|	175-180|	180-185|	185-190|Cumulés|
------------------------|----------|-----------|-----------|-----------|-----------|-----------|-------|
45-50|	1|	|	|	|	|	| 1 |
50-55|	|	|	4|	1|	|	|5|
55-60|	|	1|	1|	1|	|	|3|
60-65|	|	|	3|	2|	|	|5|
65-70|	|	|	1|	3|	1|	|5|
70-75|	|	|	2|	4|	1|	|7|
75-80|	|	|	|	1|	2|	|3|
80-85|	|	|	|	|	|	|0|
85-90|	|	|	|	|	|	|0|
90-95|	|	|	|	1|	|	|1|
95-100|	|	|	|	|	1|	|1|
Cumulés|	1|	1|	11|	13|	5|	0|31|

|Indicateur|Taille (cm)|Masse (kg)|
| -------- | ----------|----------|
|Min|162,5|47,5|
|Max|182,5|97,5|
|Moyenne|175,7258065|66,53225806|
|Médiane|177,5|67,5|
|1er quartile|172,5|57,5|
|3e  quartile|177,5|72,5|

### Paramètre de dispersion
Dispersion statistique : la dispersion statistique mesure la variabilité des valeurs d’une séries statistiques par rapport une valeur centrale (moyenne). Elle permet de déterminer la dispersion et l’écart entre les différentes valeurs

#### Paramètres de dispersion absolue
##### Étendue
L'étendue est la différence entre la valeur minimal et maximal. 
L'étendue de X = $Xmax - Xmin$

#### Paramètres de dispersion relative


### Représentation
Il existe de nombreux types de diagramme permettant de representer des données statistiques. Suivant les données à représenter, certaines répresentations sont plus adaptées que d'autres. Nous avons decider de présenter et critiquer quelques diagrammes qui nous semblent pertinant à utiliser pour notre jeu de données.
#### Diagramme en bâtons (charly gdoc)

##### Construction

Placer une suite de points sur un graphique et pour chaque point tracer un trait vertical qui part du point concerné et qui s’arrête sur l’axe des abscisses.

##### Représentation

Pour le diagramme suivant, nous avons utiliser cette suite de points générée de manière aléatoire :

|   x   |   y   |
|---|---|
| 0.87009423 | 0.59815531 |
| 0.28730304 | 0.15536838 |
| 0.11426581 | 0.27674868 |
| 0.70423289 | 0.72387041 |
| 0.3701205 | 0.98997792 |

**Insérer `StickChart.png`**

##### Conclusion

| Avantage(s) | Inconvénient(s) |
| ----------- | --------------- |


#### Diagramme cumulatif

##### Construction



##### Représentation

##### Conclusion

| Avantage(s) | Inconvénient(s) |
| ----------- | --------------- |
| Pratique pour la visualitation de processus |  |

#### Histogramme
L'histogramme représente la répartition empirique d'une variable aléatoire en la représentant avec des colonnes correspondant chacune à une **classe**.
##### Construction
Dans un histogramme, les données sont organisé par classes représentées par un rectangle. La taille d'un rectangle représente la quantitée de valeur de cette classe. 
##### Représentation

##### Conclusion

| Avantage(s) | Inconvénient(s) |
| ----------- | --------------- |
| Moyen rapide et efficace d'étudier des répartitions ||
| Pratique dans les mélanges de lots ||
|| Perte de précision sur des valeurs continues (intervalles) |

#### Diagramme en boîte / box-plot

##### Construction

##### Représentation

##### Conclusion

| Avantage(s)                                     | Inconvénient(s)                                            |
| ----------------------------------------------- | ---------------------------------------------------------- |
| Min/Max/Q1/Q2/Q3 représentés de manière lisible |                                                            |
|                                                 | Compliqué lorsqu'il y a beaucoup de catégories différentes |