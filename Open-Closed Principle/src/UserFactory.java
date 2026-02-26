public class UserFactory {
    public static User createAdmin() {
        return new User(Role.ADMIN, new AdminPermissionPolicy());
    }
    public static User createModerator() {
        return new User(Role.MODERATOR, new ModeratorPermissionPolicy());
    }
    public static User createAnonymous() {
        return new User(Role.ANONYMOUS, new AnonymousPermissionPolicy());
    }

}