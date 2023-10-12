public class Thermostat {
    private int temperature;

    public Thermostat() {
        this.temperature = 20;
    }

    public String getTemperature() {
        return "Thermostat's current temperature is " + this.temperature;
    }

    public String increaseTemperature() {
        this.temperature++;
        return "Thermostat's temperature increased";
    }

    public String decreaseTemperature() {
        this.temperature--;
        return "Thermostat's temperature decreased";
    }
}

