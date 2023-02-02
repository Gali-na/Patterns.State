public class Main {
    public static void main(String[] args) {
        RadioStation radioOne = new RadioStationFriday();
        RadioStation radioTwo = new RadioStationShanson();
        RadioStation radioThree = new RadioStationHitFM();
        Radio radio = new Radio();
        radio.setRadioStation(radioOne);
        radio.playRadio();
        for(int i =0; i<10;i++){
            radio.nextStation();
        }
        System.out.println("Hello world!");
    }
}