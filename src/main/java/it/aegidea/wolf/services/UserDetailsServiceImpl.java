package it.aegidea.wolf.services;

import it.aegidea.wolf.model.beans.auth.WfRole;
import it.aegidea.wolf.model.beans.auth.WfUser;
import it.aegidea.wolf.model.beans.auth.WfUserRole;
import it.aegidea.wolf.model.repos.UserRepository;
import it.aegidea.wolf.utils.StreamUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

   @Resource
   private UserRepository userRepository;

   @Override
   @Transactional(readOnly = true)
   public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      WfUser user = userRepository.findByUsername(username);

      Set<GrantedAuthority> grants = new HashSet<>();
      for (WfRole r : StreamUtils.mapAll(user.getRoles(), WfUserRole::getRole)) {
         grants.add(new SimpleGrantedAuthority(r.getName()));
      }

      return new User(user.getUsername(), user.getPassword(), grants);
   }
}
