<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_SI"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2defaut="" F2lignes="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" totalAffichages="1000" epaisseurLigne="2" totalBoucles="5000000" nbDecimales="8" arrondiAuto="vrai" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="heures EST_DU_TYPE NOMBRE" code="1#NOMBRE#heures"/>
        <item algoitem="minutes EST_DU_TYPE NOMBRE" code="1#NOMBRE#minutes"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Saisir les heures&quot;" code="4#Saisir les heures#1"/>
        <item algoitem="LIRE heures" code="2#heures#pasliste"/>
        <item algoitem="AFFICHER &quot;Saisir les minutes&quot;" code="4#Saisir les minutes#1"/>
        <item algoitem="LIRE minutes" code="2#minutes#pasliste"/>
        <item algoitem="minutes PREND_LA_VALEUR minutes+1" code="5#minutes#minutes+1#pasliste"/>
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
        <item algoitem="AFFICHER &quot;Dans une minute il sera &quot;" code="4#Dans une minute il sera #1"/>
        <item algoitem="AFFICHER heures" code="3#heures#0#pasliste"/>
        <item algoitem="AFFICHER &quot;heure(s)&quot;" code="4#heure(s)#0"/>
        <item algoitem="AFFICHER minutes" code="3#minutes#0#pasliste"/>
        <item algoitem="AFFICHER &quot;minute(s)&quot;" code="4#minute(s)#0"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
