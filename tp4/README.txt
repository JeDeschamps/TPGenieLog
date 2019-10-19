Explications des choix d’implémentation du TP4


De manière générale dans l’implémentation on insiste vraiment sur l’encapsulation des méthodes, classes. On essaie de proposer une visibilité logique des attributs et des méthodes pour avoir un code robuste et sûr.

Pour la classe Client : 

- On décide que puisqu’il existe une navigabilité de Client vers réservation on lui donne également en attribut une réservation. Vu qu’un client peut en effectuer plusieurs il prend en attribut une collection de réservation.

- En plus de ça on considère que c’est le client qui effectue les appels de méthodes annuler, payer et confirmer de la classe réservation donc on lui ajoute 3 méthodes qui encapsulent les méthodes de réservation.

- Pour son attribut référence qui est un identifiant unique on décide d’utiliser une variante du pattern singleton (classe IdClient) pour assurer l’unicité de celui-ci. Pour démontrer les possibilités du langage au lieu d’avoir un type String on utilise ici un objet IdClient à la place.


Pour la classe Réservation : 

- On lui passe un attribut Vol, Client et Passager qui sont des données qui concernent la réservation. Une seule réservation peut concerner plusieurs passagers donc il y a une collection de passagers.
On considère que réservation n’a qu’un seul client qui effectue la réservation même si elle peut concerner plusieurs passagers sinon les méthodes de paiement, confirmation, annulation pourraient être effectuées par plusieurs clients différents sans concertation des autres ce qui serait étrange.

- Le constructeur de réservation ne prend pas de paramètres car toutes les valeurs sont obtenues par dépendance aux autres classes

- Pour l’état on décide pour des questions d’élégance du code on utilise une classe interne ENUM qui définit les différentes valeurs possibles de l’état à la place d’un string

- Dans la même idée que pour la classe client on utilise également la même variante du pattern singleton pour la classe Reservation. Ici il s’appelle IdReservation

- On dit que la date de la réservation est la date de départ du vol

Pour la classe Passager :

- On lui passe une collection de réservations dans ses paramètres car il connaît ses réservations

Pour la classe Vol :

- Une collection de réservation concerne le vol mais la navigabilité fait que vol ne les connaît pas donc il ne les prend pas en attribut.

- L’identifiant est unique donc comme les autres on utilise une classe (ici IdVol) qui propose un identifiant unique mais contrairement aux autres IdVol propose une méthode toString qui permet de ne pas utiliser un objet IdVol

- On rajoute un attribut statut, il correspond à la question de si le vol est ouvert à la réservation, la classe réservation l’utilise pour tester si elle a le droit d’utiliser ses méthodes. Si le statut = true la réservation est possible

- Le vol étant unique on passe son constructeur en privé et on fournit un accesseur.



