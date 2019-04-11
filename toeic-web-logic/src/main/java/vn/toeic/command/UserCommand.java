package vn.toeic.command;

import vn.toeic.core.datatranferobject.UserDTO;
import vn.toeic.core.web.command.AbstractCommand;

public class UserCommand extends AbstractCommand<UserDTO> {
    private String confirmPassword ;

    public UserCommand(){
        this.pojo= new UserDTO();
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
