public class Light {
    private boolean isOn;

    public Light() {
        this.isOn = false;
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public String getStatus() {
        return "Light is currently " + (this.isOn ? "on" : "off");
    }

    public String switchOn() {
        this.isOn = true;
        return "Light has been switched-on";
    }

    public String switchOff() {
        this.isOn = false;
        return "Light has been switched-off";
    }
}

