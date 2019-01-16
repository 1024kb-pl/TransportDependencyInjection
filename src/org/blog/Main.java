package org.blog;

import org.blog.transport.TransportTypes;

public class Main {

    public static void main(String[] args) {
        DeliveryPackage deliveryPackage = new DeliveryPackage("Książka", "Effective Java");

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.sendPackage(deliveryPackage, TransportTypes.AIRPLANE);
        deliveryService.sendPackage(deliveryPackage, TransportTypes.SHIP);
        deliveryService.sendPackage(deliveryPackage, TransportTypes.TRUCK);
    }
}
