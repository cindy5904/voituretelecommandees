package org.example.Factory;

import org.example.Entity.Voiture;

public abstract class ElectriqueFactory extends VoitureFactory {

    public Voiture createElectique() {
        return Voiture.builder().build();
    }
}
