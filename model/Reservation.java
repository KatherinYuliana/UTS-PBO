package model;

import model.Enum.ReservationStatus;
import model.Enum.RoomStatus;

public class Reservation {
    private int idReservation;
    private int stay_day;
    private ReservationStatus status;
    private Room room;

    public Reservation(int idReservation, int stay_day, ReservationStatus status) {
        this.idReservation = idReservation;
        this.stay_day = stay_day;
        this.status = status;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public int getStay_day() {
        return stay_day;
    }

    public void setStay_day(int stay_day) {
        this.stay_day = stay_day;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public boolean bookRoom() {
        if (room.getStatus() == RoomStatus.EMPTY) {
            room.setStatus(RoomStatus.BOOKED);
            return true;
        }
        return false;
    }

    public void cancelBooking() {
        if (room.getStatus() == RoomStatus.BOOKED) {
            room.setStatus(RoomStatus.EMPTY);
            status = ReservationStatus.CANCELED;
        }
    }

    public double calculateAmount() {
        return stay_day * room.getPrice();
    }
}
