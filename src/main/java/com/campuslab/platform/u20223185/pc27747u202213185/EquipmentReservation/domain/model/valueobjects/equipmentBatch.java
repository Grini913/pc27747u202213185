package com.campuslab.platform.u20223185.pc27747u202213185.EquipmentReservation.domain.model.valueobjects;

public record equipmentBatch(Integer quantity, String unit) {
    public equipmentBatch {
        if (quantity == null || quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be a positive integer");
        }
        if (unit == null || unit.isEmpty()) {
            throw new IllegalArgumentException("Unit cannot be null or empty");
        }
    }

    public equipmentBatch addUnits(Integer additionalQuantity) {
        if (additionalQuantity == null || additionalQuantity > quantity) {
            throw new IllegalArgumentException("Additional quantity must be a positive integer");
        }
        return new equipmentBatch(this.quantity + additionalQuantity, this.unit);
    }
}