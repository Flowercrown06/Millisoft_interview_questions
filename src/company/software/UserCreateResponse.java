package company.software;

public class UserCreateResponse {
    private int id;
    private String status;

    public UserCreateResponse(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserCreateResponse{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
