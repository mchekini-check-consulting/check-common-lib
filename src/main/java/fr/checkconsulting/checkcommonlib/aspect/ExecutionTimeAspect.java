package fr.checkconsulting.checkcommonlib.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * Aspect permettant de mesurer et de journaliser le temps d'exécution des méthodes
 * dans les packages de l'application correspondant à {@code fr.checkconsulting..*}.
 * <p>
 * Cet aspect est activé uniquement si la propriété {@code check-common.log-execution-time=true}
 * est définie dans le fichier de configuration (application.yml/properties).
 * </p>
 *
 * <p>Exemple de log :</p>
 * <pre>
 * [EXECUTION TIME] Méthode exécutée en 123 ms
 * </pre>
 *
 * @author Check Consulting
 */
@Aspect
@Slf4j
@Component
@ConditionalOnProperty(value = "check-common.log-execution-time", havingValue = "true")
public class ExecutionTimeAspect {

    /**
     * Intercepte toutes les méthodes des classes situées sous le package {@code fr.checkconsulting}
     * et mesure leur temps d'exécution.
     *
     * @param joinPoint le point de jointure capturant la méthode appelée
     * @return l'objet retourné par la méthode interceptée
     * @throws Throwable si la méthode interceptée lance une exception
     */
    @Around("execution(* fr.checkconsulting..*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long duration = System.currentTimeMillis() - start;
        log.info("[EXECUTION TIME] Méthode exécutée en {} ms", duration);
        return result;
    }
}