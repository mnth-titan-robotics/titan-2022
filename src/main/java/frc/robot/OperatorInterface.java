package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;




public class OperatorInterface {
    private Joystick pilot_joy;
    private Joystick copilot_joy;    

   
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

public double ARMSET2_MOTOR_JOY(){
  return this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_L) * 0.4;
}

public double ARMSET1_MOTOR_JOY(){
  return this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_R) * 0.4;
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

  



public DoubleSolenoid.Value armset1(){
    return this.copilot_joy.getRawButton(3)?
      DoubleSolenoid.Value.kForward:
      (this.copilot_joy.getRawButton(4)?
        DoubleSolenoid.Value.kReverse:
        DoubleSolenoid.Value.kOff);
      }
  public DoubleSolenoid.Value armset2(){
    return this.copilot_joy.getRawButton(1)?
      DoubleSolenoid.Value.kForward:
      (this.copilot_joy.getRawButton(2)?
        DoubleSolenoid.Value.kReverse:
        DoubleSolenoid.Value.kOff);
  }  
  
  
    

  public boolean climb(){
    return this.copilot_joy.getRawButton(RobotConstants.CLIMB_EXTEND_RETRACT_PRIMARY);
    
  }
  public boolean IntakeyVaccum(){
    return this.pilot_joy.getRawButton(RobotConstants.Intakey_PRIMARY);
    
  }
 

    
  //public boolean IntakeSys(){
    //return this.pilot_joy.getRawButton(RobotConstants.Feeder_Belt);
  //}
  
}    

// Use Joystick library here: https://first.wpi.edu/FRC/roborio/release2017/docs/java/edu/wpi/first/wpilibj/Joystick.html 
