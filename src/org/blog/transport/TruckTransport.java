package org.blog.transport;

import org.blog.DeliveryPackage;

public class TruckTransport implements TransportService {
    @Override
    public void delivery(DeliveryPackage deliveryPackage) {
        System.out.println("Truck delivered package: " + deliveryPackage);
    }
}
