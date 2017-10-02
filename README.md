#Checkpoint1

Point 1 : Application Android
Crée un nouveau projet que tu appelleras Checkpoint1<ton pseudo Github> (Ex: Checkpoint1bastienwcs).
Crée une première classe MainActivity.java et son layout vide associé activity_main.xml.

Dans le layout activity_main.java, crée 4 champs textes à remplir, alignés verticalement, qui demanderont : le nom, le prénom, l'école et le langage étudié.
Ajoute en-dessous un bouton "Envoyer".

Ajoute ensuite un modèle StudentModel.java dans lequel tu déclares la classe StudentModel permettant de stocker le nom, le prénom, l'école et le langage étudié par un élève.
La classe doit contenir des attributs privés, un constructeur avec des arguments permettant d'initialiser les attributs, et des méthodes Getter permettant d'accéder aux attributs. Ajoute des commentaires pour expliquer où est le constructeur, où sont les attributs et où sont les Getters. Pour le commentaire du constructeur, détaille sa portée et ses arguments. 

Crée une nouvelle activity StudentActivity.java et son layout vide associé activity_student.xml.

Dans MainActivity.java, dans le onCreate, ajoute une action au clic du bouton "Envoyer" pour récupérer les valeurs des champs renseignés par l'utilisateur :
- si au moins un des champs est vide, affiche un Toast "Merci de renseigner tous les champs du formulaire.".
- si tous les champs sont renseignés, instancie un objet de StudentModel avec les valeurs des champs. 
Ensuite l'utilisateur sera redirigé vers StudentActivity.java, en envoyant les informations renseignées dans les champs (en utilisant l'objet instancié de StudentModel si tu sais le faire, ou en envoyant chaque valeur séparément sinon).

Dans activity_student.xml, ajoute 4 textes vides :
- un texte de taille 18sp centré horizontalement, qui contiendra l'école
- deux textes alignés horizontalement, qui contiendront les nom et prénom
- un texte de couleur rouge, qui contiendra le langage étudié

Dans StudentActivity.java, dans le onCreate, récupère les données envoyées par ActivityMain.java et rempli les textes correspondants de activity_student.xml.

Une fois terminé, crée un repository sur ton compte Github et envoie ta solution : attention à avoir modifié le .gitignore de ton projet par la bonne version !

Vérifie bien que tout est présent sur Github ensuite !

Requis :
- tous les textes doivent être renseignés dans Strings.xml.
- les champs éditable de activity_main.xml ne doivent pas contenir de texte par défaut.
- n’utilise pas de variables globales.
- respecte les conventions de nommage, indente correctement ton code et fais attention aux majuscules et minuscules pour les noms de variables, méthodes et classes.
