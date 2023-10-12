public class GetVolumeCommand implements Command {
    private MusicPlayer musicPlayer;

    public GetVolumeCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
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

        return this.musicPlayer.getVolume();
    }
}

