package DummyClasses;

public class Interest {
    private int id;
    private String title;
    private float grade;

    public Interest(int id, String title, float grade) {
        this.id = id;
        this.title = title;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
