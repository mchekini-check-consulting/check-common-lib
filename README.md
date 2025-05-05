# check-common-lib

**check-common-lib** est une bibliothèque Java pour les applications Spring Boot, développée par Check Consulting.  
Elle fournit des composants réutilisables tels que des aspects AOP pour mesurer les temps d'exécution des méthodes, facilitant ainsi le monitoring et la traçabilité des performances.

---

## 📦 Fonctionnalités

- **Aspect `ExecutionTimeAspect`** : mesure et logge le temps d'exécution des méthodes du package `fr.checkconsulting..*`.
- **Auto-configuration Spring Boot** : intégration automatique via `@AutoConfiguration` et le fichier `AutoConfiguration.imports`.
- **Prête à l'emploi** : aucune configuration manuelle nécessaire pour l'intégration dans vos projets Spring Boot.

---

## 🚀 Installation

Ajoutez la dépendance Maven suivante à votre projet (si publiée dans un repository Maven) :

```xml
<dependency>
  <groupId>fr.checkconsulting</groupId>
  <artifactId>check-common-lib</artifactId>
  <version>1.0.0</version>
</dependency>
```

> ℹ️ Assurez-vous que le JAR est publié dans votre dépôt Maven local ou distant.

---

## ⚙️ Configuration automatique

La bibliothèque utilise le mécanisme d'auto-configuration de Spring Boot.  
Elle déclare le fichier suivant :

```text
src/main/resources/META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports
```

Contenu :

```
fr.checkconsulting.checkcommonlib.config.CheckCommonAutoConfiguration
```

Cela permet à Spring Boot de détecter et d'enregistrer automatiquement les composants fournis par la bibliothèque.

---

## 🧩 Utilisation de l'aspect `ExecutionTimeAspect`

L'aspect est automatiquement activé et mesure le temps d'exécution de toutes les méthodes des classes situées dans `fr.checkconsulting..*`.

Exemple de log :

```
[EXECUTION TIME] Méthode exécutée en 150 ms
```

---

## 🛠️ Personnalisation

### ➕ Désactiver l'auto-configuration

Vous pouvez exclure l'auto-configuration si besoin :

```java
@SpringBootApplication(exclude = CheckCommonAutoConfiguration.class)
public class MyApplication {
}
```

### ➕ Redéfinir l'aspect

Déclarez votre propre bean `ExecutionTimeAspect` dans votre configuration :

```java
@Bean
public ExecutionTimeAspect customExecutionTimeAspect() {
    return new ExecutionTimeAspect();
}
```

---

## 📁 Structure du projet

```
check-common-lib/
├── src/
│   └── main/
│       ├── java/
│       │   └── fr/checkconsulting/checkcommonlib/
│       │       ├── aop/
│       │       │   └── ExecutionTimeAspect.java
│       │       └── config/
│       │           └── CheckCommonAutoConfiguration.java
│       └── resources/
│           └── META-INF/
│               └── spring/
│                   └── org.springframework.boot.autoconfigure.AutoConfiguration.imports
├── pom.xml
└── README.md
```

---

## 🤝 Contribuer

Les contributions sont les bienvenues !  
N'hésitez pas à ouvrir des issues ou à proposer des améliorations via pull request.

---

## 📄 Licence

Ce projet est sous licence MIT.  
Consultez le fichier [LICENSE](LICENSE) pour plus d'informations.

---
