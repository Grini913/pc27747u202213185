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
    public reservation(Long id, reservationCode reservationCode, laboratoryId laboratoryId, equipmentBatch equipmentBatch, reservationPeriod reservationPeriod, status status) {
        this.id = id;
        this.reservationCode = reservationCode;
        this.laboratoryId = laboratoryId;
        this.equipmentBatch = equipmentBatch;
        this.reservationPeriod = reservationPeriod;
        this.status = status;
    }
    public Long getId() {
        return id;
    }
    public reservationCode getReservationCode() {
        return reservationCode;
    }
    public laboratoryId getLaboratoryId() {
        return laboratoryId;
    }
    public equipmentBatch getEquipmentBatch() {
        return equipmentBatch;
    }
    public reservationPeriod getReservationPeriod() {
        return reservationPeriod;
    }
    public status getStatus() {
        return status;
    }
}
