package ua.lviv.iot.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public abstract class Light {
    private String producer;
    private double workTime;
    public Light (String producer,double workTime){
        this.producer=producer;
        this.workTime=workTime;
    }
    public String toString() {
        return "Light " + "producer='" + producer + '\'' + ", workTime=" + workTime;
    }
    public abstract void turnOn();

    public abstract void turnOff();

    public double getWorkTime() {
        return workTime;
    }

    public String getProducer() {
        return producer;
    }
}
