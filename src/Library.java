import java.util.ArrayList;

public class Library {
    private String name;
    private Department department;
    private Department[] departments;

    public Library() {
    }

    public Library(String name) {
        this.name = name;
        this.departments = new Department[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public String toString() {
        return "Library name: " + name;
    }

    public void addDepartment(Department element) {
        Department[] newDepartment = new Department[departments.length + 1];
        for (int i = 0; i < departments.length; i++) {
            newDepartment[i] = departments[i];

        }
        newDepartment[departments.length] = element;
        departments = newDepartment;
    }

    public Edition findEdition(int yearOfPublication) {
        for (Department department : departments) {
            Edition foundEdition = department.getLibrary().findEdition(yearOfPublication);

            if (foundEdition != null) {
                return foundEdition;
            }
        }
        return null;
    }


}


