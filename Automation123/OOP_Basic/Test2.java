package OOP_Basic;

public class Test2 {
    private String name;
    private int id;

    // Default constructor
    public Test2() {
        // Initialize instance variables if needed
        this.name = "";
        this.id = 0;
    }

    // Constructor with only 'name'
    public Test2(String name) {
        this.name = name;
        this.id = 0; // Set a default value for 'id'
    }

    // Constructor with both 'name' and 'id'
    public Test2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'id'
    public int getId() {
        return id;
    }

    // Setter for 'id'
    public void setId(int id) {
        this.id = id;
    }
}
