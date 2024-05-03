package org.example.Observable;

public interface Subject <T> {
    void registerObserver(Observer<T> observer);
    void removeObserver(Observer<T> observer);

    public void notifyObservers(T element);
}
