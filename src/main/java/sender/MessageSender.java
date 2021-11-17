package sender;


public class MessageSender {
    public boolean send(String text, User user, String country){
        if (user.getCountry().equals(country)){
            System.out.println("Message sent: " + text);
            return true;
        } else {
            return false;
        }
    }
}

