package vn.toeic.command;

import vn.toeic.core.datatranferobject.ListenGuidelineDTO;
import vn.toeic.core.web.command.AbstractCommand;

public class ListenguidelineCommand extends AbstractCommand<ListenGuidelineDTO> {
    public ListenguidelineCommand(){
        this.pojo = new ListenGuidelineDTO();
    }
}
