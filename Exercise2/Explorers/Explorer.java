package Explorers;

import Planets.Mars;
import Planets.Mercury;
import Planets.Neptune;
import Planets.Uranus;
import Planets.Earth;
import Planets.Jupiter;
import Planets.Venus;
import Planets.Saturn;
import Planets.Planet;



public interface Explorer {
    
    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Neptune neptune);

    void visit(Earth earth);

    void visit(Jupiter jupiter);

    void visit(Uranus uranus);

    void visit(Venus venus);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}