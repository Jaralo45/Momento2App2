package com.example.ftienda.models;

import java.io.Serializable;

public class ComputerModel implements Serializable {

    private String id;
    private String codigo;
    private String brand;
    private String imageUrl;
    private String Description;
    private String Serial;
    private boolean active;

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        this.Serial = serial;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
