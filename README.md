# Guide de Mise en Place de Kafka avec Kafka Manager

Ce projet configure un environnement Kafka avec Kafka Manager en utilisant Docker et Docker Compose. Suivez ces étapes
pour démarrer rapidement.

## Prérequis

- Docker et Docker Compose installés sur votre machine.
- java 8
- Maven 3.6.3

## Étapes de Mise en Place

### 1. Cloner le Projet

Clonez ce dépôt sur votre machine locale :

```bash
git clone <URL_DU_DEPOT>
cd <NOM_DU_REPERTOIRE>
```

### 2. Lancer les Services avec Docker Compose

Assurez-vous d'être dans le répertoire contenant le fichier docker-compose.yml.
Démarrez les services Kafka, Zookeeper, et Kafka Manager avec la commande suivante :

```bash
docker-compose up -d
```

### 3. Accéder à Kafka Manager

Ouvrez votre navigateur web et accédez à Kafka Manager à l'adresse suivante : http://localhost:9000.
Ajoutez votre cluster Kafka en utilisant l'adresse de Zookeeper : zookeeper:2181.

### 4. Créer des Topics

Dans Kafka Manager, sélectionnez votre cluster.
Allez dans l'onglet "Topics" et cliquez sur "Create a new topic".
Créez deux topics : emails et notifications, chacun avec 1 partition et un facteur de réplication de 1.

### 5. Produire et Consommer des Messages

Utilisez les programmes producteurs et consommateurs Java fournis dans le projet pour envoyer et lire des messages
des topics emails et notifications.
Compilez et exécutez les programmes Java pour démarrer la production et la consommation de messages.

### 6. Surveiller les Métriques

Utilisez Kafka Manager pour surveiller les métriques et l'état de votre cluster Kafka.

## Conclusion

Vous avez maintenant un environnement Kafka fonctionnel avec Kafka Manager, configuré avec Docker Compose. Vous
pouvez produire et consommer des messages à l'aide des programmes Java fournis. Kafka Manager vous permet de
surveiller et de gérer votre cluster Kafka via une interface web.