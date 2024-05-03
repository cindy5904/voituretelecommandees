package org.example.Observable;

import org.example.Entity.Voiture;

public interface Observer<T> {
    void update(T element);
}
