interface CameraFeatures{
    void turnOnCamera();
    void turnOffCamera();
    void takeAPhoto();
}

class Phone{
    public void pickUpCall(){
        System.out.println("Pick up the Call");
    }
    public void cutTheCall(){
        System.out.println("Cut the Call");
    }
}

class Smartphone extends Phone implements CameraFeatures{
    @Override
    public void turnOnCamera(){
        System.out.println("Turn On The Camera");
    }
    @Override
    public void turnOffCamera(){
        System.out.println("Turn Off The Camera");
    }

    @Override
    public void takeAPhoto() {
        System.out.println("Take A Photo");
    }
}

public class InterfaceConcept {
    public static void main(String[] args) {
        Smartphone sc = new Smartphone();
        sc.pickUpCall();
        sc.cutTheCall();
        sc.turnOnCamera();
        sc.takeAPhoto();
        sc.turnOffCamera();
    }
}
