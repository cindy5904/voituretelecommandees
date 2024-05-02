package org.example.Entity;

import lombok.Builder;
import lombok.Data;
import lombok.Setter;

@Builder
@Setter
@Data
public abstract class Voiture {
    private int round = 0, position =0;
}
