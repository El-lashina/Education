package Module2_Collections.Example14;

public class Nikname {
    private String oldName;
    private String newName;

    public String getOldName() {
        return oldName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public Nikname(String oldName, String newName) {
        this.oldName = oldName;
        this.newName = newName;
    }

    @Override
    public String toString() {
        return oldName + " " + newName;
    }
}
