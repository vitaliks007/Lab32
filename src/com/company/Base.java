package com.company;

public class Base {
    private int type, color, health;

    public Base(int type, int color, int health) {
        this.type = type;
        this.color = color;
        this.health = health;
    }

    public int getType() {
        return type;
    }

    public int getColor() {
        return color;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Base{" +
                "type=" + type +
                ", color=" + color +
                ", health=" + health +
                '}';
    }
}
