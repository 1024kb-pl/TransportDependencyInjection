package org.blog;

import org.blog.transport.AirplaneTransport;

public class Main {

    public static void main(String[] args) {
        DeliveryPackage deliveryPackage = new DeliveryPackage("Książka", "Effective Java");

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.sendPackage(deliveryPackage, "airplane");
        deliveryService.sendPackage(deliveryPackage, "ship");
        deliveryService.sendPackage(deliveryPackage, "truck");
        deliveryService.sendPackage(deliveryPackage, "unknown");
    }
}
