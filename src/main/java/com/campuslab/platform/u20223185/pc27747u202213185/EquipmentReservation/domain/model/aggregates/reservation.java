package com.campuslab.platform.u20223185.pc27747u202213185.EquipmentReservation.domain.model.aggregates;

import com.campuslab.platform.u20223185.pc27747u202213185.EquipmentReservation.domain.model.valueobjects.equipmentBatch;
import com.campuslab.platform.u20223185.pc27747u202213185.EquipmentReservation.domain.model.valueobjects.laboratoryId;
import com.campuslab.platform.u20223185.pc27747u202213185.EquipmentReservation.domain.model.valueobjects.reservationPeriod;
import org.springdoc.core.converters.models.MonetaryAmount;

import java.time.Instant;

public class reservation {
    private final Long id;
    private final reservationPeriod reservationPeriod;
    private final laboratoryId laboratoryId;
    private final equipmentBatch equipmentBatch;

}
