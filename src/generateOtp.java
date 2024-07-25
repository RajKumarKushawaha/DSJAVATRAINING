import java.util.Random;
public class generateOtp {
    public static String generateOTP(int length) {
        Random random = new Random();// Create Random class
        int otp = random.nextInt(900000) + 100000; //Generate a 6-digit number
        return String.valueOf(otp); // Convert the number to a string and return it
    }
    public static void main(String[] args) {
            String otp = generateOTP(6);//function call and assign in otp
            System.out.println("Raj Your OTP is: " +otp);
        }
}



