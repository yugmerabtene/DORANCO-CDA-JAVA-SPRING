package com.doranco.apirest.service;

public interface ProduitService {
    Produit creer(Produit produit);

    List<Produit> lire();

    Produit modifier(Long  id, Produit produit);

    String supprimer(Long id);

}
