package spittr.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;
import spittr.Spittle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Slience
 * @version 1.0
 */
@Repository
public class JdbcSpittleRepository implements SpittleRepository {

    private JdbcOperations jdbc;

    @Autowired
    public JdbcSpittleRepository(JdbcOperations jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<Spittle> findSpittles(long maxId, int count) {
        return jdbc.query(
                "select id, message, created_at, latitude, longitude" +
                        " from Spittle" +
                        " where id < ?" +
                        " order by created_at desc limit 20",
                new SpittleRowMapper(), maxId);
    }

    private static class SpittleRowMapper implements RowMapper<Spittle>{

        @Override
        public Spittle mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Spittle(resultSet.getLong("id"),
                    resultSet.getString("message"),
                    resultSet.getDate("created_at"),
                    resultSet.getDouble("longitude"),
                    resultSet.getDouble("latitude"));
        }
    }
}
