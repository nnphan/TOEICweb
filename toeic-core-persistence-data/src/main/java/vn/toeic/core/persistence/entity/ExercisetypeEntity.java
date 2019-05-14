package vn.toeic.core.persistence.entity;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "exercisetype")
public class ExercisetypeEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer exercisetypeId;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private Timestamp code;

    @Column(name = "createddate")
    private Timestamp createdDate;


    @Column(name = "modifieddate")
    private Timestamp modifiedDate;


    @OneToMany(mappedBy = "exercisetypeEntity", fetch = FetchType.LAZY)
    private List<ExerciseEntity> exercises;

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

    public List<ExerciseEntity> getExercises() {
        return exercises;
    }

    public void setExercises(List<ExerciseEntity> exercises) {
        this.exercises = exercises;
    }


}
