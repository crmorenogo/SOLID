import java.util.List;

public class AdminPermissionPolicy implements PermissionPolicy {
    @Override
    public List<Permission> getPermissions() {
        return List.of(Permission.READING_WRITING);
    }

}