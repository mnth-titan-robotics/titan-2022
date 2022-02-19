package frc.robot;
import edu.wpi.first.wpilibj.Pnematics;

public class RobotConstants {

    //Drive System - RoboRio PMM
    public static final int MOTOR_CHANNEL_FLD = 0;
    public static final int MOTOR_CHANNEL_BLD = 1;
    public static final int MOTOR_CHANNEL_FRD = 2;
    public static final int MOTOR_CHANNEL_BRD = 3;
 
    /**Specific for logitech controller */
    public static final boolean MOTOR_INVERT_L = false;
    public static final boolean MOTOR_INVERT_R = true; 

    //Controller System - Controller Ints
    /** This is for the tank drive system we hope to use 
     * if changed then we will have to use the x axis on one or both of the joysticks
     */
    public static final int CONTROLLER_DRIVE_CHANNEL_L = 1;
    public static final int CONTROLLER_DRIVE_CHANNEL_R = 5;
    
    public static final int JOYSTICK_PORT_PILOT = 0;
    public static final int JOYSTICK_PORT_COPILOT = 1;

    //Pnematics - push on even pull on odd
    public static final int Solonoid_1_A = 1;
    public static final int Solonoid_1_B = 2;
    public static final int Solonoid_2_A = 3;
    public static final int Solonoid_2_B = 4;
    public static final int Solonoid_3_A = 5;
    public static final int Solonoid_3_B = 6;
    public static final int Solonoid_4_A = 7;
    public static final int Solonoid_4_B = 8;

    //Feeder - RoboRio PMM
    public static final int Feeder_Belt = 5;
    public static final int Feeder_Arm = 6;



    //Deadband 
    public static final double DEADBAND = 0.05;
}
