class MapAvecFiltrage extends Program {
    
    // Vous devez d'abord faire les exercices du fichier Map.java

    // Ici on s'intéresse à des problèmes où l'entrée est une séquence d'éléments
    // et la sortie et aussi une séquence d'éléments,
    // mais seuls certains éléments de l'entrée participent à la sortie (filtrage)

    // ////////////////////////////////////////////////////////////////////////
    // Exercices 
    // ////////////////////////////////////////////////////////////////////////
    
    // **Indications** :
    // Pour chaque exercice, posez-vous les questions:
    // - quels sont les élément de l'entrée ? comment les énumérer ?
    // - quelle est la condition pour qu'un élément de l'entrée participe à la sortie ?
    // - comment obtenir l'élément de la sortie à partir de l'élément de l'entrée ?

    // -------------------------------------------------
    // préparation pour encodage dans Enigma
    void testLettresSeules () {
        assertEquals("JaihatedefaireleDSdeDev", lettresSeules("J'ai hate de faire le DS de Dev."));
        assertEquals("undeuxtrois", lettresSeules("un deux trois !"));
        assertEquals("", lettresSeules("@##@!$"));
    }
    // Prend en entrée une chaine de caractères, et returne une chaine 
    // qui ne garde que les lettres de la chaine en entrée
    // (Enigma n'encode que des lettres ...)
    // Il peut être utile de définir une fonction d'aide boolean estLettre (char car)
    String lettresSeules (String phrase) {
        return "";
    }

    // -------------------------------------------------
    // préparation pour encodage dans Enigma en mieux
    void testLettresSeulesEnMajuscules () {
        assertEquals("JAIHATEDEFAIRELEDSDEDEV", lettresSeulesEnMajuscules("J'ai hate de faire le DS de Dev."));
        assertEquals("UNDEUXTROIS", lettresSeulesEnMajuscules("un deux trois !"));
        assertEquals("", lettresSeulesEnMajuscules("@##@!$"));
    }
    // Similaire à la fonction précédente, mais toutes les lettres dans la 
    // sortie sont transformées en majuscules
    String lettresSeulesEnMajuscules(String phrase) {
        return "";
    }

    // -------------------------------------------------
    // candidats pour soutien
    // En entrée on a un tableau de notes, et on veut afficher les notes
    // inférieures ou égales à 8
    void afficherNotesFaibles (double[] notes) {
        // À compléter
    }

    // Décommenter pour tester afficherNotesFaibles
    /* 
    void algorithm () {
        // Doit afficher les notes 4.0 2 5.3
        afficherNotesFaibles(new double[]{13, 4.0, 17.4, 12, 2, 5.3, 14.1});
    }
    */


}