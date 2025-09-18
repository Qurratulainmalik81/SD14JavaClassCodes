public class Course {
    
    private String CourseName;
    private Instructor instructor;
    private TextBook textBook;

    public Course(String name, Instructor instructor, TextBook tb)
    {
        this.CourseName = name;
        this.instructor = instructor;
        this.textBook = tb;
    }
    public String getCourseName() {
        return CourseName;
    }
    public Instructor getInstructor() {
        return instructor;
    }
    public TextBook getTextBook() {
        return textBook;
    }
    public String toString()
    {
        return(this.CourseName + " is taught by " + this.instructor + " TextBook: " + this.textBook);
    }


}
