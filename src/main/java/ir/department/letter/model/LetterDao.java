package ir.department.letter.model;

public interface LetterDao {
    public void submit();
    public void delete(int id);
    public void list();
    public void sortlist(String title);
    public void edit(int id);
    public void refer(int id,String name);
}
