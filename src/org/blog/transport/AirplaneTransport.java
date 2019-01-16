package org.blog.transport;

import org.blog.DeliveryPackage;

public class AirplaneTransport implements TransportService {
    @Override
    public void delivery(DeliveryPackage deliveryPackage) {
        System.out.println("Airplane delivered package: " + deliveryPackage);
    }
}
