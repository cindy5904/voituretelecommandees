package org.example.Factory;

import org.example.Entity.Voiture;

public abstract class VoitureFactory {
    public abstract Voiture createVoiture(Voiture builder);
}
