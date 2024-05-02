package org.example.Factory;

import org.example.Entity.Voiture;

public abstract class DragsterFactory extends VoitureFactory{
    public Voiture createDragster() {
        return Voiture.builder().build();
    }
}
