# tpnote

[![Maintainability](https://api.codeclimate.com/v1/badges/2ebf0d7e2e7c7d92ef0f/maintainability)](https://codeclimate.com/github/nack714/tpnote/maintainability)

Ajout : 

Dans Administrateur :
attribuerMateriel()
  Ajout de la vérification : si le matériel n'est pas dans l'entreprise, il ne peut pas etre attribuer

Dans les test :
AdministrateurTest
attribuerMateriel
Ajout d'un ecran dans l'entreprise avant de pouvoir l'attribuer (voir plus haut pour la verification)
Changemennt d'empruntable
Avant UC, maintenant Imprimante, car seule Empruntable qui possede le constructeur permettant de choisir s'il est limité aux agences
