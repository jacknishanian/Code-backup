/**
 * Name: Jack Nishanian
 * Birthday: 9/29/01
 * Date: 9/11/2016
 * Info: This is the main class that runs.
 */
public class Main {
    public static void main(String[] args) {
        //Created a StudentInfoCard object.
        StudentInfoCard jack = new StudentInfoCard();

        //Set stuff...
        jack.setName("Jack");
        jack.setBirthday("9/29/01");
        jack.setHomePhone("248-808-2164");
        jack.setCell("248-506-2832");
        jack.setTimes("Mon-Fri after 3 pm");
        jack.setMath("Geometry");
        jack.setExperience("I have programmed a pretty good amount.");
        jack.setReason("AP Classes rule?");
        jack.setAge(14);

        //Print it all :)
        jack.printStudent();
    }
}
