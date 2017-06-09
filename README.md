# Location
## Classe Voiture 
### propriétés : 
string idVoiture  
string immatriculation  
int nbPlace  
decimal prix  
TypeVoiture typeVoiture  
MarqueVoiture marqueVoiture  
TypeTransmision typeTransmission  
ModeleVoiture modelVoiture  

### méthodes :
   
## Classe Client
### propriétés : 
string idClient  
string nom  
string prenom  
telephone  
email  
adresse  
ville  
int codePostal  
### méthodes :
enregistrer  
louerVoiture  
rendreVoiture  
consulterVoiture  
consulterVoitures  
effectuerPaiment

## Classe Location
### propriétés : 
idLocation   
Voiture voiture  
Client client  
dateDebut    
dateFin  
### méthodes :
changerEtatVoiture

## Classe Facture
### propriétés : 
Location location  
date    
prixDemandee  
prixPayee  
### méthodes :
imprimerFacture

## Classe TypeVoiture
### propriétés : 
idTypeVoiture  
nom  
### méthodes :


## Classe MarqueVoiture
### propriétés : 
idMarque  
nom  
### méthodes :

## Classe ModeleVoiture
### propriétés : 
idModele  
nom  
### méthodes :

## Classe TypeTransmission
### propriétés : 
idType  
nom  
### méthodes :

