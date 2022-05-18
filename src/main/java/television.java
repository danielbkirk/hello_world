public class television {

    //Attributes
    String brand;
    String size;
    String resolution;
    double depth;
    String color;
    int noOfHdmiPorts;
    boolean smart;
    String status;
    int volume;
    int channelNo;



    //constructor
    public television(String myBrand, String mySize, String myResolution, double myDepth, String myColor, int myNoOfHdmiPorts, boolean isSmart){
        this.brand = myBrand;
        this.size = mySize;
        this.resolution = myResolution;
        this.depth = myDepth;
        this.color = myColor;
        this.noOfHdmiPorts = myNoOfHdmiPorts;
        this.smart = isSmart;
        this.status = "Off";
        this.volume = 0;
        this.channelNo = 1;
    }

    //Methods
    /*
    * Turn on/off
    * Change volume
    * Change channel
    * */

    public void turnOnOff(){
        if(this.status == "Off"){
            this.status = "On";
        }else{
            this.status = "Off";
        }

    }

    public void increaseVolume(){
        this.volume++;
    }

    public  void decreaseVolume(){
        if (this.volume > 0){
            this.volume--;
        }
    }

    public void increaseChannel(){
        if(this.channelNo == 999){
            this.channelNo = 1;
        }else{
            this.channelNo++;
        }
    }

    public void decreaseChannel(){
        if(this.channelNo == 1){
            this.channelNo = 999;
        }else{
            this.channelNo--;
        }
    }

    public void setChannelNo(int myChannel){
        if(myChannel > 0 && myChannel < 1000){
            this.channelNo = myChannel;
        }
    }

    public int getChannelNo(){
        return this.channelNo;
    }


}
