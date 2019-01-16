package org.blog;

import org.blog.transport.AirplaneTransport;
import org.blog.transport.ShipTransport;
import org.blog.transport.TruckTransport;

public class DeliveryService {
    private final AirplaneTransport airplaneTransport = new AirplaneTransport();
    private final ShipTransport shipTransport = new ShipTransport();
    private final TruckTransport truckTransport = new TruckTransport();

    public void sendPackage(DeliveryPackage deliveryPackage, String transportType) {
        switch (transportType) {
            case "airplane":
                airplaneTransport.delivery(deliveryPackage);
                break;

            case "ship":
                shipTransport.delivery(deliveryPackage);
                break;

            case "truck":
                truckTransport.delivery(deliveryPackage);
                break;

            default:
                System.out.println("Unrecognized transport type!");
        }
    }
}
