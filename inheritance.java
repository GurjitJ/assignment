class Teacher {

    String title = "Teacher";
    String school = "Oxford";
    void does(){
        System.out.println("Teach");
    }
}

public class englishTeacher extends Teacher{

    String mainSubject = "English";
    public static void main(String args[]){
        englishTeacher obj = new englishTeacher();

        System.out.println(obj.school);
        System.out.println(obj.title);

        System.out.println(obj.mainSubject);

        obj.does();
    }
}