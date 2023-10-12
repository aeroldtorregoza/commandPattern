public class MusicPlayer {
    private int volume;

    public MusicPlayer() {
        this.volume = 10;
    }

    public String getVolume() {
        return "Music Player's current volume is " + this.volume;
    }

    public String increaseVolume() {
        this.volume++;
        return "Music Player's volume increased";
    }

    public String decreaseVolume() {
        this.volume--;
        return "Music Player's volume decreased";
    }
}
