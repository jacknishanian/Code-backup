/*
* Jack Nishanian
* 9/24/16
* This program converts text messages phrases into into actual words
*
* No rma included no problems encountered
 */
public class TextMessagesV1 {

    public static void main(String[] args) {

        String textMessage = "Hey I will brb, ttyl. Hopefully we can hang out, lol. rofl, lshmsfo, g2g";

        String newMessage = textMessage.replace("be right back", "brb");
        newMessage = newMessage.replace("lol", "laugh out loud");
        newMessage = newMessage.replace("rofl", "rolling on floor laughing");
        newMessage = newMessage.replace("lshmsfo", "laughing so hard my sombrero fell off");
        newMessage = newMessage.replace("g2g", "got to go");

        System.out.println(String.format("The original message has length %d \nand is \"%s\".", textMessage.length(), textMessage));
        System.out.println(String.format("The new message has length %d \nand is \"%s\".", newMessage.length(), newMessage));

        System.out.println("Index of B output: " + newMessage.indexOf("b"));
        System.out.println("Substring(10) on newMessage: " + newMessage.substring(10));
        System.out.println("Substring(2. 4) on newMessage: " + newMessage.substring(2, 4));
        System.out.println("Replace all f with q in newMessage: " + newMessage.replaceAll("f", "q"));

    }
}
