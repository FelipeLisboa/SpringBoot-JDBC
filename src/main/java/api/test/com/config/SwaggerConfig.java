package api.test.com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Clase que activa la documentacion swagger jvasquez
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/**
	 * Constructor por defecto.
	 */
	public SwaggerConfig() {
		super();
	}

	/**
	 * Bean que se generar para documetar la api.
	 *
	 * @return documentador.
	 */
	@Bean
	public Docket productApi() {
		// Tipo de documentacion
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("api.test.com.controller")).build()
				.useDefaultResponseMessages(false);
	}

}