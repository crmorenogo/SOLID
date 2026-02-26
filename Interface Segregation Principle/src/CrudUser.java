public interface CrudUser {

    User readUser(long id);
    User createUser(User user);
    void deleteUser(long id);
    User updateUser(User user);

}