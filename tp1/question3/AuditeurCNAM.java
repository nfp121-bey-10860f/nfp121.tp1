package question3;
import java.text.Normalizer;
public class AuditeurCNAM {
    /** l'attribut nom de chaque auditeur. */
    private String nom;
    /** l'attribut prenom de chaque auditeur. */
    private String prenom;
    /** l'attribut matricule de chaque auditeur. */
    private String matricule;

    /**
     * "Création", le constructeur d'un auditeur avec son nom, son prénom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son prénom
     * @param matricule
     *            sur la carte d'inscription, près de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    /**
     * le login au Cnam : 6 premières lettres du nom suivies de la première
     * lettre du prénom séparées de '_' . le login retourné est en minuscules,
     * le trait d'union, ou spéciaux sont remplacés par des
     * '_' pas de caractères accentués pour le login voir les classes
     * prédéfines, java.lang.String : les méthodes replaceAll, toLowerCase et
     * substring java.lang.Math : la méthode min
     * 
     * @return le login du Cnam simplifié, sans les adaptations dues aux
     *         homonymes...
     */
    public String login() {
        String n = this.nom;
        String p = this.prenom;
        
        //Remove accents from the accented characters in the nom and prenom
        n = Normalizer.normalize(n, Normalizer.Form.NFD);
        p = Normalizer.normalize(p, Normalizer.Form.NFD);
        n = n.replaceAll("[^\\p{ASCII}]", "");
        p = p.replaceAll("[^\\p{ASCII}]", "");
        
        //take only letters and replace special characters with _
        String newNom = n.replaceAll("[^a-zA-Z]", "_");
        String newPrenom = p.replaceAll("[^a-zA-Z]", "_");
        
        //concatenate nom with _ and prenom and return it lower case
        String result;
        if(newNom.length() <6)
            result = newNom + "_" + newPrenom.substring(0,1);
        else
            result = newNom.substring(0,6) + "_" + newPrenom.substring(0,1);
            
        return result.toLowerCase();
    }

    /**
     * Lecture du nom de l'auditeur.
     * 
     * @return son nom
     */
    public String nom() {
        return this.nom;
    }

    /**
     * Lecture du prénom de l'auditeur.
     * 
     * @return son prénom
     */
    public String prenom() {
        return this.prenom;
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    public String matricule() {
        return this.matricule;
    }

    /**
     * méthode toString ( méthode redéfinie de la classe Object).
     * 
     * @return la concaténation du nom, du prénom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }

}
