import javafx.scene.SubScene;

public class Main {
    public static void main(String[] args) throws Exception {

        LoginCamera lp = new LoginCamera();
        lp.doLogin("192.168.0.64",(short)8000,"admin","abc12345");
        Control.cloudControl("192.168.0.64", CloudCode.PAN_LEFT, CloudCode.SPEED_LV6, CloudCode.END);

    }
}
