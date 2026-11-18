package com.campuslab.platform.u20223185.pc27747u202213185.EquipmentReservation.domain.model.valueobjects;
import java.util.UUID;
public record laboratoryId(UUID value) {
    public laboratoryId {
        if (value == null) {
            throw new IllegalArgumentException("Laboratory ID cannot be null");
        }
    }
}
