package id.my.hendisantika.userscrud.exception;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-react-users-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/12/24
 * Time: 07.04
 * To change this template use File | Settings | File Templates.
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Could not find user with id " + id);
    }
}
