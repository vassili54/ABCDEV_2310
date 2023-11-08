<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER resultat" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2para="" F2defaut="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" arrondiAuto="vrai" epaisseurPoint="2" totalBoucles="5000000" nbDecimales="8" totalAffichages="1000" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nombre1" algoitem="nombre1 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nombre2" algoitem="nombre2 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#resultat" algoitem="resultat EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir le 1er nombre#0" algoitem="AFFICHER &quot;Saisir le 1er nombre&quot;"/>
        <item code="2#nombre1#pasliste" algoitem="LIRE nombre1"/>
        <item code="4#Saisir le 2eme nombre#0" algoitem="AFFICHER &quot;Saisir le 2eme nombre&quot;"/>
        <item code="2#nombre2#pasliste" algoitem="LIRE nombre2"/>
        <item code="5#resultat#nombre1+nombre2#pasliste" algoitem="resultat PREND_LA_VALEUR nombre1+nombre2"/>
        <item code="4#Le resultat est:#0" algoitem="AFFICHER &quot;Le resultat est:&quot;"/>
        <item code="3#resultat#0#pasliste" algoitem="AFFICHER resultat"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
