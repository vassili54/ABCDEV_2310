<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;seconde(s)&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2lignes="" F2defaut="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" epaisseurPoint="2" arrondiAuto="vrai" nbDecimales="8" totalBoucles="5000000" totalAffichages="1000" epaisseurLigne="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="heures EST_DU_TYPE NOMBRE" code="1#NOMBRE#heures"/>
        <item algoitem="minutes EST_DU_TYPE NOMBRE" code="1#NOMBRE#minutes"/>
        <item algoitem="secondes EST_DU_TYPE NOMBRE" code="1#NOMBRE#secondes"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Saisir les heures&quot;" code="4#Saisir les heures#1"/>
        <item algoitem="LIRE heures" code="2#heures#pasliste"/>
        <item algoitem="AFFICHER &quot;Saisir les minutes&quot;" code="4#Saisir les minutes#1"/>
        <item algoitem="LIRE minutes" code="2#minutes#pasliste"/>
        <item algoitem="AFFICHER &quot;Saisir les secondes&quot;" code="4#Saisir les secondes#1"/>
        <item algoitem="LIRE secondes" code="2#secondes#pasliste"/>
        <item algoitem="secondes PREND_LA_VALEUR secondes+1" code="5#secondes#secondes+1#pasliste"/>
        <item algoitem="SI (secondes==60) ALORS" code="6#secondes==60">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="secondes PREND_LA_VALEUR 0" code="5#secondes#0#pasliste"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
        <item algoitem="SI (minutes==60) ALORS" code="6#minutes==60">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="minutes PREND_LA_VALEUR 0" code="5#minutes#0#pasliste"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
        <item algoitem="SI (heures==24) ALORS" code="6#heures==24">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="heures PREND_LA_VALEUR 0" code="5#heures#0#pasliste"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
        <item algoitem="AFFICHER &quot;Dans une seconde il sera &quot;" code="4#Dans une seconde il sera #1"/>
        <item algoitem="AFFICHER heures" code="3#heures#0#pasliste"/>
        <item algoitem="AFFICHER &quot;heure(s)&quot;" code="4#heure(s)#0"/>
        <item algoitem="AFFICHER minutes" code="3#minutes#0#pasliste"/>
        <item algoitem="AFFICHER &quot;minute(s)&quot;" code="4#minute(s)#0"/>
        <item algoitem="AFFICHER secondes" code="3#secondes#0#pasliste"/>
        <item algoitem="AFFICHER &quot;seconde(s)&quot;" code="4#seconde(s)#0"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
