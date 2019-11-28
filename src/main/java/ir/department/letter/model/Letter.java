package ir.department.letter.model;

public class Letter{
    private int id;
    private String title;
    private String privacy;
    private String date;
    private int indicator;
    private String sender;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPrivacy() {
        return privacy;
    }

    public String getDate() {
        return date;
    }

    public int getIndicator() {
        return indicator;
    }

    public String getSender() {
        return sender;
    }

    public void setId(int id) {
        this.id = id;
    }
}
