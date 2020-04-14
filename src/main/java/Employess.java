public class Employess {
    private String name;
    private String address;
    private String email;
    private String account;
    private String password;
    private String dateCreated;
    private String updateDay;
    private int status;
    public Employess() {
    }

    public Employess(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public Employess(String name, String address, String email, String account, String password, String dateCreated, String updateDay, int status) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.account = account;
        this.password = password;
        this.dateCreated = dateCreated;
        this.updateDay = updateDay;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getUpdateDay() {
        return updateDay;
    }

    public void setUpdateDay(String updateDay) {
        this.updateDay = updateDay;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
