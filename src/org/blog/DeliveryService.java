package org.blog;

import org.blog.transport.TransportService;

public class DeliveryService {
    private final TransportService transportService;

    public DeliveryService(TransportService transportService) {
        this.transportService = transportService;
    }

    public void sendPackage(DeliveryPackage deliveryPackage) {
        transportService.delivery(deliveryPackage);
    }
}
