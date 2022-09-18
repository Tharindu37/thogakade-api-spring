package lk.ijse.pos.thogakadeapispring.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

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
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
