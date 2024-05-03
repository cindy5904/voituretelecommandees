package org.example.Factory;

import lombok.Builder;
import org.example.Entity.Voiture;

public class DragsterFactory extends VoitureFactory{

    @Override
    public Voiture createVoiture(Voiture builder) {
        return Voiture.builder().build();
    }
}
