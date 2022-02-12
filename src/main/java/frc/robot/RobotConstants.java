package frc.robot;

public class RobotConstants {

    //Drive System
    public static final int MOTOR_CHANNEL_FLD = 0;
    public static final int MOTOR_CHANNEL_BLD = 1;
    public static final int MOTOR_CHANNEL_FRD = 2;
    public static final int MOTOR_CHANNEL_BRD = 3;
 
    /**Specific for logitech controller */
    public static final boolean MOTOR_INVERT_L = false;
    public static final boolean MOTOR_INVERT_R = true; 

    //Controller System
    /** This is for the tank drive system we hope to use 
     * if changed then we will have to use the x axis on one or both of the joysticks
     */
    public static final int CONTROLLER_DRIVE_CHANNEL_L = 1;
    public static final int CONTROLLER_DRIVE_CHANNEL_R = 5;
    
    public static final int JOYSTICK_PORT_PILOT = 0;
    public static final int JOYSTICK_PORT_COPILOT = 1;
    
    //Deadband 
    public static final double DEADBAND = 0.05;
}
