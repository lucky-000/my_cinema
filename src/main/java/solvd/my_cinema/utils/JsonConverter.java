package solvd.my_cinema.utils;

import java.io.IOException;
import org.apache.log4j.Logger;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import solvd.my_cinema.coll.Serials;




import java.nio.file.Paths;
public class JsonConverter {
	private final static Logger LOGGER = Logger.getLogger(JsonConverter.class);
	public void convertJavaToJsonFile(Object obj, String pathToFile) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(Paths.get(pathToFile).toFile(), obj);
			LOGGER.info("write to file, finished!");

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		public Serials convertJsonStrToAnimalPOJO(String valueFile) {

			Serials serial = null;
			try {
				ObjectMapper mapper = new ObjectMapper();
				serial  = mapper.readValue(valueFile, Serials.class);
				LOGGER.info("convert to POJO, finished!");

			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}

			return serial;
		}
	
	
}
