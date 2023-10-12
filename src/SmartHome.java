import java.util.Scanner;

public class SmartHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Light livingRoomLight = new Light();
        Thermostat mainThermostat = new Thermostat();
        MusicPlayer stereoSystem = new MusicPlayer();

        RemoteControl remote = new RemoteControl(
                new LightCommand(livingRoomLight),
                new GetLightStatusCommand(livingRoomLight),
                new IncreaseTempCommand(mainThermostat),
                new DecreaseTempCommand(mainThermostat),
                new GetTempCommand(mainThermostat),
                new VolumeUpCommand(stereoSystem),
                new VolumeDownCommand(stereoSystem),
                new GetVolumeCommand(stereoSystem)
        );

        System.out.println("Welcome to your Smart Home!");

        boolean shouldExit = false;
        while (!shouldExit) {
            System.out.println("Choose an option on the remote:\n");
            System.out.println("1: Turn on/off the Living Room Light.");
            System.out.println("2: Increase the Main Thermostat Temperature.");
            System.out.println("3: Decrease the Main Thermostat Temperature.");
            System.out.println("4: Increase Stereo System Volume.");
            System.out.println("5: Decrease Stereo System Volume.");
            System.out.println("6: Access Diagnostics.");
            System.out.println("7: Exit\n");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    remote.clickLightButton();
                    break;
                case 2:
                    remote.clickIncreaseTempButton();
                    break;
                case 3:
                    remote.clickDecreaseTempButton();
                    break;
                case 4:
                    remote.clickVolumeUpButton();
                    break;
                case 5:
                    remote.clickVolumeDownButton();
                    break;
                case 6:
                    remote.clickDiagnosticsButton();
                    break;
                case 7:
                    shouldExit = true;
                    System.out.print("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
