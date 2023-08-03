import java.sql.*;
import java.util.List;

public class AnimalDatabase {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/Human_friends";
    private static final String USER = "slobodei";
    private static final String PASSWORD = "1";

    private static final String CREATE_DOMESTIC_ANIMAL_TABLE =
            "CREATE TABLE IF NOT EXISTS DomesticAnimals (" +
            "id INT AUTO_INCREMENT PRIMARY KEY," +
            "name VARCHAR(100) NOT NULL," +
            "commands TEXT," +
            "birthDate DATE NOT NULL," +
            "owner VARCHAR(100) NOT NULL," +
            "type VARCHAR(100) NOT NULL," +
            "species VARCHAR(100) NOT NULL)";

    private static final String CREATE_DRAUGHT_ANIMAL_TABLE =
            "CREATE TABLE IF NOT EXISTS DraughtAnimals (" +
            "id INT AUTO_INCREMENT PRIMARY KEY," +
            "name VARCHAR(100) NOT NULL," +
            "commands TEXT," +
            "birthDate DATE NOT NULL," +
            "task VARCHAR(100) NOT NULL," +
            "type VARCHAR(100) NOT NULL," +
            "species VARCHAR(100) NOT NULL)";

    private Connection connection;

    public AnimalDatabase() {
        try {
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            createTables();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createTables() {
        try (Statement statement = connection.createStatement()) {
            statement.execute(CREATE_DOMESTIC_ANIMAL_TABLE);
            statement.execute(CREATE_DRAUGHT_ANIMAL_TABLE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveDomesticAnimals(List<DomesticAnimal> domesticAnimals) {
        String query = "INSERT INTO DomesticAnimals (name, commands, birthDate, owner, type, species) " +
                       "VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            for (DomesticAnimal animal : domesticAnimals) {
                preparedStatement.setString(1, animal.getName());
                preparedStatement.setString(2, String.join(";", animal.getCommands()));
                preparedStatement.setDate(3, Date.valueOf(animal.getBirthDate()));
                preparedStatement.setString(4, animal.getOwner());
                preparedStatement.setString(5, "Домашнее");
                preparedStatement.setString(6, animal. getSpecies());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveDraughtAnimals(List<DraughtAnimal> draughtAnimals) {
        String query = "INSERT INTO DraughtAnimals (name, commands, birthDate, task, type, species) " +
                       "VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            for (DraughtAnimal animal : draughtAnimals) {
                preparedStatement.setString(1, animal.getName());
                preparedStatement.setString(2, String.join(";", animal.getCommands()));
                preparedStatement.setDate(3, Date.valueOf(animal.getBirthDate()));
                preparedStatement.setString(4, animal.getTask());
                preparedStatement.setString(5, "Вьючное");
                preparedStatement.setString(6, animal.getSpecies());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
