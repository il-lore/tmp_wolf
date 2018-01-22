package it.aegidea.wolf.model.beans.auth;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class WfRole {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   private String name;

   @OneToMany(mappedBy = "role")
   private Set<WfUserRole> users;




   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Set<WfUserRole> getUsers() {
      return new HashSet<>(users);
   }

   public void setUsers(Set<WfUserRole> users) {
      this.users = new HashSet<>(users);
   }
}
