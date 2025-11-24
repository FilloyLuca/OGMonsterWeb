Nom du projet : MonstersWeb
Description : Version application web de kotlin monsters

Contexte : Le projet consiste à développer une version web de l’application Kotlin Monsters, initialement réalisée sous forme d’un programme en ligne de commande. L’objectif est de transposer le jeu dans une interface graphique accessible via un navigateur web, afin d’améliorer l’expérience utilisateur et de rendre le jeu plus attractif et interactif.
Cette nouvelle version permettra :
    • D’afficher le jeu à l’aide d’une interface visuelle moderne, remplaçant les interactions textuelles du terminal.
    • D’intégrer des éléments dynamiques (animations, boutons, menus, effets visuels, etc.) pour rendre la navigation plus fluide.
    • D’offrir une meilleure accessibilité, le jeu pouvant être lancé depuis n’importe quel appareil connecté à Internet.
    • D’éventuellement étendre les fonctionnalités du jeu original, comme la sauvegarde des parties, la gestion de profils utilisateurs, ou encore un classement en ligne.
Le projet s’inscrit dans une logique d’évolution technologique du jeu existant, en exploitant des technologies web modernes (telles que HTML, CSS, JavaScript, et un framework adapté comme React, Vue ou Kotlin/JS) tout en conservant les mécaniques de jeu déjà développées en Kotlin.


Objectifs : L’objectif principal du projet est de concevoir et développer une application web interactive permettant de jouer à un jeu inspiré des mécaniques fondamentales de la série Pokémon.
Plus précisément, l’application devra :
    • Reproduire les principes de base du gameplay Pokémon, tels que la capture, le combat et la gestion de créatures (ici, les monsters).
    • Offrir une interface graphique intuitive et agréable, permettant au joueur de naviguer facilement entre les différentes sections du jeu (écran d’accueil, inventaire, zones de combat, etc.).
    • Transposer les fonctionnalités existantes de la version Kotlin d’origine vers un environnement web, tout en optimisant l’ergonomie et la fluidité des interactions.
    • Assurer la compatibilité multiplateforme, afin que le jeu puisse être accessible depuis différents appareils (ordinateur, tablette, smartphone) via un simple navigateur.
    • Poser les bases d’une évolution future du jeu, en prévoyant la possibilité d’ajouter de nouvelles fonctionnalités comme la personnalisation du joueur, le multijoueur en ligne, ou la sauvegarde des progressions.
L’ensemble de ces objectifs vise à moderniser et valoriser le projet Kotlin Monsters, en le rendant plus immersif, plus accessible et plus proche des standards des jeux web actuels.


Contexte pédagogique 
Les étudiants de BTS SIO SLAM doivent produire dans le cadre de leurs formations aux moins 2 projets qui utilisent un framework web. 
Les technologies pour les 2 projets choisit par l’équipe pédagogique sont les suivants : 
    • Un projet en Kotlin avec le framework SpringBoot
    • Un projet en Javascript (Typescript) avec le framework Angular 
Le SGBD (Système de gestion de base de données) choisi est MariaDb
Étude du marché
NOM
ATOUTS/INCONVENIENTS
SCREENSHOTS
Pokemon rogue 
https://pokerogue.net
Style 2d et Interface comme les anciens jeux pokemon

L’interface peut être charger notamment avec les objets 


Pokemon showdown
https://pokemonshowdown.com
Interface et Style un peu plus dans l’air des jeux pokemon récent

Il n’y a pas beaucoup d’animation et le style peut déplaire 




Contexte organisationnelle 
       L’analyse, la conception et la gestion de projet 
Période : Novembre 2025
Effectif : 1 étudiant, 2 professeurs


Analyse fonctionnelle  

	Les acteurs    

	Visiteur : une personne qui passe sur le site afin de voir les monstres crées ou 	consulter 	les informations du site. S’il le souhaite, il peut s’inscrire sur l’application.

	Utilisateur : une personne qui s’est inscrite et connecté à son compte. Il peut 	sauvegarder sa partie.  
	Admin : Une personne qui est inscrite et qui a le rôle d’administrateur. Il gère les 	monstres disponibles , il administre également les utilisateurs de 	l’application.

	Les fonctionnalités principales
       Connexion : Permet à un utilisateur enregistré d'accéder à son compte en entrant ses identifiants (adresse e-mail et mot de passe). Une fois connecté, l'utilisateur peut accéder à toutes les fonctionnalités disponibles selon son rôle (utilisateur ou administrateur).
       
	Inscription: Permet à un nouvel utilisateur de créer un compte sur la plateforme en 	fournissant des informations de base comme le nom, l'adresse e-mail, et le mot de passe.
	Modification de mot de passe : Permet à un utilisateur de changer son mot de passe 		actuel.
	Gérer les utilisateurs : Permet aux administrateurs de gérer les comptes 	utilisateurs, 	incluant la modification des informations de compte, la réinitialisation des mots de 	passe, et la suppression de comptes.
	Consulter la politique de confidentialité : Permet à l'utilisateur de lire la 	politique de 	confidentialité de l'application, expliquant comment les données 	personnelles sont traitées 	et protégées.
	Donner son avis : Permet aux utilisateurs de laisser des commentaires ou des avis sur 	l'application, pour donner des retours ou des suggestions 	d'amélioration.
	Gestion du jeu : L'administrateur pourra ajouter ou retirer de nouvelles 	espèces de 	monstres, ajuster leurs caractéristiques, et modifier divers éléments liés à ces 	monstres 	ainsi qu'à l'ensemble du jeu.
	Jouer : Donne la possibilité de commencer une partie et de jouer au jeu, 	permettant à 	l'utilisateur de consulter son équipe et d'accéder aux autres actions possibles.
	Quitter : Permet de sauvegarder la partie et d’arrêter le jeu.


Diagramme de cas d’utilisation








Analyse Technique 
 Architecture du projet 
Langages 
Nom
Logo
Description
Kotlin

Kotlin est un langage de programmation orienté objet et fonctionnel, avec un typage statique qui permet de compiler pour la machine virtuelle Java, JavaScript, et vers plusieurs plateformes en natif
JS/TS

JS est un langage de programmation de scripts principalement employé dans les pages web interactives et les applications web.

TS est un langage de programmation libre et en open source développé par Microsoft qui a pour but d'améliorer et de sécuriser la production de code JavaScript
HTML

HTML (HyperText Markup Language) est un langage de balisage utilisé pour structurer et organiser le contenu des pages web. Il ne s’agit pas d’un langage de programmation, mais d’un langage descriptif permettant de définir la structure des documents via des balises. HTML sert de fondation au web et s’utilise conjointement avec CSS pour la mise en forme et JavaScript pour l’interactivité.
CSS

CSS (Cascading Style Sheets) est un langage de feuille de style utilisé pour décrire la présentation et la mise en forme des documents HTML. Il permet de définir l’apparence visuelle des pages web, notamment les couleurs, les polices, les marges, les alignements et les dispositions des éléments. CSS sépare le contenu de la structure HTML de sa présentation, favorisant ainsi une conception plus claire, réutilisable et responsive des interfaces web.
SQL



SQL (Structured Query Language) est un langage de requête structuré utilisé pour interagir avec les bases de données relationnelles. Il permet de créer, modifier et gérer les structures de données (tables, vues, index), ainsi que d’insérer, de mettre à jour, de supprimer et de consulter des informations. SQL est un langage déclaratif, ce qui signifie que l’on décrit le résultat attendu sans spécifier la manière de l’obtenir, et il constitue la norme pour la majorité des systèmes de gestion de bases de données tels que MySQL, PostgreSQL, Oracle ou SQL Server.

       
       
       
       
       Serveur et environnement d’exécution 
Nom
Logo
Description
Apache Tomcat

Apache Tomcat ou simplement Tomcat est un serveur d'applications, plus précisément un conteneur web libre de servlets et JSP. Issu du projet Jakarta, c'est un des nombreux projets de l’Apache Software Foundation.
NodeJS

Node.js est un environnement d’exécution JavaScript côté serveur, basé sur le moteur V8 de Google Chrome. Il permet d’exécuter du code JavaScript en dehors d’un navigateur web, rendant possible le développement d’applications réseau performantes et évolutives. Node.js adopte un modèle asynchrone et orienté événements, ce qui favorise la gestion efficace des entrées/sorties et la création de serveurs web légers. Il dispose également d’un vaste écosystème de modules accessibles via le gestionnaire de paquets npm.
MariaDb

MariaDB est un système de gestion de bases de données relationnelles open source, dérivé de MySQL. Il utilise le langage SQL pour la gestion et la manipulation des données, tout en offrant une compatibilité étroite avec MySQL. Développé pour garantir la continuité du projet après la reprise de MySQL par Oracle, MariaDB met l’accent sur la performance, la sécurité et la transparence du code. Il est largement utilisé pour les applications web et serveurs, et prend en charge des fonctionnalités avancées telles que la réplication, le clustering et plusieurs moteurs de stockage.
       
       Framework et Bibliothèque
Nom
Logo
Description
Spring Boot


Spring Boot est un framework open source basé sur le framework Spring pour le développement d’applications Java. Il simplifie la création d’applications autonomes et prêtes à l’emploi en réduisant la configuration manuelle grâce à un ensemble de conventions et à une intégration automatique des dépendances. Spring Boot embarque un serveur web intégré (comme Tomcat ou Jetty), ce qui permet d’exécuter une application sans déploiement externe. Il est particulièrement utilisé pour développer des API REST, des microservices et des applications d’entreprise robustes et modulaires.
Angular

Angular est un framework open source développé par Google, utilisé pour créer des applications web dynamiques et modernes côté client. Écrit en TypeScript, il repose sur une architecture basée sur les composants, favorisant la réutilisation du code et la maintenance des projets à grande échelle. Angular intègre des fonctionnalités avancées telles que le data binding, la gestion des routes, l’injection de dépendances et la communication avec des API REST. Il est particulièrement adapté au développement d’applications web monopage (SPA, Single Page Applications) performantes et structurées.
Bootstrap

Bootstrap est un framework front-end open source conçu pour faciliter la création de sites web modernes, responsives et cohérents. Développé initialement par Twitter, il repose sur HTML, CSS et JavaScript, et propose un ensemble de composants préconstruits tels que des grilles, des formulaires, des boutons, des barres de navigation et des modales. Grâce à son système de grille flexible et à ses classes utilitaires, Bootstrap permet de concevoir rapidement des interfaces adaptatives et harmonieuses sur tous types d’appareils.
       
       
       
       
       
       Outils et IDEs
Nom
Logo
Description
Inteliji idea

IntelliJ IDEA est un environnement de développement intégré pour les applications Java ou Kotlin de la société JetBrains.
VS Code

Visual Studio Code (souvent abrégé VS Code) est un éditeur de code source open source développé par Microsoft. Multiplateforme (Windows, macOS et Linux), il prend en charge de nombreux langages de programmation grâce à un système d’extensions riche et personnalisable. VS Code offre des fonctionnalités avancées telles que la coloration syntaxique, l’autocomplétion intelligente, le débogage intégré, le contrôle de version avec Git, et une interface légère mais puissante. Il est largement utilisé par les développeurs pour sa rapidité, sa flexibilité et sa communauté active.
Figma

Figma est un outil de conception d’interfaces utilisateur (UI) et d’expérience utilisateur (UX) collaboratif, basé sur le cloud. Il permet de créer des maquettes, des prototypes interactifs et des systèmes de design directement depuis un navigateur, sans installation locale. Figma se distingue par ses fonctionnalités de travail en temps réel, qui facilitent la collaboration entre designers, développeurs et chefs de projet. Grâce à son intégration avec divers plugins et à sa gestion de composants réutilisables, Figma est largement utilisé pour la conception d’applications web et mobiles modernes.
StarUML

StarUML est un outil de modélisation UML (Unified Modeling Language) puissant et multiplateforme, utilisé pour la conception et la documentation de logiciels. Il permet de créer des diagrammes UML tels que les diagrammes de classes, de séquence, d’activité ou d’états, facilitant la visualisation de l’architecture et du comportement des systèmes. StarUML prend en charge des fonctionnalités avancées comme les extensions, les modèles personnalisés et l’exportation vers différents formats, ce qui en fait un outil pratique pour les développeurs et architectes logiciels dans la planification et la communication des projets.
Google Drive

Google Drive est un service de stockage et de gestion de fichiers en ligne proposé par Google. Il permet de sauvegarder, organiser et partager des documents, feuilles de calcul, présentations, images et autres types de fichiers depuis n’importe quel appareil connecté à Internet. Intégré à la suite Google Workspace, Google Drive facilite la collaboration en temps réel grâce à des fonctionnalités de partage, de commentaires et de coédition. Il offre également des options de synchronisation locale et de sauvegarde automatique, permettant un accès sécurisé et centralisé aux données.
Git Hub

GitHub est une plateforme de développement collaboratif basée sur Git, un système de gestion de versions distribué. Elle permet aux développeurs de stocker, gérer et partager leur code source, de suivre les modifications, et de collaborer sur des projets open source ou privés. GitHub offre également des fonctionnalités avancées telles que le suivi des problèmes (issues), les demandes de fusion (pull requests), l’intégration continue et les pages web hébergées (GitHub Pages). Il est largement utilisé dans l’industrie pour le versioning, la collaboration et la gestion de projets logiciels.
Analyse du domaine métier

vocabulaire métier
	Monstre : Créature que le joueur peut capturer, entraîner et faire combattre.
	Dresseur : Personnage contrôlé par le joueur qui capture et entraîne les 	monstres.
	Combat : Affrontement entre deux monstres, souvent avec des tours ou 	actions 	stratégiques.
	Niveau : Indicateur de puissance et d’expérience d’un monstre ou d’un 	dresseur.
	Type : Catégorie d’un monstre (par exemple Feu, Eau, Plante) qui influence les 	forces et 	faiblesses lors des combats.
	Capacité / Attaque : Action qu’un monstre peut utiliser lors d’un combat, avec 	un effet 	spécifique.
	Objet : Éléments que le joueur peut utiliser pour soigner, améliorer ou 	capturer des 	monstres.
contraintes particulières

	Limite de capture : Combien de monstres un joueur peut posséder 	simultanément (6 	max dans une équipe).
      Équilibrage des combats : Chaque type de monstre doit avoir des forces et faiblesses pour garantir un gameplay équilibré.
      Progression du joueur : Les niveaux et l’expérience doivent progresser de manière cohérente.
      Évolution des monstres : Certains monstres peuvent évoluer sous certaines conditions (niveau, objet, événement).
      Accessibilité / Interface : Le jeu doit être clair et simple à prendre en main.
      Stockage et sauvegarde : Gestion des données des joueurs et monstres (sauvegarde en ligne).
      Compatibilité des monstres et attaques : Certaines attaques ne peuvent être utilisées que par certains types de monstres.
      Randomisation : La génération aléatoire des monstres sauvages ou des objets doit rester juste et prévisible pour le joueur.

Diagramme de classe


Analyse technologique

Choix du chiffrement des mots de passe
Voici les principales fonctions de hachage recommandées pour le stockage des mots de passe :
    • Argon2 : algorithme issu de la Password Hashing Competition, conçu pour résister aux attaques par GPU/ASIC et être memory‑hard. Wikipédia+1
    • bcrypt : fonction éprouvée depuis longtemps, largement supportée dans de nombreux frameworks. Wikipédia+1
    • scrypt : également memory‑hard, bon compromis entre coût CPU et mémoire. devtooleasy.com+1
    • PBKDF2 : fonction plus ancienne, très supportée, mais moins résistante aux attaques modernes hardware. Wikipédia+1
Tableau de comparaison
Algorithme
Facilité d’implémentation
Taille du hash / sortie typique
Utilisation du sel
Résistance matérielle
Remarques
Argon2
Moyenne‑élevée : nécessite configuration mémoire/itérations
Variable, typiquement ~256 bits ou plus Frontiers+1
Oui (sel aléatoire fortement recommandé)
Très haute (memory‑hard) devtooleasy.com
Algorithme moderne, paramétrable
bcrypt
Élevée : très bien supporté dans de nombreux langages
~184 bits (≈23 octets) selon spécifications Frontiers
Oui, intégré
Moyenne‑haute (mais mémoire limitée) guptadeepak.com
Très bon choix pour compatibilité / simplicité
scrypt
Moyenne : bonne implémentation mais paramétrage plus fin
Configurable, typiquement ~256 bits Frontiers
Oui
Haute (memory‑hard) devtooleasy.com
Bon compromis, mais moins répandu que bcrypt
PBKDF2
Très facile : largement supporté
Sortie variable selon hachage sous‑jacente Wikipédia
Oui
Moins bonne face aux GPU/ASIC Security Boulevard
Utilisable surtout si compatibilité / conformité requise

Critères considérés
    • Facilité d’implémentation : disponibilité des bibliothèques & simplicité d’usage
    • Taille du hash : longueur de sortie et capacité à stocker côté base de données
    • Utilisation du sel : présence d’un salt unique pour chaque mot de passe
    • Résistance matérielle : capacité à resister aux attaques par matériel spécialisé (GPU, ASIC)
    • Remarques : particularités, compatibilité, limites
Justification du choix final
Pour notre projet (application web de jeu, base de données utilisateurs, besoin raisonnable en sécurité), voici mon choix : Argon2.
Pourquoi Argon2 ?
    • Il offre la meilleure résistance aux attaques modernes, notamment via sa nature memory‑hard, ce qui le rend plus résistant aux attaques par GPU/ASIC. authgear.com+1
    • Même si l’implémentation est un peu plus complexe que bcrypt, il existe de très bonnes bibliothèques (ex : Password4j) qui le prennent en charge. password4j.com
    • Pour un jeu web, où la confidentialité des comptes joueurs n’est pas d’un niveau ultra‑sensible (pas de données bancaires), mais où une fuite de mots de passe aurait un impact sur l’expérience, mieux vaut adopter une solution plus robuste que le minimum.
    • Le coût en ressources (CPU/mémoire) est acceptable puisqu’on ne s’attend pas à des millions de logins simultanés par seconde dans un jeu indie.





Schéma d’architecture

























Conception 
Charte graphique
Typographie
Police principale (titres et menus) : Montserrat – moderne et lisible, idéale pour les interfaces web et mobiles.
Police secondaire (texte courant, descriptions) : Roboto – simple et claire pour la lecture prolongée.
Variantes :
	Titres : Bold, 24-36 px
	Sous-titres : Medium, 18-24 px
	Texte courant : Regular, 14-16 px
	Consignes : Limiter le nombre de polices à 2 pour garder une cohérence 	visuelle.
Couleurs principales
Rôle
Couleur hex
Exemple d’usage
Couleur principale
#4CAF50
Boutons, titres principaux, accents
Couleur secondaire
#FF9800
Boutons secondaires, hover, notifications
Contour de la page 
#424242
La barre sur le coté gauche de la page
Couleur de texte
#212121
Texte principal
Couleur de texte secondaire
#757575
Sous-titres, légendes
      
      Consignes :
        ◦ Conserver un contraste suffisant pour l’accessibilité.
        ◦ Utiliser les couleurs secondaires pour les éléments interactifs ou ponctuels.
Logo
    • Format : SVG pour les interfaces web, PNG pour les supports imprimés.
    • Couleurs : Utiliser les couleurs principales pour assurer une identité cohérente.
    • Versions :
        ◦ Version pleine couleur pour les pages principales et promotions.
        ◦ Version monochrome (blanc/noir) pour les fonds colorés ou impressions.
    • Consignes :
        ◦ Respecter les marges autour du logo pour ne pas le surcharger.
        ◦ Ne pas déformer le logo (proportions à conserver).








Maquettes
PC 
Home :






Combat :











Mobile
Home :












