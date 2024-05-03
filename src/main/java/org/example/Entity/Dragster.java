package org.example.Entity;

import lombok.Builder;

import java.util.Timer;
import java.util.TimerTask;

@Builder
public class Dragster extends Voiture{
    Timer timer;
    TimerTask task= new TimerTask() {
            @Override
            public void run() {
                int positionActuelle = getPosition();
                int nouvellePosition = positionActuelle + 2;
                setPosition(nouvellePosition);
            }
        };



    @Override
    public void incrementePosition() {
        timer.schedule(task, 2000);
        notifyObservers(this);

    }
}
