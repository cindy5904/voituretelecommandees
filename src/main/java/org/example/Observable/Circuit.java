package org.example.Observable;

import lombok.Setter;
import org.example.Entity.Voiture;

import java.util.ArrayList;
import java.util.List;
@Setter
public class Circuit implements Subject{
    private List<Observer> observers = new ArrayList<>();
    @Setter
    private int currentPosition;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o->o.update(Voiture.builder().build()));
    }
}
