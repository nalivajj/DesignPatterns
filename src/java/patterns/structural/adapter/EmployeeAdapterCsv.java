package patterns.structural.adapter;

public class EmployeeAdapterCsv implements Employee {
    private EmployeeCsv instance;

    public EmployeeAdapterCsv(EmployeeCsv instance) {
        this.instance = instance;
    }

    public String getId() {
        return instance.getId() + "";
    }

    public String getFirstName() {
        return instance.getFirstName();
    }

    public String getLastName() {
        return instance.getLastName();
    }

    public String getEmail() {
        return instance.getEmailAddress();
    }
}
