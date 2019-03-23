package vn.toeic.command;

import vn.toeic.core.datatranferobject.UserDTO;
import vn.toeic.core.web.command.AbstractCommand;

public class UserCommand extends AbstractCommand<UserDTO> {
    //Constructor
    public UserCommand(){
        this.pojo= new UserDTO();
    }

}
