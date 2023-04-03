package ua.lviv.iot.part1.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LightManager {
    List<Light> lights = new ArrayList<>();

    public void addLight(final Light light) {
        lights.add(light);
    }

    public List<Light> findAllWithWorkTimeGraterThen(int minWorkTime) {
        return lights.stream()
                .filter(light -> light.getWorkTime() >= minWorkTime)
                .collect(Collectors.toList());

    }

    public List<Light> findAllWithProducer(String producer) {
        return lights.stream()
                .filter(light -> light.getProducer() == producer)
                .collect(Collectors.toList());

    }


    public static void main(String... args) {
        LightManager lightManager = new LightManager();

        lightManager.addLight(new DeskLamp(false, 5, "warm white", "Ukrane", 18));
        lightManager.addLight(new DeskLamp(false, 4, "white", "China", 6));
        lightManager.addLight(new Candle(false, 3, "warm white", "Germany", 4));
        lightManager.addLight(new Candle(false, 3, "warm white", "China", 2));
        lightManager.addLight(new Bulb(false, 8, "cold white", "USA", 12));
        lightManager.addLight(new Bulb(false, 6, "warm white", "China", 6));
        lightManager.addLight(new Flashlight(false, 6, "white", "USA", 3));
        lightManager.addLight(new Flashlight(false, 5, "cold white", "China", 1));

        System.out.println("Lights from Ukraine:");
        for (Light light : lightManager.findAllWithProducer("China")) {
            System.out.println(light);
        }

        System.out.println("\nLights with work time grater than 4");
        for (Light light : lightManager.findAllWithWorkTimeGraterThen(4)) {
            System.out.println(light);
        }

    }
}

