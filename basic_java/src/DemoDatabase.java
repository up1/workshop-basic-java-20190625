import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoDatabase {

	public void getDatabase() {
		String sql = "SELECT * from TABLE";
		//try-with-resource
		try (Connection connection = DriverManager.getConnection("");
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();) {

			while (resultSet.next()) {
				// TODO
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
