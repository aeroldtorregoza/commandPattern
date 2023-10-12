public class RemoteControl {
    private LightCommand lightCommand;
    private GetLightStatusCommand getLightStatusCommand;
    private IncreaseTempCommand increaseTempCommand;
    private DecreaseTempCommand decreaseTempCommand;
    private GetTempCommand getTempCommand;
    private VolumeUpCommand volumeUpCommand;
    private VolumeDownCommand volumeDownCommand;
    private GetVolumeCommand getVolumeCommand;

    public RemoteControl(LightCommand lightCommand,
                         GetLightStatusCommand getLightStatusCommand, IncreaseTempCommand increaseTempCommand,
                         DecreaseTempCommand decreaseTempCommand, GetTempCommand getTempCommand, VolumeUpCommand volumeUpCommand,
                         VolumeDownCommand volumeDownCommand, GetVolumeCommand getVolumeCommand) {
        this.lightCommand = lightCommand;
        this.getLightStatusCommand = getLightStatusCommand;
        this.increaseTempCommand = increaseTempCommand;
        this.decreaseTempCommand = decreaseTempCommand;
        this.getTempCommand = getTempCommand;
        this.volumeUpCommand = volumeUpCommand;
        this.volumeDownCommand = volumeDownCommand;
        this.getVolumeCommand = getVolumeCommand;
    }

    public void clickLightButton() {
        System.out.println(getLightStatusCommand.execute());
        System.out.println(lightCommand.execute());
        System.out.println(getLightStatusCommand.execute());
    }

    public void clickIncreaseTempButton() {
        System.out.println(getTempCommand.execute());
        System.out.println(increaseTempCommand.execute());
        System.out.println(getTempCommand.execute());
    }

    public void clickDecreaseTempButton() {
        System.out.println(getTempCommand.execute());
        System.out.println(decreaseTempCommand.execute());
        System.out.println(getTempCommand.execute());
    }

    public void clickVolumeUpButton() {
        System.out.println(getVolumeCommand.execute());
        System.out.println(volumeUpCommand.execute());
        System.out.println(getVolumeCommand.execute());
    }

    public void clickVolumeDownButton() {
        System.out.println(getVolumeCommand.execute());
        System.out.println(volumeDownCommand.execute());
        System.out.println(getVolumeCommand.execute());
    }

    public void clickDiagnosticsButton() {
        System.out.println(getLightStatusCommand.execute());
        System.out.println(getTempCommand.execute());
        System.out.println(getVolumeCommand.execute());
    }
}
