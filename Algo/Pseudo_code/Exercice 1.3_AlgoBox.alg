<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;L'aire du secteur circulaire est :&quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2para="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" totalAffichages="1000" epaisseurLigne="2" epaisseurPoint="2" totalBoucles="5000000" maxBoucle="500000" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="rayon EST_DU_TYPE NOMBRE" code="1#NOMBRE#rayon"/>
        <item algoitem="angle EST_DU_TYPE NOMBRE" code="1#NOMBRE#angle"/>
        <item algoitem="airSecteurCirculaire EST_DU_TYPE NOMBRE" code="1#NOMBRE#airSecteurCirculaire"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Veuillez saisir le rayon&quot;" code="4#Veuillez saisir le rayon#0"/>
        <item algoitem="LIRE rayon" code="2#rayon#pasliste"/>
        <item algoitem="AFFICHER &quot;Veuillez saisir l'angle&quot;" code="4#Veuillez saisir l'angle#0"/>
        <item algoitem="LIRE angle" code="2#angle#pasliste"/>
        <item algoitem="airSecteurCirculaire PREND_LA_VALEUR (Math.PI*pow(rayon,2)*angle)/360" code="5#airSecteurCirculaire#(Math.PI*pow(rayon,2)*angle)/360#pasliste"/>
        <item algoitem="AFFICHER &quot;L'aire du secteur circulaire est :&quot;" code="4#L'aire du secteur circulaire est :#0"/>
        <item algoitem="AFFICHER airSecteurCirculaire" code="3#airSecteurCirculaire#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
