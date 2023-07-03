package employeeManager;

public class engineer extends employee {
    private String[] programmingLanguages;

    public engineer(String name, int age, String address, double salary, String[] programmingLanguages) {
        super(name, age, address, salary);
        this.programmingLanguages = programmingLanguages;
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("ProgrammingLanguages: ");
        for (String language : programmingLanguages) {
            System.out.println(language + " ");
        }
        System.out.println();
    }
}
