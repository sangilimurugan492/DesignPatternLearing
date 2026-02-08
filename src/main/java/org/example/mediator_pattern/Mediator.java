package org.example.mediator_pattern;

public interface Mediator {
    void registerAirplane(Airplane airplane);
    void handleTakeoffRequest(Airplane airplane);
    void handleLandingRequest(Airplane airplane);
    void notifyTakeoffComplete(Airplane airplane);
    void notifyLandingComplete(Airplane airplane);
}
