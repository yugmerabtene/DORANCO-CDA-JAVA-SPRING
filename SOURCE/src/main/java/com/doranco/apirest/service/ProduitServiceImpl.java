package com.doranco.apirest.service;

import com.doranco.apirest.model.Produit;
import com.doranco.apirest.repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ProduitServiceImpl implements ProduitService {
    private final ProduitRepository produitRepository;    //Injection de notre repository
    @Override
    public Produit creer(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> lire() {
        return produitRepository.findAll();
    }

    @Override
    public Produit modifier(Long id, Produit produit) {
        return produitRepository.findById(id)
                .map(p->
                {
                    p.
                    return produitRepository.save(p)
                });
    }

    @Override
    public String supprimer(Long id) {
        return null;
    }
}
