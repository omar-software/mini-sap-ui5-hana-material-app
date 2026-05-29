package com.omar.saphana.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "materials")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Materialnummer wie in SAP, z.B. MAT-1001
    @NotBlank(message = "Materialnummer darf nicht leer sein")
    @Column(nullable = false, unique = true)
    private String materialNumber;

    // Materialkurztext / Bezeichnung
    @NotBlank(message = "Materialname darf nicht leer sein")
    @Column(nullable = false)
    private String name;

    // Mengeneinheit, z.B. STK
    @NotBlank(message = "Einheit darf nicht leer sein")
    private String unit;

    // Aktueller Lagerbestand
    @Min(value = 0, message = "Bestand darf nicht negativ sein")
    private Integer currentStock;

    // Mindestbestand fuer einfache Bestandswarnung
    @Min(value = 0, message = "Mindestbestand darf nicht negativ sein")
    private Integer minimumStock;

    public Material() {
    }

    public Material(String materialNumber, String name, String unit, Integer currentStock, Integer minimumStock) {
        this.materialNumber = materialNumber;
        this.name = name;
        this.unit = unit;
        this.currentStock = currentStock;
        this.minimumStock = minimumStock;
    }

    public Long getId() {
        return id;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(Integer currentStock) {
        this.currentStock = currentStock;
    }

    public Integer getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(Integer minimumStock) {
        this.minimumStock = minimumStock;
    }
}
