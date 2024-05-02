package org.example.Observable;

import org.example.Entity.Voiture;

public interface Observer {
    void update(Voiture voiture);
}
