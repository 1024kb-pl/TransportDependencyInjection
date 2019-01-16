package org.blog.transport;

import org.blog.DeliveryPackage;

public class ShipTransport implements TransportService {
    @Override
    public void delivery(DeliveryPackage deliveryPackage) {
        System.out.println("Ship delivered package: " + deliveryPackage);
    }
}
