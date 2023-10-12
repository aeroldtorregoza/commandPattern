public class VolumeDownCommand {
    private MusicPlayer musicPlayer;

    public VolumeDownCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public boolean canExecute() {
        return true;
    }

    public String execute() {
        if (!canExecute())
            return null;

        return this.musicPlayer.decreaseVolume();
    }
}

