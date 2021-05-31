package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="companies")
@PrimaryKeyJoinColumn
public class Company extends User {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="company_name")
    private String companyName;

    @Column(name="website")
    private String website;

    @Column(name="phone_number")
    private int phoneNumber;


}
