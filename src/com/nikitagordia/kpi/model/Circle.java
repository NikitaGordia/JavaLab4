package com.nikitagordia.kpi.model;

public class Circle {

    private float x, y, r;
    private String tag;

    public Circle(String tag, float x, float y, float r) {
        this.tag = tag;
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Circle" + tag + " (" + x + "," + y + "," + r + ")";
    }
}
