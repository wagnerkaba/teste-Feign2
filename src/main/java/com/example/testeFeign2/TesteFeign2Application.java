package com.example.testeFeign2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//************************************************************
//		PROJETO PARA TESTAR O SPRING CLOUD OPEN FEIGN
//		https://spring.io/projects/spring-cloud-openfeign
//
//		INSTRUÇÕES:
//
//   	Execute o projeto testeFeign1.
//   	Ele está configurado para funcionar na porta 8080
// 		Execute este projeto, que está configurado para
// 		funcionar na porta 3000
//		Ao entrar no endereço http://localhost:3000/agenda
//		o testeFeign2 irá consumir os dados fornecidos pelo
//		testeFeign1
//************************************************************


@SpringBootApplication
@EnableFeignClients
public class TesteFeign2Application {

	public static void main(String[] args) {
		SpringApplication.run(TesteFeign2Application.class, args);
	}

}
