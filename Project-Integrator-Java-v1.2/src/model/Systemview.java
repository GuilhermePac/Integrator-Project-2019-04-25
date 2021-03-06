package model;
// Generated 25/04/2019 00:40:20 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Systemview generated by hbm2java
 */
@Entity
@Table(name="systemview"
    ,schema="gcsystem"
)
public class Systemview  implements java.io.Serializable {


     private int code;
     private String name;
     private String classname;
     private Set<Userlog> userlogs = new HashSet<Userlog>(0);

    public Systemview() {
    }

	
    public Systemview(int code) {
        this.code = code;
    }
    public Systemview(int code, String name, String classname, Set<Userlog> userlogs) {
       this.code = code;
       this.name = name;
       this.classname = classname;
       this.userlogs = userlogs;
    }
   
     @Id 

    
    @Column(name="code", nullable=false)
    public int getCode() {
        return this.code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }

    
    @Column(name="name", length=60)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="classname", length=60)
    public String getClassname() {
        return this.classname;
    }
    
    public void setClassname(String classname) {
        this.classname = classname;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="systemview")
    public Set<Userlog> getUserlogs() {
        return this.userlogs;
    }
    
    public void setUserlogs(Set<Userlog> userlogs) {
        this.userlogs = userlogs;
    }




}


