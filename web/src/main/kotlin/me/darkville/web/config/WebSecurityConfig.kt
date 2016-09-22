package me.darkville.web.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

/**
 * The configuration for the security.
 * For now this is using a fixed set of accounts/passwords.
 */
@Configuration
open class WebSecurityConfig : WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity) {
        http.authorizeRequests()
                .antMatchers("/games/**").authenticated()
                .and().formLogin().loginPage("/login")
    }

    @Autowired
    fun configureGlobal(auth: AuthenticationManagerBuilder) {
        auth.inMemoryAuthentication().withUser("wolfje1").password("wachtwoord1").roles()
        auth.inMemoryAuthentication().withUser("wolfje2").password("wachtwoord2").roles()
        auth.inMemoryAuthentication().withUser("wolfje3").password("wachtwoord3").roles()
    }
}
