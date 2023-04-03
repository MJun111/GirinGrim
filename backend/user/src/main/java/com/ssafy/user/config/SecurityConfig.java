// package com.ssafy.user.config;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
// import org.springframework.web.cors.CorsConfiguration;
//
// import lombok.RequiredArgsConstructor;
// import lombok.extern.slf4j.Slf4j;
//
// @Slf4j
// @RequiredArgsConstructor
// @Configuration
// public class SecurityConfig {
//
// 	@Autowired
// 	private CustomAuthorizationFilter customAuthorizationFilter;
//
// 	@Bean
// 	public WebSecurityCustomizer configure() {
// 		return (web) -> web.ignoring()
// 			.requestMatchers(
// 				"/favicon.ico",
// 				"/error",
// 				"/swagger-resources/**",
// 				"/swagger-ui/**",
// 				"/v3/api-docs",
// 				"/webjars/**"
// 			)
// 			.and()
// 			.ignoring()
// 			.requestMatchers(PathRequest.toStaticResources().atCommonLocations());    // 정적인 리소스들에 대해서 시큐리티 적용 무시.
// 	}
//
// 	@Bean
// 	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
// 		http.csrf().disable()
// 			.cors().and()
// 			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
// 			.and()
// 			.authorizeRequests()
// 			.requestMatchers("/api/members/user").permitAll()
// 			.requestMatchers("/api/members/image").permitAll()
// 			.anyRequest().authenticated()
// 			.and()
// 			.addFilterBefore(customAuthorizationFilter, UsernamePasswordAuthenticationFilter.class);
//
// 		// log.info("필터 적용 전");
// 		// 	http.addFilterBefore(new CustomAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
//
// 		return http.build();
// 	}
// }