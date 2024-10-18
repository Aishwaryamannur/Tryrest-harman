package websecurity;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.csrf().authorizeRequests().antMatchers().authenticated().and().httpBasic();
    }





}
