package mapper;

import java.io.InputStream;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import model.Team;
public class JsonMapper {
	
	
	public <T> T map(String fileName, Class<T> classOfT) 
	{
		Gson gson = new Gson();
//		T team = (T) gson.fromJson(new FileReader(inputStreamReader), class1);
//		return (T) team;
		InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
		System.out.println("is equal to *****"+is);
		//return gson.fromJson(new InputStreamReader(is), classOfT);
		T team = (T) gson.fromJson(new InputStreamReader(is), classOfT);
		return team;
	}
}
