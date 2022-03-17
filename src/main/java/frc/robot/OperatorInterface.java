package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;

import edu.wpi.first.math.filter.Debouncer;






public class OperatorInterface {
    private Joystick pilot_joy;
    private Joystick copilot_joy;    

    public Debouncer[] debouncers;
   
   // Needs clean up
   
    public OperatorInterface(){
       this.pilot_joy = new Joystick(RobotConstants.JOYSTICK_PORT_PILOT);
       this.copilot_joy = new Joystick(RobotConstants.JOYSTICK_PORT_COPILOT);
       debouncers = new Debouncer[16];
       for (int i = 0; i < debouncers.length; i = i + 1){
         debouncers[i] = new Debouncer(RobotConstants.WINDOW_TIME);
       }
    }  
      

public double ARMSET2_MOTOR_JOY(){
  return this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_L) * 0.4;
}

public double ARMSET1_MOTOR_JOY(){
  return this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_R) * 0.4;
}

public double leftDriveStick (){
  return frc.robot.Helper.Deadzone(this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_L), -0.1, 0.1) * 0.4;
}

public double rightDriveStick (){
  return frc.robot.Helper.Deadzone(this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_R), -0.1, 0.1) * 0.4;
}

  


//Climb Primary
public DoubleSolenoid.Value armset1(){
    return debouncers[3].calculate(this.copilot_joy.getRawButton(3))?
      DoubleSolenoid.Value.kForward:
      (debouncers[4].calculate(this.copilot_joy.getRawButton(4))?
        DoubleSolenoid.Value.kReverse:
        DoubleSolenoid.Value.kReverse
        );
      }
  public DoubleSolenoid.Value armset2(){
    return debouncers[1].calculate(this.copilot_joy.getRawButton(1))?
      DoubleSolenoid.Value.kForward:
      (debouncers[2].calculate(this.copilot_joy.getRawButton(2))?
        DoubleSolenoid.Value.kReverse:
        DoubleSolenoid.Value.kReverse

      
        
        );
  }  
  
  
    

  public double IntakeyVaccum(){
    return debouncers[RobotConstants.Intakey_PRIMARY]
            .calculate(this.pilot_joy.getRawButton(RobotConstants.Intakey_PRIMARY))?
    1:
    debouncers[2].calculate(this.pilot_joy.getRawButton(2))?
    -1:
    0;
    
  }
 
 public double FArm(){
   return this.pilot_joy.getRawAxis(3)-this.pilot_joy.getRawAxis(2);
 }
    
public double ShootingMotor(){
  return debouncers[6].calculate(this.copilot_joy.getRawButton(6))?
  1:
  debouncers[5].calculate(this.copilot_joy.getRawButton(5))?
  0.5:
  0;
}
  
}    

// Use Joystick library here: https://first.wpi.edu/FRC/roborio/release2017/docs/java/edu/wpi/first/wpilibj/Joystick.html 
