package fr.checkconsulting.checkcommonlib.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration automatique de la bibliothèque {@code check-common-lib}.
 * <p>
 * Cette classe configure automatiquement les composants situés dans le package
 * {@code fr.checkconsulting.checkcommonlib.aspect}, notamment les aspects AOP tels que
 * {@code ExecutionTimeAspect}, en les rendant disponibles pour les projets Spring Boot qui
 * utilisent cette bibliothèque.
 * </p>
 *
 * <p>Cette configuration est activée automatiquement si elle est déclarée dans le fichier
 * {@code org.springframework.boot.autoconfigure.AutoConfiguration.imports}.</p>
 *
 * <p>Utilise l'annotation {@code @Slf4j} pour le logging (via Lombok).</p>
 *
 * @author Check Consulting
 */
@Configuration
@Slf4j
@ComponentScan("fr.checkconsulting.checkcommonlib.aspect")
public class CheckCommonAutoConfiguration {

    /**
     * Constructeur par défaut de la configuration.
     * Peut être utilisé pour journaliser l'initialisation ou d'autres opérations si nécessaire.
     */
    public CheckCommonAutoConfiguration() {
    }
}
