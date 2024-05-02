package org.example.Factory;

import org.example.Entity.Voiture;

public abstract class FormuleUnFactory extends VoitureFactory {
    public Voiture createFormuleUn(){
        return Voiture.builder().build();
    }

}
