package frc.robot;

public class Helper {
    public static boolean between(double input, double ThresholdMin, double ThresholdMax){
        return (input > ThresholdMin && input < ThresholdMax);
    }
    public static double Deadzone(double Axis, double ThresholdMin, double ThresholdMax){
        return(between(Axis, ThresholdMin, ThresholdMax))? 0 : Axis;
    }
}