package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_titles")
public class Job {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="job_title")
    private String jobTitle;
}
