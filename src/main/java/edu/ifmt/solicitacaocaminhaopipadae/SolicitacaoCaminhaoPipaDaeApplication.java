package edu.ifmt.solicitacaocaminhaopipadae;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
public class SolicitacaoCaminhaoPipaDaeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolicitacaoCaminhaoPipaDaeApplication.class, args);
	}
	
	public LocaleResolver localeResolver() {
		return new FixedLocaleResolver(new Locale("pt", "BR"));	
	}
	
}
