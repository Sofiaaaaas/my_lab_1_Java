package ua.lviv.iot.part1.lab1;
import lombok.Getter;
import lombok.Setter;

@Setter
//@NoArgsConstructor
@Getter
//@AllArgsConstructor
public class DeskLamp {
    private boolean isOn = false;
    private int brightness = 5;
    private String color = "white";
    private String producer = "Unknown";
    public DeskLamp(){}
    public DeskLamp(boolean isOn,int brightness,String color,String producer){
        this.isOn=isOn;
        this.brightness=brightness;
        this.color=color;
        this.producer=producer;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void setBrightness(int brightness) {
        if (brightness < 1 || brightness > 10) {
            throw new IllegalArgumentException("Brightness value should be between 1 and 10");
        }
        this.brightness = brightness;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static DeskLamp getInstance() {
        if (instance == null) {
            instance = new DeskLamp();
        }
        return instance;
    }

    private static DeskLamp instance;
    @Override
    public String toString()
    {
        return "DeskLamp{ "+
                "isOn="+ isOn+
                ", brightness=" + brightness +'\''+
                ", color=" + color +'\'' +
                ",producer="+producer +
                '}';
    }

    public static void main(String[] args) {
        DeskLamp lamps1 = new DeskLamp();
        DeskLamp lamps2 = new DeskLamp(true, 8, "red", "Producer1");
        DeskLamp lamps3 = DeskLamp.getInstance();
        DeskLamp lamps4 = DeskLamp.getInstance();
        DeskLamp[] lamps = {lamps1,lamps2,lamps3,lamps4};
        for (DeskLamp lamp : lamps) {
            System.out.println(lamp);
        }
    }

}

