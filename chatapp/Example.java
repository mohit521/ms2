// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Example {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");
    private static final String ACd2445cda1611194a77571fbc4259e728 = null;
    private static Object Twilio;

    public static void main(String[] args) {
        Twilio.wait(ACd2445cda1611194a77571fbc4259e728, 82ec7da2462479dd1a97395a413bc5ab);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+15558675310"),
                new com.twilio.type.PhoneNumber("+15017122661"),
                "Hi there")
            .create();

        System.out.println(message.getSid());
    }
}