package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OperatorInterface {
    private Joystick pilot_joy;
    private Joystick copilot_joy;    

    public OperatorInterface(){
        this.pilot_joy = new Joystick(RobotConstants.JOYSTICK_PORT_PILOT);
        this.copilot_joy = new Joystick(RobotConstants.JOYSTICK_PORT_COPILOT);

    
    }
}

