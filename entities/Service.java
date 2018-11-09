package entities;

public class Service {
    private String name;
    private boolean isActive;

    public Service() {
        this.name = "";
        this.isActive = false;
    }

    public Service(String name, boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }

    public void setName(String name) { this.name = name; }
    public void setIsActive(boolean isActive) { this.isActive = isActive; }

    public String getName() { return this.name; }
    public boolean getIsActive() { return this.isActive; }

    @Override
    public String toString() {
        String service;
        service = "{";
        service += "\n\tNome: " + this.name;
        service += "\n\tIs active? " + String.valueOf(this.isActive) + "\n";
        service += "}";
        return service;
    }
}