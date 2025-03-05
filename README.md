# Projet Inspiration

Ce dépôt contient deux projets Maven Spring Boot :

## 1. quotes-api
L'API fournit une citation inspirante aléatoire depuis une base de données MySQL.

**Dépendances :** Spring Web, Spring Data JPA, MySQL Driver  
**Port :** 8081

## 2. chat-inspiration
Application de chat motivant qui :
- Permet à un utilisateur d’envoyer un message.
- Récupère une citation inspirante via RestTemplate (appel à l’API quotes-api).
- Enregistre la conversation dans la base de données.
- Propose une interface d’administration pour consulter l’historique des conversations.

**Dépendances :** Spring Web, Spring Data JPA, MySQL Driver, Thymeleaf  
**Port :** 8080

### Instructions de lancement

1. **Création de la base de données :**  
   Exécutez le script `inspiration_db` sur MySQL pour créer la base de données.

2. **Configuration :**  
   Mettez à jour les paramètres de connexion dans le fichier `application.properties` de chaque projet.

3. **Importation des projets :**  
   Importez les deux projets dans votre IDE (par exemple, Eclipse) en tant que projets Maven.

4. **Démarrage :**  
   - Démarrez **quotes-api** (port 8081).  
   - Ensuite, démarrez **chat-inspiration** (port 8080).

5. **Utilisation de l’application :**  
   - **Utilisateur :** Rendez-vous sur [http://localhost:8080/chat](http://localhost:8080/chat) pour envoyer des messages.  
   - **Administrateur :** Accédez à [http://localhost:8080/admin](http://localhost:8080/admin) pour consulter l’historique des conversations.
