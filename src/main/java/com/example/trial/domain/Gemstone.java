package com.example.trial.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "gemstone")
public class Gemstone {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Size(max = 255)
    @Column(name = "type", nullable = false)
    private String type;

    @Size(max = 255)
    @Column(name = "color", nullable = false)
    private String color;

    @Size(max = 255)
    @Column(name = "shape", nullable = false)
    private String shape;

    @Column(name = "length")
    private float length;

    @Column(name = "width")
    private float width;

    @Column(name = "cabochan")
    private boolean cabochan;

    @Column(name = "qty")
    private int qty;

    public Gemstone(int id, String type, String color, String shape, float length, float width, boolean cabochan, int qty) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.shape = shape;
        this.length = length;
        this.width = width;
        this.cabochan = cabochan;
        this.qty = qty;
    }

    public Gemstone() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setCabochan(boolean cabochan) {
        this.cabochan = cabochan;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getShape() {
        return shape;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public boolean isCabochan() {
        return cabochan;
    }

    public int getQty() {
        return qty;
    }
}
