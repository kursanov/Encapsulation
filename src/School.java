public class School {

    private String nameSchool;

    private String address;

    private String statusSchool;

    public School(String nameSchool, String address, String statusSchool) {
        this.nameSchool = nameSchool;
        this.address = address;
        this.statusSchool = statusSchool;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatusSchool() {
        return statusSchool;
    }

    public void setStatusSchool(String statusSchool) {
        this.statusSchool = statusSchool;
    }
}
