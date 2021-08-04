import javax.swing.JOptionPane; //이렇게 import해주어야 JOptionPane 사용가능


import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class OkJavaGoInHomeInput {
    // args를 parameter, 매개변수라고 한다.
    // String[]이라고 쓰는 이유는 문자열로만 된 배열로 선언하기 위해서.
    public static void main(String[] args){
        
        //String id = JOptionPane.showInputDialog("Enter a ID"); //JOptionPane을 사용할 수가 없다. Input값을 받기위한 방법
        //String bright = JOptionPane.showInputDialog("Enter a Bright level"); //Input값을 받기위한 방법
        String id =args[0];
        String bright = args[1];

        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);

        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(id+" / Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id+ " / floor Lamp");
        floorLamp.on();

        DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();
        
    }
}
