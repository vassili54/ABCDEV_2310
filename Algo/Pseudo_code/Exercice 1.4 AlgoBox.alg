<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER interetSimple"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" epaisseurLigne="2" arrondiAuto="vrai" nbDecimales="8" totalAffichages="1000" epaisseurPoint="2" totalBoucles="5000000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="somme EST_DU_TYPE NOMBRE" code="1#NOMBRE#somme"/>
        <item algoitem="interet EST_DU_TYPE NOMBRE" code="1#NOMBRE#interet"/>
        <item algoitem="nbAnnee EST_DU_TYPE NOMBRE" code="1#NOMBRE#nbAnnee"/>
        <item algoitem="interetSimple EST_DU_TYPE NOMBRE" code="1#NOMBRE#interetSimple"/>
        <item algoitem="interetComposer EST_DU_TYPE NOMBRE" code="1#NOMBRE#interetComposer"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Saisir la somme&quot;" code="4#Saisir la somme#1"/>
        <item algoitem="LIRE somme" code="2#somme#pasliste"/>
        <item algoitem="AFFICHER &quot;Saisir le nombre d'annee&quot;" code="4#Saisir le nombre d'annee#1"/>
        <item algoitem="LIRE interet" code="2#interet#pasliste"/>
        <item algoitem="AFFICHER &quot;Saisir le nombre d'annee&quot;" code="4#Saisir le nombre d'annee#1"/>
        <item algoitem="LIRE nbAnnee" code="2#nbAnnee#pasliste"/>
        <item algoitem="interetSimple PREND_LA_VALEUR somme*(1+nbAnnee*interet/100)" code="5#interetSimple#somme*(1+nbAnnee*interet/100)#pasliste"/>
        <item algoitem="interetComposer PREND_LA_VALEUR somme*pow(1+interet/100,nbAnnee)" code="5#interetComposer#somme*pow(1+interet/100,nbAnnee)#pasliste"/>
        <item algoitem="AFFICHER &quot;La valeur acquise avec un ineret simple est :&quot;" code="4#La valeur acquise avec un ineret simple est :#0"/>
        <item algoitem="AFFICHER interetSimple" code="3#interetSimple#1#pasliste"/>
        <item algoitem="AFFICHER &quot;La valeur acquise avec un interet composer est :&quot;" code="4#La valeur acquise avec un interet composer est :#0"/>
        <item algoitem="AFFICHER interetComposer" code="3#interetComposer#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
