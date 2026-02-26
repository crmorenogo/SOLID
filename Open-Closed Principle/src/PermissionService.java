import java.util.Collections;
import java.util.List;

public class PermissionService {

    private final UserService userService;

    public PermissionService(UserService userService) {
        this.userService = userService;
    }

    public List<Permission> readPermission(long userId) {
        final User user = userService.readUser(userId);
        return user.getPermissions();
    }

    public void deletePermissions(long userId, Permission permission) {

    }

}
