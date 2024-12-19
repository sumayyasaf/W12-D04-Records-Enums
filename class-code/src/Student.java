public record Student(String name, int grade, char gradeLetter,String course, String country) {

    public static String teacher = "John";

    public Student{

        if(name.isEmpty() || grade <0 || grade >100 || course.isEmpty() || country.isEmpty()){
            throw new RuntimeException("No values can be empty");
        }
    }
}

/*
    1. Create a Student record that takes the following: name, grade (1-100), gradeLetter, course, country
    2. write a static field for teacher that should be the same for all students
    3. Create 3 students
    4. use the .equals() to check if they're the same student
    5. BONUS: write a compact constructor that checks if any of the values are: 0, null or something we don't want than throw a RuntimeException
*/
