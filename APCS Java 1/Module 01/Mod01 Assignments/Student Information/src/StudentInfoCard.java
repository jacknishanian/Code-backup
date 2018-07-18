/**
 * Name: Jack Nishanian
 * Birthday: 9/29/01
 * Date: 9/11/2016
 * Info: This class supports the Main.
 */
public class StudentInfoCard {
    private String name, birthday, homePhone, cell, times, math, experience, reason;
    private int age;

    //Set empty values
    public StudentInfoCard() {
        name = "";
        birthday = "";
        homePhone = "";
        cell = "";
        times = "";
        math = "";
        experience = "";
        reason = "";
        age = 0;
    }

    //Too many things to deal with a constructor with parameters. =/


    //Getters and setters 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


    //How I want to print my stuff. Could be nicer, but that takes time. =/ 
    public void printStudent() {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + birthday);
        System.out.println("Home Phone: " + homePhone);
        System.out.println("Time Available: " + times);
        System.out.println("Math Class: " + math);
        System.out.println("Experience: " + experience);
        System.out.println("Reason: " + reason);
        System.out.print("Age: " + age + "\n\n");
    }
}
