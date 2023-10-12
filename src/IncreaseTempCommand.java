public class IncreaseTempCommand implements Command {
    private Thermostat thermostat;

    public IncreaseTempCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public boolean canExecute() {
        return true;
    }

    @Override
    public String Execute() {
        return null;
    }

    public String execute() {
        if (!canExecute())
            return null;

        return this.thermostat.increaseTemperature();
    }
}

