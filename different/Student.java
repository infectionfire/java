public class Student implements Cloneable{
    private int id;
    private String name;
    private int yearOfStudy;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYearOfStudy() {
        return yearOfStudy;
    }
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        if (id != student.id) {
            return false;
        }
        if (yearOfStudy != student.yearOfStudy) {
            return false;
        }
        return name != null ? name.equals(student.name) : student.name == null;
    }
    @Override
    public int hashCode() {
        return id + 31 * yearOfStudy + (name != null ? name.hashCode() : 0) ;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", yearOfStudy=").append(yearOfStudy);
        sb.append('}');
        return sb.toString();
    }
//переопределяем клонабл для безопасного клонирования по ссылке
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

