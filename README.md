# MonstersWeb

## Description

Version application web de Kotlin Monsters

---

## Contexte

Le projet consiste à développer une version web de l'application Kotlin Monsters, initialement réalisée sous forme d'un programme en ligne de commande. L'objectif est de transposer le jeu dans une interface graphique accessible via un navigateur web, afin d'améliorer l'expérience utilisateur et de rendre le jeu plus attractif et interactif.

Cette nouvelle version permettra :
- D'afficher le jeu à l'aide d'une interface visuelle moderne, remplaçant les interactions textuelles du terminal.
- D'intégrer des éléments dynamiques (animations, boutons, menus, effets visuels, etc.) pour rendre la navigation plus fluide.
- D'offrir une meilleure accessibilité, le jeu pouvant être lancé depuis n'importe quel appareil connecté à Internet.
- D'éventuellement étendre les fonctionnalités du jeu original, comme la sauvegarde des parties, la gestion de profils utilisateurs, ou encore un classement en ligne.

Le projet s'inscrit dans une logique d'évolution technologique du jeu existant, en exploitant des technologies web modernes (telles que HTML, CSS, JavaScript, et un framework adapté comme React, Vue ou Kotlin/JS) tout en conservant les mécaniques de jeu déjà développées en Kotlin.

---

## Objectifs

L'objectif principal du projet est de concevoir et développer une application web interactive permettant de jouer à un jeu inspiré des mécaniques fondamentales de la série Pokémon.

Plus précisément, l'application devra :
- Reproduire les principes de base du gameplay Pokémon, tels que la capture, le combat et la gestion de créatures (ici, les monsters).
- Offrir une interface graphique intuitive et agréable, permettant au joueur de naviguer facilement entre les différentes sections du jeu (écran d'accueil, inventaire, zones de combat, etc.).
- Transposer les fonctionnalités existantes de la version Kotlin d'origine vers un environnement web, tout en optimisant l'ergonomie et la fluidité des interactions.
- Assurer la compatibilité multiplateforme, afin que le jeu puisse être accessible depuis différents appareils (ordinateur, tablette, smartphone) via un simple navigateur.
- Poser les bases d'une évolution future du jeu, en prévoyant la possibilité d'ajouter de nouvelles fonctionnalités comme la personnalisation du joueur, le multijoueur en ligne, ou la sauvegarde des progressions.

L'ensemble de ces objectifs vise à moderniser et valoriser le projet Kotlin Monsters, en le rendant plus immersif, plus accessible et plus proche des standards des jeux web actuels.

---

## Contexte pédagogique

Les étudiants de BTS SIO SLAM doivent produire dans le cadre de leurs formations au moins 2 projets qui utilisent un framework web.

Les technologies pour les 2 projets choisies par l'équipe pédagogique sont les suivantes :
- Un projet en **Kotlin** avec le framework **SpringBoot**
- Un projet en **Javascript (Typescript)** avec le framework **Angular**

Le SGBD choisi est **MariaDB**.

---

## Étude du marché

| Nom | Atouts / Inconvénients |
|-----|------------------------|
| **Pokemon Rogue** — https://pokerogue.net | Style 2D et interface comme les anciens jeux Pokémon. L'interface peut être chargée notamment avec les objets. |
| **Pokemon Showdown** — https://pokemonshowdown.com | Interface et style un peu plus dans l'air des jeux Pokémon récents. Il n'y a pas beaucoup d'animation et le style peut déplaire. |

---

## Contexte organisationnel

**Période :** Novembre 2025  
**Effectif :** 1 étudiant, 2 professeurs

---

## Analyse fonctionnelle

### Les acteurs

- **Visiteur** : une personne qui passe sur le site afin de voir les monstres créés ou consulter les informations du site. S'il le souhaite, il peut s'inscrire sur l'application.
- **Utilisateur** : une personne qui s'est inscrite et connectée à son compte. Il peut sauvegarder sa partie.
- **Admin** : une personne qui est inscrite et qui a le rôle d'administrateur. Il gère les monstres disponibles et administre également les utilisateurs de l'application.

### Les fonctionnalités principales

- **Connexion** : Permet à un utilisateur enregistré d'accéder à son compte en entrant ses identifiants (adresse e-mail et mot de passe). Une fois connecté, l'utilisateur peut accéder à toutes les fonctionnalités disponibles selon son rôle (utilisateur ou administrateur).
- **Inscription** : Permet à un nouvel utilisateur de créer un compte sur la plateforme en fournissant des informations de base comme le nom, l'adresse e-mail, et le mot de passe.
- **Modification de mot de passe** : Permet à un utilisateur de changer son mot de passe actuel.
- **Gérer les utilisateurs** : Permet aux administrateurs de gérer les comptes utilisateurs, incluant la modification des informations de compte, la réinitialisation des mots de passe, et la suppression de comptes.
- **Consulter la politique de confidentialité** : Permet à l'utilisateur de lire la politique de confidentialité de l'application, expliquant comment les données personnelles sont traitées et protégées.
- **Donner son avis** : Permet aux utilisateurs de laisser des commentaires ou des avis sur l'application, pour donner des retours ou des suggestions d'amélioration.
- **Gestion du jeu** : L'administrateur pourra ajouter ou retirer de nouvelles espèces de monstres, ajuster leurs caractéristiques, et modifier divers éléments liés à ces monstres ainsi qu'à l'ensemble du jeu.
- **Jouer** : Donne la possibilité de commencer une partie et de jouer au jeu, permettant à l'utilisateur de consulter son équipe et d'accéder aux autres actions possibles.
- **Quitter** : Permet de sauvegarder la partie et d'arrêter le jeu.

---

## Analyse Technique

### Architecture du projet

#### Langages

| Nom | Description |
|-----|-------------|
| **Kotlin** | Langage de programmation orienté objet et fonctionnel, avec un typage statique qui permet de compiler pour la JVM, JavaScript, et vers plusieurs plateformes en natif. |
| **JS / TS** | JS est un langage de scripts principalement employé dans les pages web interactives. TS est un langage open source développé par Microsoft pour améliorer et sécuriser la production de code JavaScript. |
| **HTML** | Langage de balisage utilisé pour structurer et organiser le contenu des pages web. S'utilise conjointement avec CSS et JavaScript. |
| **CSS** | Langage de feuille de style décrivant la présentation des documents HTML (couleurs, polices, marges, dispositions, etc.). |
| **SQL** | Langage de requête structuré pour interagir avec les bases de données relationnelles (création, modification, consultation). |

#### Serveur et environnement d'exécution

| Nom | Description |
|-----|-------------|
| **Apache Tomcat** | Serveur d'applications, conteneur web libre de servlets et JSP. Issu du projet Jakarta (Apache Software Foundation). |
| **Node.js** | Environnement d'exécution JavaScript côté serveur, basé sur le moteur V8 de Chrome. Adopte un modèle asynchrone et orienté événements. |
| **MariaDB** | SGBD relationnel open source, dérivé de MySQL. Met l'accent sur la performance, la sécurité et la transparence du code. |

#### Frameworks et Bibliothèques

| Nom | Description |
|-----|-------------|
| **Spring Boot** | Framework open source basé sur Spring pour le développement d'applications Java/Kotlin. Simplifie la création d'API REST, microservices et applications d'entreprise. |
| **Angular** | Framework open source développé par Google pour créer des applications web dynamiques côté client (SPA). Écrit en TypeScript, basé sur une architecture de composants. |
| **Bootstrap** | Framework front-end open source facilitant la création de sites modernes et responsives. Propose un ensemble de composants préconstruits (grilles, formulaires, boutons, etc.). |

#### Outils et IDEs

| Nom | Description |
|-----|-------------|
| **IntelliJ IDEA** | Environnement de développement intégré pour les applications Java et Kotlin (JetBrains). |
| **VS Code** | Éditeur de code source open source développé par Microsoft. Multiplateforme, extensible, avec autocomplétion et débogage intégré. |
| **Figma** | Outil de conception UI/UX collaboratif basé sur le cloud. Permet de créer des maquettes et prototypes interactifs en temps réel. |
| **StarUML** | Outil de modélisation UML multiplateforme pour la conception et documentation de logiciels (diagrammes de classes, séquence, activité, etc.). |
| **Google Drive** | Service de stockage et gestion de fichiers en ligne proposé par Google. Facilite la collaboration en temps réel. |
| **GitHub** | Plateforme de développement collaboratif basée sur Git. Permet de stocker, gérer, partager le code source et suivre les modifications. |

---

## Analyse du domaine métier

### Vocabulaire métier

- **Monstre** : Créature que le joueur peut capturer, entraîner et faire combattre.
- **Dresseur** : Personnage contrôlé par le joueur qui capture et entraîne les monstres.
- **Combat** : Affrontement entre deux monstres, souvent avec des tours ou actions stratégiques.
- **Niveau** : Indicateur de puissance et d'expérience d'un monstre ou d'un dresseur.
- **Type** : Catégorie d'un monstre (ex. Feu, Eau, Plante) qui influence les forces et faiblesses lors des combats.
- **Capacité / Attaque** : Action qu'un monstre peut utiliser lors d'un combat, avec un effet spécifique.
- **Objet** : Éléments que le joueur peut utiliser pour soigner, améliorer ou capturer des monstres.

### Contraintes particulières

- **Limite de capture** : 6 monstres maximum dans une équipe simultanément.
- **Équilibrage des combats** : Chaque type de monstre doit avoir des forces et faiblesses pour garantir un gameplay équilibré.
- **Progression du joueur** : Les niveaux et l'expérience doivent progresser de manière cohérente.
- **Évolution des monstres** : Certains monstres peuvent évoluer sous certaines conditions (niveau, objet, événement).
- **Accessibilité / Interface** : Le jeu doit être clair et simple à prendre en main.
- **Stockage et sauvegarde** : Gestion des données des joueurs et monstres (sauvegarde en ligne).
- **Compatibilité des monstres et attaques** : Certaines attaques ne peuvent être utilisées que par certains types de monstres.
- **Randomisation** : La génération aléatoire des monstres sauvages ou des objets doit rester juste et prévisible pour le joueur.

---

## Analyse technologique

### Choix du chiffrement des mots de passe

Principales fonctions de hachage recommandées pour le stockage des mots de passe :

- **Argon2** : Algorithme issu de la Password Hashing Competition, conçu pour résister aux attaques par GPU/ASIC et être memory-hard.
- **bcrypt** : Fonction éprouvée depuis longtemps, largement supportée dans de nombreux frameworks.
- **scrypt** : Également memory-hard, bon compromis entre coût CPU et mémoire.
- **PBKDF2** : Fonction plus ancienne, très supportée, mais moins résistante aux attaques modernes hardware.

#### Tableau de comparaison

| Algorithme | Facilité d'implémentation | Taille du hash | Utilisation du sel | Résistance matérielle | Remarques |
|------------|--------------------------|----------------|--------------------|-----------------------|-----------|
| **Argon2** | Moyenne-élevée : nécessite configuration mémoire/itérations | Variable, ~256 bits ou plus | Oui (fortement recommandé) | Très haute (memory-hard) | Algorithme moderne, paramétrable |
| **bcrypt** | Élevée : très bien supporté dans de nombreux langages | ~184 bits (~23 octets) | Oui, intégré | Moyenne-haute (mémoire limitée) | Très bon choix pour compatibilité / simplicité |
| **scrypt** | Moyenne : bonne implémentation mais paramétrage plus fin | Configurable, ~256 bits | Oui | Haute (memory-hard) | Bon compromis, mais moins répandu que bcrypt |
| **PBKDF2** | Très facile : largement supporté | Variable selon hachage sous-jacent | Oui | Moins bonne face aux GPU/ASIC | Utilisable surtout si compatibilité / conformité requise |

#### Critères considérés

- **Facilité d'implémentation** : disponibilité des bibliothèques & simplicité d'usage
- **Taille du hash** : longueur de sortie et capacité à stocker côté base de données
- **Utilisation du sel** : présence d'un salt unique pour chaque mot de passe
- **Résistance matérielle** : capacité à résister aux attaques par matériel spécialisé (GPU, ASIC)

#### Justification du choix final : **Argon2**

- Il offre la meilleure résistance aux attaques modernes, notamment via sa nature memory-hard, ce qui le rend plus résistant aux attaques par GPU/ASIC.
- Même si l'implémentation est un peu plus complexe que bcrypt, il existe de très bonnes bibliothèques (ex. Password4j) qui le prennent en charge.
- Pour un jeu web, où la confidentialité des comptes joueurs n'est pas d'un niveau ultra-sensible (pas de données bancaires), mais où une fuite de mots de passe aurait un impact sur l'expérience, mieux vaut adopter une solution plus robuste que le minimum.
- Le coût en ressources (CPU/mémoire) est acceptable puisqu'on ne s'attend pas à des millions de logins simultanés par seconde dans un jeu indie.

---

## Conception

### Charte graphique

#### Typographie

- **Police principale** (titres et menus) : **Montserrat** — moderne et lisible, idéale pour les interfaces web et mobiles.
- **Police secondaire** (texte courant, descriptions) : **Roboto** — simple et claire pour la lecture prolongée.

Variantes :
- Titres : Bold, 24–36 px
- Sous-titres : Medium, 18–24 px
- Texte courant : Regular, 14–16 px

> Consigne : Limiter le nombre de polices à 2 pour garder une cohérence visuelle.

#### Couleurs principales

| Rôle | Couleur hex | Exemple d'usage |
|------|-------------|-----------------|
| Couleur principale | `#4CAF50` | Boutons, titres principaux, accents |
| Couleur secondaire | `#FF9800` | Boutons secondaires, hover, notifications |
| Contour de la page | `#424242` | La barre sur le côté gauche de la page |
| Couleur de texte | `#212121` | Texte principal |
| Couleur de texte secondaire | `#757575` | Sous-titres, légendes |

Consignes :
- Conserver un contraste suffisant pour l'accessibilité.
- Utiliser les couleurs secondaires pour les éléments interactifs ou ponctuels.

#### Logo

- **Format** : SVG pour les interfaces web, PNG pour les supports imprimés.
- **Couleurs** : Utiliser les couleurs principales pour assurer une identité cohérente.
- **Versions** :
  - Version pleine couleur pour les pages principales et promotions.
  - Version monochrome (blanc/noir) pour les fonds colorés ou impressions.
- **Consignes** :
  - Respecter les marges autour du logo pour ne pas le surcharger.
  - Ne pas déformer le logo (proportions à conserver).
