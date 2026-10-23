public class LoginService {

    public boolean authentifier(String identifiant, String motDePasse) {
        return identifiant != null
            && !identifiant.isBlank()
            && motDePasse != null
            && !motDePasse.isBlank();
    }
}
