package org.example.Entity;

import lombok.Builder;
import lombok.Data;

import java.util.Timer;
import java.util.TimerTask;

@Data
@Builder
public class FormuleUn extends Voiture{
    Timer timer;
    TimerTask task;

    {
        new TimerTask() {
            @Override
            public void run() {
                int positionActuelle = getPosition();
                int nouvellePosition = positionActuelle + 2;
                setPosition(nouvellePosition);
            }
        };
    }


    @Override
    public void incrementePosition() {
        timer.schedule(task, 1000);
        notifyObservers(this);

    }
}
