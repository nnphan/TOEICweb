package vn.toeic.core.utils;

import vn.toeic.core.datatranferobject.ListenGuidelineDTO;
import vn.toeic.core.persistence.entity.ListenGuidelineEntity;

public class ListenGuidelineBeanUtil {
    public  static ListenGuidelineDTO entity2Dto(ListenGuidelineEntity entity){
        ListenGuidelineDTO dto = new ListenGuidelineDTO();
        dto.setListenGuidelineId(entity.getListenGuidelineId());
        dto.setContent(entity.getContent());
        dto.setImage(entity.getImage());
        dto.setTitle(entity.getTitle());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setModefiedDate(entity.getModefiedDate());
        return dto;
    }

    public static ListenGuidelineEntity dto2Entity(ListenGuidelineDTO dto){
        ListenGuidelineEntity entity = new ListenGuidelineEntity();
        entity.setListenGuidelineId(dto.getListenGuidelineId());
        entity.setContent(dto.getContent());
        entity.setImage(dto.getImage());
        entity.setTitle(dto.getTitle());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setModefiedDate(dto.getModefiedDate());
        return entity;
    }

}
