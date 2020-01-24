Feature: FaceBook - Login FaceBook
         En tant que Utilisateur Je souhaite me connecter à FaceBook

 @SmokeTest
Scenario: Vérifier l’authentification sur FaceBook
Given Utilisateur sur la page d'accueil
When Utilisateur saisir adresse email valide
When utilisateur saisir MP valide
When Cliquer sur bouton connexion
Then La connexion reussite