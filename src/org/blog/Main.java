package org.blog;

import org.blog.transport.AirplaneTransport;

public class Main {

    public static void main(String[] args) {
        DeliveryPackage deliveryPackage = new DeliveryPackage("Książka", "Effective Java");

        DeliveryService deliveryService = new DeliveryService(new AirplaneTransport());
        deliveryService.sendPackage(deliveryPackage);
    }
}
