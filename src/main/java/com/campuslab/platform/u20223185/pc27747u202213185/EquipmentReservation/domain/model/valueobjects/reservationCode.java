package com.campuslab.platform.u20223185.pc27747u202213185.EquipmentReservation.domain.model.valueobjects;

public record reservationCode(String reservationCode) {
    public reservationCode {
        if (reservationCode == null || reservationCode.isEmpty()) {
            throw new IllegalArgumentException("Reservation code cannot be null or empty");
        }
    }
}
