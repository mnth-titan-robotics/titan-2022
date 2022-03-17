package frc.robot;
public class RobotConstants {
    //Debouncer
    public static final double WINDOW_TIME = 0.1;
    //Drive System - RoboRio PMM
    public static final int MOTOR_CHANNEL_FLD = 0;
    public static final int MOTOR_CHANNEL_BLD = 1;
    public static final int MOTOR_CHANNEL_FRD = 2;
    public static final int MOTOR_CHANNEL_BRD = 3;

    //Shooting System
    public static final int MOTOR_SHOOTER = 6;

    //Operator Joystick
    public static final int FBELT_BUTTON = 1;

        //Armset motors
    public static final int ARMSET1_MOTOR = 8;
    public static final int ARMSET2_MOTOR = 9;
 
    /**Specific for logitech controller */
    public static final boolean MOTOR_INVERT_L = false;
    public static final boolean MOTOR_INVERT_R = true; 

    //Controller System - Controller Ints
    /** This is for the tank drive system we hope to use 
     * if changed then we will have to use the x axis on one or both of the joysticks
     */
    public static final int CONTROLLER_DRIVE_CHANNEL_L = 5;
    public static final int CONTROLLER_DRIVE_CHANNEL_R = 1;

    //This is for the Climb button mapping
    public static final int CLIMB_EXTEND_RETRACT_PRIMARY = 1;
    
    //USB port to plug joysticks into on driver station
    public static final int JOYSTICK_PORT_PILOT = 0;
    public static final int JOYSTICK_PORT_COPILOT = 1;

    //Pneumatics - push on even pull on odd
    public static final int Solenoid_1_A = 0;
    public static final int Solenoid_1_B = 1;
    public static final int Solenoid_2_A = 2;
    public static final int Solenoid_2_B = 3;
    public static final int Solenoid_3_A = 4;
    public static final int Solenoid_3_B = 5;
    public static final int Solenoid_4_A = 6;
    public static final int Solenoid_4_B = 7;


    

    //Feeder - RoboRio PMM
    public static final int Feeder_Belt = 4;
    public static final int Feeder_Arm = 5;

    //Feeder Button Mapping 
    public static final int Intakey_PRIMARY = 1;
    
    public static final int Intakey_SECONDARY = 2;

    //Controller Deadzone
    public static final double THRESHOLDMIN = -0.1;
    public static final double THRESHOLDMAX = 0.1;
     
        
    



    //Deadband 
    public static final double DEADBAND = 0.05;

}
