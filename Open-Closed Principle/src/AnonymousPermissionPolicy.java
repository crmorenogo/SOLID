import java.util.Collections;
import java.util.List;

public class AnonymousPermissionPolicy implements PermissionPolicy {
    @Override
    public List<Permission> getPermissions() {
        return Collections.emptyList();
    }

}