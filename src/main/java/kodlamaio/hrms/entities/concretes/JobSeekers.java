package kodlamaio.hrms.entities.concretes;

import kodlamaio.hrms.entities.abstracts.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_seekers")
@PrimaryKeyJoinColumn(name = "id")
public class JobSeekers extends Users {


    @Id
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="nationality_id", unique = true)
    private long nationalityId;

    @Column(name="birth_date")
    private int birthDate;

}
