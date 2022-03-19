// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
// delete me 
package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import java.util.concurrent.TimeUnit;
import edu.wpi.first.cameraserver.CameraServer;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  private static final String kDefaultAuto = "Default";
  private static final String kCustomAuto = "My Auto";
  private String m_autoSelected;
  private final SendableChooser<String> m_chooser = new SendableChooser<>();

  private OperatorInterface Ops;
  private DriveSystems driveSystem;
  private IntakeSys intakeSys;
//private ClimbRotate _climbRotate;

  private Climb climbsystem;

  private Shooter shootSystem;

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
    m_chooser.addOption("My Auto", kCustomAuto);
    SmartDashboard.putData("Auto choices", m_chooser);
    CameraServer.startAutomaticCapture();
    this.driveSystem = new DriveSystems();
    this.Ops = new OperatorInterface();
    //this._climbRotate = new ClimbRotate();
    this.shootSystem = new Shooter();
    this.intakeSys = new IntakeSys();
    this.climbsystem = new Climb();
    climbsystem.reset(Ops.armset1(), Ops.armset2());
    
  }

  /**
   * This function is called every robot packet, no matter the mode. Use this for items like
   * diagnostics that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {}

  /**
   * This autonomous (along with the chooser code above) shows how to select between different
   * autonomous modes using the dashboard. The sendable chooser code works with the Java
   * SmartDashboard. If you prefer the LabVIEW Dashboard, remove all of the chooser code and
   * uncomment the getString line to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional comparisons to the switch structure
   * below with additional strings. If using the SendableChooser make sure to add them to the
   * chooser code above as well.
   */
  @Override
  public void autonomousInit() {
   /* this.driveSystem.update(0.2, 0.2);
    try {
      TimeUnit.MILLISECONDS.sleep(4000); 
      } catch (Exception e) {
        System.err.println("An InterruptedException was caught");
      }   
      this.driveSystem.update(0, 0);**/

    //New Auto Mode for Shooter
   /* this.driveSystem.update(0.2, 0.2);
    try {
      TimeUnit.MILLISECONDS.sleep(4000); 
      } catch (Exception e) {
        System.err.println("An InterruptedException was caught");
      }   
      this.driveSystem.update(0, 0);

      shootSystem.autoUpdate(-1);
    try {
      TimeUnit.MILLISECONDS.sleep(6000); 
      } catch (Exception e) {
        System.err.println("An InterruptedException was caught");
      }   
      shootSystem.autoUpdate(0);
     **/
    //set up shot
    this.driveSystem.update(0.4, 0.4);
    this.intakeSys.update(0, 0, .2);
   
    try {
      TimeUnit.MILLISECONDS.sleep(3000); 
      } catch (Exception e) {
        System.err.println("An InterruptedException was caught");
      }   
      //ball into cargo
      //this.shootSystem.update(1);
      this.driveSystem.update(0, 0);
      this.intakeSys.update(0, 0, 0);
      try {
        TimeUnit.MILLISECONDS.sleep(3000); 
        } catch (Exception e) {
          System.err.println("An InterruptedException was caught");
        }   
        //settling the ball
       //this.shootSystem.update(0);
     /*   try {
          TimeUnit.MILLISECONDS.sleep(1000); 
          } catch (Exception e) {
            System.err.println("An InterruptedException was caught");
          }   **/
          //reving shoot
          this.shootSystem.update(-1);
          try {
            TimeUnit.MILLISECONDS.sleep(1000); 
            } catch (Exception e) {
              System.err.println("An InterruptedException was caught");
            }   
            //jerk forward
          this.driveSystem.update(1, 1);
          try {
            TimeUnit.MILLISECONDS.sleep(500); 
            } catch (Exception e) {
              System.err.println("An InterruptedException was caught");
            }   
            //stop all
            this.driveSystem.update(0, 0);
            try {
              TimeUnit.MILLISECONDS.sleep(1000); 
              } catch (Exception e) {
                System.err.println("An InterruptedException was caught");
              }   
              this.shootSystem.update(0);
              this.driveSystem.update(.2, .2);
              try {
                TimeUnit.MILLISECONDS.sleep(1000); 
                } catch (Exception e) {
                  System.err.println("An InterruptedException was caught");
                }   
                this.driveSystem.update(0, 0);
                this.shootSystem.update(0);
                this.intakeSys.update(0, 0, 0);


    m_autoSelected = m_chooser.getSelected();
    // m_autoSelected = SmartDashboard.getString("Auto Selector", kDefaultAuto);
    System.out.println("Auto selected: " + m_autoSelected);}
  
    //at the beginning of Autonomous, we want to reset things like the climber, operator interface, speed to zero, etc...
    //this._climb.reset();


  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {
    switch (m_autoSelected) {
      case kCustomAuto:
        // Put custom auto code here
        break;
      case kDefaultAuto:
      default:
        // Put default auto code here
        break;
    }
  }

  

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {

   
  }
 
  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    shootSystem.update(Ops.Motor_Shooter());
    driveSystem.update(Ops.leftDriveStick (), Ops.rightDriveStick());
    climbsystem.update(Ops.armset1(), Ops.armset2());
 
    //_climbRotate.update(Ops.ARMSET1_MOTOR_JOY(), Ops.ARMSET2_MOTOR_JOY());
    intakeSys.update(Ops.IntakeyVaccum(), Ops.FArm(), Ops.FArmBack());
  }

  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {}

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {}

  /** This function is called once when test mode is enabled. */
  @Override
  public void testInit() {}

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}  
}
