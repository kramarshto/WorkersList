public class Division {
    private int id;
    private String name;

    public Division(String name) {
        this.name = name;
        this.id = name.hashCode();
    }

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
}

