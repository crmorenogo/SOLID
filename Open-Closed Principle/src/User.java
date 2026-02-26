import java.util.List;

public class User {
    private final Role role;
    private final PermissionPolicy permissionPolicy;

    // Constructor
    public User(Role role, PermissionPolicy permissionPolicy) {
        this.role = role;
        this.permissionPolicy = permissionPolicy;
    }

    public List<Permission> getPermissions() {
        return permissionPolicy.getPermissions(); // delega aquí
    }

}
