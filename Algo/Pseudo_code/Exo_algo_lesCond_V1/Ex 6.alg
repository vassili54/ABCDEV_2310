<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="SI (genre== &quot;M&quot; ET age > 20 OU genre== &quot;F&quot; ET (age > 18 ET age &lt; 35)) ALORS" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param nbDecimales="8" totalAffichages="1000" arrondiAuto="vrai" epaisseurLigne="2" totalBoucles="5000000" epaisseurPoint="2" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="genre EST_DU_TYPE CHAINE" code="1#CHAINE#genre"/>
        <item algoitem="age EST_DU_TYPE NOMBRE" code="1#NOMBRE#age"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Saisir le genre (M/F) : &quot;" code="4#Saisir le genre (M/F) : #0"/>
        <item algoitem="LIRE genre" code="2#genre#pasliste"/>
        <item algoitem="AFFICHER &quot;Saisir l'age&quot;" code="4#Saisir l'age#0"/>
        <item algoitem="LIRE age" code="2#age#pasliste"/>
        <item algoitem="SI (genre== &quot;M&quot; ET age > 20 OU genre== &quot;F&quot; ET (age > 18 ET age &lt; 35)) ALORS" code="6#genre== &quot;M&quot; ET age > 20 OU genre== &quot;F&quot; ET (age > 18 ET age &lt; 35)">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;Imposable&quot;" code="4#Imposable#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="AFFICHER &quot;Non Imposable&quot;" code="4#Non Imposable#0"/>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
