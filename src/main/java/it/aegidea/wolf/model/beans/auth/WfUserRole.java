package it.aegidea.wolf.model.beans.auth;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users_roles")
public class WfUserRole {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @ManyToOne(cascade = CascadeType.ALL)
   private WfUser user;

   @ManyToOne(cascade = CascadeType.ALL)
   private WfRole role;

   private Date validFrom;
   private Date validTo;




   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public WfUser getUser() {
      return user;
   }

   public void setUser(WfUser user) {
      this.user = user;
   }

   public WfRole getRole() {
      return role;
   }

   public void setRole(WfRole role) {
      this.role = role;
   }

   public Date getValidFrom() {
      return validFrom;
   }

   public void setValidFrom(Date validFrom) {
      this.validFrom = validFrom;
   }

   public Date getValidTo() {
      return validTo;
   }

   public void setValidTo(Date validTo) {
      this.validTo = validTo;
   }
}
