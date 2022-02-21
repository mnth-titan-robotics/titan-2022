package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.ButtonType;
import edu.wpi.first.wpilibj2.command.button.Button;


public class OperatorInterface {
    private Joystick pilot_joy;
    private Joystick copilot_joy;    

   private static ButtonType B2 = new Button(RobotConstants.COPILOT_B)
   
   
   // Needs clean up
   public OperatorInterface(){
       this.pilot_joy = new Joystick(RobotConstants.JOYSTICK_PORT_PILOT);
       this.copilot_joy = new Joystick(RobotConstants.JOYSTICK_PORT_COPILOT);
    }  
    public double leftDriveStick (){
      return this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_L) * 0.6;
         }
      public double rightDriveStick (){
    return this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_R) * 0.6;
      }
    
// Use Joystick library here: https://first.wpi.edu/FRC/roborio/release2017/docs/java/edu/wpi/first/wpilibj/Joystick.html 
// Desired call to getrawaxis requires specific controller target. 

// public void teleopPeriodic() {
// double speed = this.pilot_joy.getrawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_L) * 0.6;
// double speed2 = CONTROLLER_DRIVE_CHANNEL_R.getrawAxis(5) * 0.6;

// double left = speed
// double right = speed2

// MOTOR_CHANNEL_BLD.set(left)
// MOTOR_CHANNEL_FLD.set(left)
// MOTOR_CHANNEL_BRD.set(right)
// MOTOR_CHANNEL_FRD.set(right)


//    }
}


