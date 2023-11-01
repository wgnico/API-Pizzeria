package com.platzi.pizza.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
public class CorsConfig {
/**
 *  Cors: Metodo para poder filtrar el ingreso a nuestro aplicativo desde otro origen
 *
 *
 * */


    @Bean
    CorsConfigurationSource corsConfigurationSource(){
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        /**Setea los origenes permitidos para las consultas*/
        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
        /**Setea Los Metodos permitidos para nuestras consultas desde otro origen*/
        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST","PUT","DELETE"));
        /**Setea las cabezeras permitidas para nuestro origen
         *
         * por ej:
         *          "http://localhost:8080/api/pizzas/all"
         *      donde el origen sea distinto al de nuestro aplicativo
         *
         * */
        corsConfiguration.setAllowedHeaders(Arrays.asList("*"));


        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);

        return source;
    }
}
