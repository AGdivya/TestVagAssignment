package mapper;

import java.io.InputStream;
import java.io.InputStreamReader;
import com.google.gson.Gson;

public class JsonMapper {

	public <T> T map(String fileName, Class<T> classOfT) {
		Gson gson = new Gson();
		InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
		T team = (T) gson.fromJson(new InputStreamReader(is), classOfT);
		return team;
	}
}
