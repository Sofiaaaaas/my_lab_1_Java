I created a class according to my option from the list
Using the lombok library, it implemented set and get methods, constructors with arguments, a constructor for soaking and an overridden method toString()
The written class should contain a public static method getInstance(), and a field static field instance whose value will be returned by the method getInstance
In the class, I also wrote the main method, in which I created an array of class objects using:
- the default designer
- a constructor that receives all parameters
- 2 objects obtained when the getInstance method is called
Create a DeskLamp class that will have the following fields:

isOn: boolean indicating whether the lamp is on (default false);
brightness: lamp brightness value (from 1 to 10, default is 5);
color: light color (default white).
producer: manufacturer of the lamp, default "Unknown"

The DeskLamp class must have the following public methods:
turnOn(): method that turns on the lamp;
turnOff(): method that turns off the lamp;
setBrightness(int value): method that sets the brightness of the lamp;
setColor(String color): method that sets the light color of the lamp.
