package vn.toeic.core.datatranferobject;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

public class ExercisetypeDTO {

    private Integer exercisetypeId;
    private String name;
    private Timestamp code;
    private Timestamp createdDate;
    private Timestamp modifiedDate;
    private List<ExerciseDTO> exercises;

    public Integer getExercisetypeId() {
        return exercisetypeId;
    }

    public void setExercisetypeId(Integer exercisetypeId) {
        this.exercisetypeId = exercisetypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getCode() {
        return code;
    }

    public void setCode(Timestamp code) {
        this.code = code;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public List<ExerciseDTO> getExercises() {
        return exercises;
    }

    public void setExercises(List<ExerciseDTO> exercises) {
        this.exercises = exercises;
    }
}
