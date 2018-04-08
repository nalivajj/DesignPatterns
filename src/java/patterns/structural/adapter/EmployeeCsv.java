package patterns.structural.adapter;

import java.util.StringTokenizer;

public class EmployeeCsv {
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public EmployeeCsv(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if(tokenizer.hasMoreElements()) {
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if (tokenizer.hasMoreElements()) {
            firstName = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            lastName = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            emailAddress = tokenizer.nextToken();
        }
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
