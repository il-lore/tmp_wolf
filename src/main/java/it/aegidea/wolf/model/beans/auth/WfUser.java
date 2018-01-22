package it.aegidea.wolf.model.beans.auth;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class WfUser {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   private String username;
   private String password;
   private String passwordConfirmation;

   @OneToMany(mappedBy = "user")
   private Set<WfUserRole> roles;




   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getPasswordConfirmation() {
      return passwordConfirmation;
   }

   public void setPasswordConfirmation(String passwordConfirmation) {
      this.passwordConfirmation = passwordConfirmation;
   }

   public Set<WfUserRole> getRoles() {
      return new HashSet<>(roles);
   }

   public void setRoles(Set<WfUserRole> roles) {
      this.roles = new HashSet<>(roles);
   }
}
