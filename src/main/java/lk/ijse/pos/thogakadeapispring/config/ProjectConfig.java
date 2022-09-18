//package lk.ijse.pos.thogakadeapispring.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//public class ProjectConfig {
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        InMemoryUserDetailsManager uds=new InMemoryUserDetailsManager();
//        UserDetails user= User.withUsername("Tharindu").
//                password("1234").
//                authorities("read").
//                build();
//        uds.createUser(user);
//        return uds;
//    }
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
//}
