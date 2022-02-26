package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.ButtonType;
import edu.wpi.first.wpilibj2.command.button.Button;


public class OperatorInterface {
    private Joystick pilot_joy;
    private Joystick copilot_joy;    

   
   
   // Needs clean up
   public OperatorInterface(){
       this.pilot_joy = new Joystick(RobotConstants.JOYSTICK_PORT_PILOT);
       this.copilot_joy = new Joystick(RobotConstants.JOYSTICK_PORT_COPILOT);
    }  
    public double leftDriveStick (){
      return this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_L) * 0.4;
         }
    public double rightDriveStick (){
      return this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_R) * 0.4;
        }
    public boolean climbExtendRetractPrimary (){
      return this.copilot_joy.getRawButton(RobotConstants.CLIMB_EXTEND_RETRACT_PRIMARY);
        }
      

      public boolean climb(){
        return this.copilot_joy.getRawButton(RobotConstants.CLIMB_EXTEND_RETRACT_PRIMARY);
        
      }
      public double IntakeSys(){
        return this.copilot_joy.getRawButton(RobotConstants.Feeder_Belt)?
          1:
          this.copilot_joy.getRawButton(-1)?
            -1:0;
      }
    }
// Use Joystick library here: https://first.wpi.edu/FRC/roborio/release2017/docs/java/edu/wpi/first/wpilibj/Joystick.html 
