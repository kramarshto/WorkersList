public class Worker {
    private enum Gender {Male, Female}

    private int id;
    private String name;
    private Gender gender;
    private String birthDate;
    private Division division;
    private int salary;

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

    public String getGender() {
        if (gender.ordinal()==0)
            return "Male";
        else return "Female";
    }

    public void setGender(String gender) {
        this.gender = Gender.valueOf(gender);
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Division getDivisionClass() {
        return division;
    }

    public String getDivisionName() {
        return division.getName();
    }

    public int getDivisionId() {
        return division.getId();
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birthDate='" + birthDate + '\'' +
                ", division=" + division.getName() +
                ", salary=" + salary +
                '}';
    }
}