package org.example.Entity;

import lombok.Builder;
import lombok.Data;
import lombok.Setter;
import org.example.Observable.Observer;
import org.example.Observable.Subject;

import java.util.ArrayList;
import java.util.List;

@Builder
@Setter
@Data
public abstract class Voiture implements Subject<Voiture> {
    private int round = 0, position =0;

    private List<Observer<Voiture>> observers;
    @Setter
    private int currentPosition;

    public abstract void incrementePosition();



    @Override
    public void registerObserver(Observer<Voiture> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<Voiture> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Voiture element) {
        observers.forEach(o->o.update(this));
    }
}
