package vn.toeic.core.daoimpl;

import vn.toeic.core.dao.ExaminationQuestionDao;
import vn.toeic.core.data.daoimpl.AbstractDao;
import vn.toeic.core.persistence.entity.ExaminationQuestionEntity;

import java.util.Map;

public class ExaminationQuestionDaoImpl extends AbstractDao<Integer, ExaminationQuestionEntity> implements ExaminationQuestionDao {
    public Object[] findByProperty(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit, Integer examinationId){
        String whereClause = null;
        if (examinationId != null) {
            whereClause = " AND examination.examinationId = "+examinationId+"";
        }
        return null;
    }
}
