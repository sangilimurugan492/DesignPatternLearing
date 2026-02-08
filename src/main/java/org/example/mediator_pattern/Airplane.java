package org.example.mediator_pattern;

public class Airplane {
    private String id;
    private Mediator mediator;

    public Airplane(String id) {
        this.id = id;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void requestTakeoff() {
        System.out.println("Airplane " + id + " requesting takeoff");
        mediator.handleTakeoffRequest(this);
        // TODO: Notify the mediator to handle the takeoff request for this airplane

    }

    public void requestLanding() {
        System.out.println("Airplane " + id + " requesting landing");
        mediator.handleLandingRequest(this);
        // TODO: Notify the mediator to handle the landing request for this airplane

    }

    public void completeTakeoff() {
        System.out.println("Airplane " + id + " has taken off");
        mediator.notifyTakeoffComplete(this);
    }

    public void completeLanding() {
        System.out.println("Airplane " + id + " has landed");
        mediator.notifyLandingComplete(this);
    }

    public void receiveNotification(String message) {
        System.out.println("Airplane " + id + ": " + message);
    }

    public String getId() {
        return id;
    }
}