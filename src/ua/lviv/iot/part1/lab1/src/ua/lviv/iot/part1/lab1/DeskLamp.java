package ua.lviv.iot.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class DeskLamp extends Light{
    private boolean isOn ;
    private int brightness ;
    private String color ;
    public DeskLamp (boolean isOn,int brightness,String color,String producer, double workTime){
        super(producer,workTime);
        this.isOn=isOn;
        this.brightness=brightness;
        this.color=color;
    }


    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }

    public void setBrightness(int brightness) {
        if (brightness < 1 || brightness > 10) {
            throw new IllegalArgumentException("Brightness value should be between 1 and 10");
        }
        this.brightness = brightness;
    }
    public String toString() {
        return "DeskLamp " + "isOn='" + isOn + '\'' + ", brightness=" + brightness + ", color=" + color;
    }
}