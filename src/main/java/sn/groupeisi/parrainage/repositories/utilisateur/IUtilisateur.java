package sn.groupeisi.parrainage.repositories.utilisateur;

import sn.groupeisi.parrainage.entities.Utilisateur;

public interface IUtilisateur {
    public Utilisateur seConnecter(String login, String password);
}
