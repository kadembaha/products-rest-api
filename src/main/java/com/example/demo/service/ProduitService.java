package com.example.demo.service;

import com.example.demo.modele.Produit;

import java.util.List;

public interface ProduitService {

    Produit creer(Produit produit);

    List<Produit> lire();

    Produit modifier(Long id , Produit produit);

    String supprimer(Long id);



}
