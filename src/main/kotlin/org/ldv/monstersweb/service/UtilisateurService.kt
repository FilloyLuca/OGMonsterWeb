import org.ldv.monstersweb.model.dao.UtilisateurDAO
import org.ldv.monstersweb.model.entity.Utilisateur
import org.springframework.stereotype.Service

@Service
class UtilisateurService(
    private val utilisateurDAO: UtilisateurDAO
) {
    fun findByEmail(email: String): Utilisateur? {
        return utilisateurDAO.findByEmail(email)
    }
}
