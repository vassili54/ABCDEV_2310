<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER Resultat2" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2para="" F2etat="inactif" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalBoucles="5000000" nbDecimales="8" epaisseurLigne="2" arrondiAuto="vrai" maxBoucle="500000" epaisseurPoint="2" totalAffichages="1000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="Nombre1 EST_DU_TYPE NOMBRE" code="1#NOMBRE#Nombre1"/>
        <item algoitem="Nombre2 EST_DU_TYPE NOMBRE" code="1#NOMBRE#Nombre2"/>
        <item algoitem="Resultat1 EST_DU_TYPE NOMBRE" code="1#NOMBRE#Resultat1"/>
        <item algoitem="Resultat2 EST_DU_TYPE NOMBRE" code="1#NOMBRE#Resultat2"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER Nombre1" code="3#Nombre1#0#pasliste"/>
        <item algoitem="LIRE Nombre1" code="2#Nombre1#pasliste"/>
        <item algoitem="AFFICHER Nombre2" code="3#Nombre2#0#pasliste"/>
        <item algoitem="LIRE Nombre2" code="2#Nombre2#pasliste"/>
        <item algoitem="Resultat1 PREND_LA_VALEUR Nombre1 + Nombre2" code="5#Resultat1#Nombre1 + Nombre2#pasliste"/>
        <item algoitem="Resultat2 PREND_LA_VALEUR Resultat1/2" code="5#Resultat2#Resultat1/2#pasliste"/>
        <item algoitem="AFFICHER &quot;Le Résultat est:&quot;" code="4#Le Résultat est:#0"/>
        <item algoitem="AFFICHER Resultat2" code="3#Resultat2#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
