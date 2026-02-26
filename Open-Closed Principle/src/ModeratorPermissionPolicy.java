import java.util.List;

public class ModeratorPermissionPolicy implements PermissionPolicy {
    @Override
    public List<Permission> getPermissions() {
        return List.of(Permission.READING, Permission.WRITING);
    }

}