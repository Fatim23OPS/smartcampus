/**
 * Service de validation des informations de connexion.
 */
public class LoginService {

    /**
     * Vérifie que les deux champs sont renseignés.
     */
    public boolean authentifier(String identifiant, String motDePasse) {
        return identifiant != null
            && !identifiant.isBlank()
            && motDePasse != null
            && !motDePasse.isBlank();
    }
}
