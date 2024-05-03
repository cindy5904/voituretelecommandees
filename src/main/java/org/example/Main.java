package org.example;

import org.example.Entity.Dragster;
import org.example.Entity.Electrique;
import org.example.Entity.Voiture;
import org.example.Factory.DragsterFactory;
import org.example.Factory.VoitureFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VoitureFactory voitureFactory = new DragsterFactory().createVoiture();

    } }