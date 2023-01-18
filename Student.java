public class Student {
    private int id;
    private String names;
    public Student(int id,String names){
        this.id=id;
        this.names=names;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNames() {
        return names;
    }
    public void setNames(String names) {
        this.names = names;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", names=" + names + "]";
    }

}
