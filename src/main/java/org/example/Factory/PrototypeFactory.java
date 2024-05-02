package org.example.Factory;

import org.example.Entity.Voiture;

public abstract class PrototypeFactory extends VoitureFactory{
    public Voiture createPrototype() {
        return Voiture.builder().build();
    }

}
