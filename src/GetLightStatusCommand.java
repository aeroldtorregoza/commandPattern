public class GetLightStatusCommand implements Command{
    private Light light;

    public GetLightStatusCommand(Light light) {
        this.light = light;
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

        return this.light.getStatus();
    }
}

