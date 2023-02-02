public class Radio {
  private   RadioStation radioStation;

    public void setRadioStation(RadioStation radioStation) {
        this.radioStation = radioStation;
    }

    void playRadio() {
        radioStation.play();
    }

    void  nextStation() {
         if(radioStation instanceof RadioStationFriday){
             setRadioStation(new RadioStationHitFM());
             radioStation.play();
         }
        if (radioStation instanceof RadioStationHitFM) {
            setRadioStation(new RadioStationShanson());
            radioStation.play();
        }else {
            setRadioStation(new RadioStationFriday());
            radioStation.play();
        }
    }
}
