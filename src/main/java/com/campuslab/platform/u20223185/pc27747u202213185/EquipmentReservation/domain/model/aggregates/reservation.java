package com.campuslab.platform.u20223185.pc27747u202213185.EquipmentReservation.domain.model.aggregates;

import com.campuslab.platform.u20223185.pc27747u202213185.EquipmentReservation.domain.model.enums.status;
import com.campuslab.platform.u20223185.pc27747u202213185.EquipmentReservation.domain.model.valueobjects.equipmentBatch;
import com.campuslab.platform.u20223185.pc27747u202213185.EquipmentReservation.domain.model.valueobjects.laboratoryId;
import com.campuslab.platform.u20223185.pc27747u202213185.EquipmentReservation.domain.model.valueobjects.reservationCode;
import com.campuslab.platform.u20223185.pc27747u202213185.EquipmentReservation.domain.model.valueobjects.reservationPeriod;

public class reservation {
    private Long id;
    private reservationCode reservationCode;
    private laboratoryId laboratoryId;
    private equipmentBatch equipmentBatch;
    private reservationPeriod reservationPeriod;
    private status status;

}
