package ua.lviv.iot.part1.lab1;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class Candle extends Light {
    private boolean isOn = false;
    private int brightness = 3;
    private String color = "white";



    public Candle(boolean isOn, int brightness, String color, String producer, double workTime) {
        super(producer, workTime);
        this.isOn = isOn;
        this.brightness = brightness;
        this.color = color;
    }
    public String toString() {
        return "Flashlight" + "isOn'" + isOn + '\'' + ", brightness=" + brightness + ", color=" + color;
    }
    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }
}