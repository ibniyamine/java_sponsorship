package sn.groupeisi.parrainage.entities;

public class Utilisateur {
    private int id;
    private String nom, prenom, login, password;
    private int actived;
    private Role profil;

    public Utilisateur() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getActived() {
        return actived;
    }

    public void setActived(int actived) {
        this.actived = actived;
    }

    public Role getProfil() {
        return profil;
    }

    public void setProfil(Role profil) {
        this.profil = profil;
    }
}
