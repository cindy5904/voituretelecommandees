package org.example.Observable;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    public void notifyObservers();
}
