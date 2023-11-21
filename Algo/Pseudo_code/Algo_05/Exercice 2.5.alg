<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot; est divisible par : &quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2etat="inactif" F2lignes="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" maxBoucle="500000" totalAffichages="1000" arrondiAuto="vrai" totalBoucles="5000000" epaisseurPoint="2" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nb EST_DU_TYPE NOMBRE" code="1#NOMBRE#nb"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="compteur EST_DU_TYPE NOMBRE" code="1#NOMBRE#compteur"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Saisir un nombre entier&quot;" code="4#Saisir un nombre entier#0"/>
        <item algoitem="LIRE nb" code="2#nb#pasliste"/>
        <item algoitem="compteur PREND_LA_VALEUR 0" code="5#compteur#0#pasliste"/>
        <item algoitem="POUR i ALLANT_DE 2 A nb-1" code="12#i#2#nb-1">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="SI (nb %  i == 0) ALORS" code="6#nb %  i == 0">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER nb" code="3#nb#0#pasliste"/>
                <item algoitem="AFFICHER &quot; est divisible par : &quot;" code="4# est divisible par : #0"/>
                <item algoitem="AFFICHER i" code="3#i#1#pasliste"/>
                <item algoitem="compteur PREND_LA_VALEUR compteur+1" code="5#compteur#compteur+1#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER &quot;Le nombre &quot;" code="4#Le nombre #0"/>
        <item algoitem="AFFICHER nb" code="3#nb#0#pasliste"/>
        <item algoitem="AFFICHER &quot; a &quot;" code="4# a #0"/>
        <item algoitem="AFFICHER compteur" code="3#compteur#0#pasliste"/>
        <item algoitem="AFFICHER &quot; diviseur&quot;" code="4# diviseur#0"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
