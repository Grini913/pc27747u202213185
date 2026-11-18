package com.campuslab.platform.u20223185.pc27747u202213185.EquipmentReservation.domain.model.valueobjects;

import java.time.LocalDate;

public record reservationPeriod(LocalDate startDate, LocalDate endDate) {
    public reservationPeriod {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Start date and end date cannot be null");
        }
        if (endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("End date cannot be before start date");
        }
    }

}


