package buoi7;

public class TestPerson {
    public static void main(String[] args) {
        Student s1 = new Student("Tan ah teck","1 happy Ave");
        s1.addCourseGrade("IM101",97);
        s1.addCourseGrade("IM102",68);
        s1.printGrades();

        System.out.println("Average ís " + s1.getAverageGrade());

        Teacher t1 = new Teacher("Paul Tan", "8 sunset way");
        System.out.println(t1);

        String[] courses = {"IM101","IM102","IM101"};
        for (String course : courses){
            if (t1.addCourse(course)){
                System.out.println(course + "added");
            } else {
                System.out.println(course + "cannot be added");
            }
        }

        for (String course: courses){
            if (t1.removeCourse(course)) {
                System.out.println(course + "removed");
            }else{
                System.out.println(course + "can not be removed");
            }
        }

    }
}
