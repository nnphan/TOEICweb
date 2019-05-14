package vn.toeic.core.datatranferobject;

import java.sql.Timestamp;
import java.util.List;

public class ExerciseDTO {
    private Integer exerciseId;
    private String name;
    private Timestamp createdDate;
    private Timestamp modifiedDate;
    private String type;
    private List<ExerciseQuestionDTO> exerciseQuestions;
}
