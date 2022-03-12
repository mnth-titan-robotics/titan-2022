package frc.robot;


import edu.wpi.first.math.filter.Debouncer;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
/**import edu.wpi.first.wpilibj.Joystick.ButtonType;
import edu.wpi.first.wpilibj2.command.button.Button;*/






public class OperatorInterface {
    private Joystick pilot_joy;
    private Joystick copilot_joy;    


public Debouncer[] pilotDebouncers;
public Debouncer[] copilotDebouncers;


// Needs clean up

public OperatorInterface(){
    this.pilot_joy = new Joystick(RobotConstants.JOYSTICK_PORT_PILOT);
    this.copilot_joy = new Joystick(RobotConstants.JOYSTICK_PORT_COPILOT);
    pilotDebouncers = new Debouncer[16];
    for (int i = 0; i < pilotDebouncers.length; i= i + 1){
      pilotDebouncers[i] = new Debouncer(RobotConstants.WINDOW_TIME);
    }
    copilotDebouncers = new Debouncer[16];
    for (int i = 0; i < copilotDebouncers.length; i= i + 1){
      copilotDebouncers[i] = new Debouncer(RobotConstants.WINDOW_TIME);
    }
}

public double ShootingMotor(){
  return copilotDebouncers[6].calculate(this.copilot_joy.getRawButton(6))?
    1:
    copilotDebouncers[5].calculate(this.copilot_joy.getRawButton(5))?
      0.5:0;
}


public double FArm(){
  return this.pilot_joy.getRawAxis(3)-this.pilot_joy.getRawAxis(2);
}
   

public double ARMSET2_MOTOR_JOY(){
  return this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_L) * 0.4;
}

public double ARMSET1_MOTOR_JOY(){
  return this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_R) * 0.4;
}

public double leftDriveStick (){
  //add something in robot constants for ThresholdMin and ThresholdMax
  return Helper.Deadzone(this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_L), -0.1, 0.1) * 1;
}

public double rightDriveStick (){
  return Helper.Deadzone(this.pilot_joy.getRawAxis(RobotConstants.CONTROLLER_DRIVE_CHANNEL_R), -0.1, 0.1) * 1;
}




//Climb Primary
public DoubleSolenoid.Value armset1(){
    return pilotDebouncers[3].calculate(this.copilot_joy.getRawButton(3))?
      DoubleSolenoid.Value.kForward:
      (pilotDebouncers[4].calculate(this.copilot_joy.getRawButton(4))?
        DoubleSolenoid.Value.kReverse:
        DoubleSolenoid.Value.kReverse
        );
      }
  public DoubleSolenoid.Value armset2(){
    return pilotDebouncers[1].calculate(this.copilot_joy.getRawButton(1))?
      DoubleSolenoid.Value.kForward:
      (pilotDebouncers[2].calculate(this.copilot_joy.getRawButton(2))?
        DoubleSolenoid.Value.kReverse:
        DoubleSolenoid.Value.kReverse

      
        
        );
  }  
  
  
    

  public double IntakeyVaccum(){
    return pilotDebouncers[RobotConstants.Intakey_PRIMARY]
            .calculate(this.pilot_joy.getRawButton(RobotConstants.Intakey_PRIMARY))?
    1:
    pilotDebouncers[2].calculate(this.pilot_joy.getRawButton(2))?
    -1:0;
  }
 

  
}    

// Use Joystick library here: https://first.wpi.edu/FRC/roborio/release2017/docs/java/edu/wpi/first/wpilibj/Joystick.html 
