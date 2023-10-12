public class GetTempCommand implements Command {
    private Thermostat thermostat;

    public GetTempCommand(Thermostat thermostat) {
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

        return this.thermostat.getTemperature();
    }
}
