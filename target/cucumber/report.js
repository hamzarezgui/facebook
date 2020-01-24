$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Facebook/Login.feature");
formatter.feature({
  "name": "FaceBook - Login FaceBook",
  "description": "         En tant que Utilisateur Je souhaite me connecter à FaceBook",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Vérifier l’authentification sur FaceBook",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "Utilisateur sur la page d\u0027accueil",
  "keyword": "Given "
});
formatter.match({
  "location": "FaceBook.utilisateur_sur_la_page_d_acceuil()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Utilisateur saisir adresse email valide",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBook.utilsateur_saisir_adresse_email_valide()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "utilisateur saisir MP valide",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBook.utilasateur_saisir_MP_valide()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cliquer sur bouton connexion",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBook.cliquer_sur_bouton_connexion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "La connexion reussite",
  "keyword": "Then "
});
formatter.match({
  "location": "FaceBook.la_connexion_reussite()"
});
formatter.result({
  "status": "passed"
});
});