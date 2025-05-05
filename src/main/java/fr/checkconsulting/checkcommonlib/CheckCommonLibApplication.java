package fr.checkconsulting.checkcommonlib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Point d'entrée principal de l'application {@code check-common-lib}.
 * <p>
 * Cette classe démarre une application Spring Boot standard. Dans le cadre d'une
 * bibliothèque comme {@code check-common-lib}, elle est principalement utilisée pour
 * les tests locaux, les démos ou les validations du comportement des composants fournis.
 * </p>
 *
 * <p>Note : Cette classe ne doit généralement pas être utilisée par les projets consommateurs
 * de la bibliothèque. Ceux-ci devraient simplement importer le module comme dépendance Maven.</p>
 *
 * <p>Annotation {@code @SpringBootApplication} : déclenche la configuration automatique, le scan des composants
 * et permet l'exécution via {@code SpringApplication.run(...)}.</p>
 *
 * @author Check Consulting
 */
@SpringBootApplication
public class CheckCommonLibApplication {

    /**
     * Méthode principale de l'application.
     * Lance le contexte Spring Boot.
     *
     * @param args arguments de la ligne de commande
     */
    public static void main(String[] args) {
        SpringApplication.run(CheckCommonLibApplication.class, args);
    }

}
