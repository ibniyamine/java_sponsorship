package sn.groupeisi.parrainage.repositories.utilisateur;

import sn.groupeisi.parrainage.DBConnection;
import sn.groupeisi.parrainage.entities.Role;
import sn.groupeisi.parrainage.entities.Utilisateur;
import sn.groupeisi.parrainage.repositories.role.IRole;
import sn.groupeisi.parrainage.repositories.role.RoleImpl;

import java.sql.ResultSet;

public class UtilisateurImpl implements IUtilisateur{
    private DBConnection db = new DBConnection();
    private ResultSet rs;
    @Override
    public Utilisateur seConnecter(String login, String password) {
        String sql = "SELECT * FROM user WHERE login = ? AND password = ?";
        Utilisateur user = null;
        try {
            //Préparation ou initialisation de la requete
            db.initPrepar(sql);
            //Passage de valeurs
            db.getPstm().setString(1, login);
            db.getPstm().setString(2, password);
            //Exécution de la requete
            rs = db.executeSelect();
            if(rs.next()){
                user = new Utilisateur();
                user.setId(rs.getInt("id"));
                user.setNom(rs.getString("nom"));
                user.setPrenom(rs.getString("prenom"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString(5));
                user.setActived(rs.getInt("actived"));
                IRole iRole = new RoleImpl();
                int idRole = rs.getInt("profil");
                Role role = iRole.getRoleById(idRole);
                user.setProfil(role);
            }
            db.closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
