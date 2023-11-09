<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER aire"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2defaut="" F2para="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" epaisseurLigne="2" nbDecimales="8" totalAffichages="1000" epaisseurPoint="2" totalBoucles="5000000" maxBoucle="500000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#rayon" algoitem="rayon EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#aire" algoitem="aire EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#volume" algoitem="volume EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Veuillez saisir le rayon de la sphère :#0" algoitem="AFFICHER &quot;Veuillez saisir le rayon de la sphère :&quot;"/>
        <item code="2#rayon#pasliste" algoitem="LIRE rayon"/>
        <item code="5#aire#4*Math.PI*pow(rayon,2)#pasliste" algoitem="aire PREND_LA_VALEUR 4*Math.PI*pow(rayon,2)"/>
        <item code="4#L'aire de la sphère est :#0" algoitem="AFFICHER &quot;L'aire de la sphère est :&quot;"/>
        <item code="3#aire#1#pasliste" algoitem="AFFICHER aire"/>
        <item code="5#volume#4/3*Math.PI*pow(rayon,3)#pasliste" algoitem="volume PREND_LA_VALEUR 4/3*Math.PI*pow(rayon,3)"/>
        <item code="4#volume de la sphère est :#0" algoitem="AFFICHER &quot;volume de la sphère est :&quot;"/>
        <item code="3#volume#1#pasliste" algoitem="AFFICHER volume"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
