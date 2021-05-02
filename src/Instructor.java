public class Instructor {
    public Instructor(int insId,String lesson) {
        this.setInsId(insId);
        this.setLesson(lesson);
    }

    private int insId;
private String lesson;

    public int getInsId() {
        return insId;
    }

    public void setInsId(int insId) {
        this.insId = insId;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
