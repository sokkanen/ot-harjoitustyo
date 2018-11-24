package app.gcdb.domain;

public class Platform {
    
    private String name;
    private int id;
    
    public Platform(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public int getId() {
        return this.id;
    }
}
