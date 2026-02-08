package org.example;

// This class simulates the flight control system, managing airplane takeoff and landing requests through a control tower mediator.

import java.util.Scanner;

public class Exercise {

    // Do not modify the run method. It demonstrates the functionality of the Flight Control System using the Mediator design pattern.
    public void run() {

        Scanner sc = new Scanner(System.in);

        ControlTower controlTower = new ControlTower();

        String airplaneId1 = sc.nextLine();
        String airplaneId2 = sc.nextLine();
        String airplaneId3 = sc.nextLine();
        String airplaneId4 = sc.nextLine();

        // TODO: Instantiate an airplane with the first provided ID
        Airplane airplane1 = new Airplane(airplaneId1);
        Airplane airplane2 = new Airplane(airplaneId2);
        Airplane airplane3 = new Airplane(airplaneId3);
        Airplane airplane4 = new Airplane(airplaneId4);

        // TODO: Instantiate an airplane with the second provided ID


        // TODO: Instantiate an airplane with the third provided ID


        // TODO: Instantiate an airplane with the fourth provided ID

        controlTower.registerAirplane(airplane1);
        controlTower.registerAirplane(airplane2);
        controlTower.registerAirplane(airplane3);
        controlTower.registerAirplane(airplane4);

        // TODO: Register the first airplane with the control tower


        // TODO: Register the second airplane with the control tower


        // TODO: Register the third airplane with the control tower


        // TODO: Register the fourth airplane with the control tower


        airplane1.requestTakeoff();
        airplane2.requestTakeoff();
        airplane3.requestTakeoff();
        airplane4.requestTakeoff();

        // TODO: Mark the first airplane as having completed takeoff and free a runway
        airplane1.completeTakeoff();

        // TODO: Mark the second airplane as having completed takeoff and free a runway
        airplane2.completeTakeoff();

        airplane3.requestTakeoff();
        airplane4.requestTakeoff();

        // TODO: Mark the third airplane as having completed takeoff and free a runway
        airplane3.completeTakeoff();

        // TODO: Mark the fourth airplane as having completed takeoff and free a runway
        airplane4.completeTakeoff();

        airplane1.requestLanding();
        airplane2.requestLanding();

        // TODO: Mark the first airplane as having completed landing and free a runway
        airplane1.completeLanding();
        airplane2.completeLanding();

        // TODO: Mark the second airplane as having completed landing and free a runway


        airplane3.requestLanding();
        airplane4.requestLanding();

        // TODO: Mark the third airplane as having completed landing and free a runway

        airplane3.completeLanding();
        airplane4.completeLanding();
        // TODO: Mark the fourth airplane as having completed landing and free a runway



        sc.close();
    }
}