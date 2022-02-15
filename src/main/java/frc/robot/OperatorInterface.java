package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OperatorInterface {
    private Joystick pilot_joy;
    private Joystick copilot_joy;    

   
   
   
   
 public OperatorInterface(){
       this.pilot_joy = new Joystick(RobotConstants.JOYSTICK_PORT_PILOT);
       this.copilot_joy = new Joystick(RobotConstants.JOYSTICK_PORT_COPILOT);
    


public void teleopPeriodic() {
double speed = CONTROLLER_DRIVE_CHANNEL_L.getrawAxis(1) * 0.6;
double speed2 = CONTROLLER_DRIVE_CHANNEL_R.getrawAxis(5) * 0.6;

double left = speed
double right = speed2

MOTOR_CHANNEL_BLD.set(left)
MOTOR_CHANNEL_FLD.set(left)
MOTOR_CHANNEL_BRD.set(right)
MOTOR_CHANNEL_FRD.set(right)


   }



    }


