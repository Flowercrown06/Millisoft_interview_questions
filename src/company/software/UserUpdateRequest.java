package company.software;

public class UserUpdateRequest {
    int id;
    String email;

    public UserUpdateRequest(int id, String email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserUpdateRequest{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
