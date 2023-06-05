package pe.edu.idat.dsw1L11;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Dias;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DiasRepository {
	private static final Map<String, Dias> dias = new HashMap<>();

	@PostConstruct
	public void initData() {
		Dias spain = new Dias();
		spain.setName("Spain");
		spain.setCapital("Madrid");
		spain.setCurrency(Currency.EUR);
		spain.setPopulation(46704314);

		dias.put(spain.getName(), spain);

		Dias lunes = new Dias();
		lunes.setName("");

		Dias poland = new Dias();
		poland.setName("Poland");
		poland.setCapital("Warsaw");
		poland.setCurrency(Currency.PLN);
		poland.setPopulation(38186860);

		dias.put(poland.getName(), poland);

		Dias uk = new Dias();
		uk.setName("United Kingdom");
		uk.setCapital("London");
		uk.setCurrency(Currency.GBP);
		uk.setPopulation(63705000);

		dias.put(uk.getName(), uk);

		Dias pe = new Dias();
		pe.setName("Peru");
		pe.setCapital("Lima");
		pe.setCurrency(Currency.PEN);
		pe.setPopulation(33000001);

		dias.put(pe.getName(), pe);

	}

	public Dias findDias(String name) {
		Assert.notNull(name, "The Dias's name must not be null");
		return dias.get(name);
	}
}