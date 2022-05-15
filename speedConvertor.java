public class speedConvertor {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid value");
        }else{
            long MPH = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " Km/H = " + MPH + " Mi/H");
        }
    }
}
