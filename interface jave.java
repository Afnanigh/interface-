package BookingFoodTrucksSystem;

 import Booking.Booking;
import Vehicles.Vehicle;

public interface FoodTruckBookingAgency {
    
    public static final int MAX_BOOKINGS = 100;

    public abstract void menuAllVehicles();

    public abstract void menuAllBookings();

    public abstract boolean isVehicleAvailable(int id);

    public abstract boolean newBooking();

    public abstract void cancelBooking();

    public abstract Vehicle getVehicleById(int id);

    public abstract Booking getBookingById(int id);

    public abstract void showBookingInfo();

    public abstract void showVehicleInfo();
    public abstract void WriteFile();

}


