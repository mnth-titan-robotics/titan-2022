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
      

public double ARMSET2_MOTOR_JOY(){
  return this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_L) * 0.4;
}

public double ARMSET1_MOTOR_JOY(){
  return this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_R) * 0.4;
}

public double leftDriveStick (){
  return this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_L) * 1;
}

public double rightDriveStick (){
  return this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_R) * 1;
}

  


//Climb Primary
public DoubleSolenoid.Value armset1(){
    return this.copilot_joy.getRawButton(3)?
      DoubleSolenoid.Value.kForward:
      (this.copilot_joy.getRawButton(4)?
        DoubleSolenoid.Value.kReverse:
        DoubleSolenoid.Value.kReverse
        );
      }
  public DoubleSolenoid.Value armset2(){
    return this.copilot_joy.getRawButton(1)?
      DoubleSolenoid.Value.kForward:
      (this.copilot_joy.getRawButton(2)?
        DoubleSolenoid.Value.kReverse:
        DoubleSolenoid.Value.kReverse

      
        
        );
  }  
  
  
    

  public double IntakeyVaccum(){
    return this.pilot_joy.getRawButton(RobotConstants.Intakey_PRIMARY)?
    1:
    this.pilot_joy.getRawButton(2)?
    -1:
    0;
    
  }
 
 public double FArm(){
   return this.pilot_joy.getRawAxis(3)-this.pilot_joy.getRawAxis(2);
 }
    
public double ShootingMotor(){
  return this.copilot_joy.getRawButton(6)?
  1:
  this.copilot_joy.getRawButton(5)?
  0.5:
  0;
}
  
}    

// Use Joystick library here: https://first.wpi.edu/FRC/roborio/release2017/docs/java/edu/wpi/first/wpilibj/Joystick.html 
