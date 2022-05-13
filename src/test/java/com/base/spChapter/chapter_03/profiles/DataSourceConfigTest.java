package com.base.spChapter.chapter_03.profiles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Slience
 * @version 1.0
 */

public class DataSourceConfigTest {

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes=com.base.spChapter.chapter_03.profiles.myapp.DataSourceColnfig.class)
    @ActiveProfiles("dev")
    public static class DevDataSourceTest{

        @Autowired
        private DataSource dataSource;
        @Test
        public void shouldBeEmbeddedDatasource(){
            assertNotNull(dataSource);
            JdbcTemplate jdbc = new JdbcTemplate(dataSource);
            List<String> results = jdbc.query("select id, name from Things", new RowMapper<String>() {
                @Override
                public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                    return rs.getLong("id") + ":" + rs.getString("name");
                }
            });
            System.out.println(results);
        }
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes=com.base.spChapter.chapter_03.profiles.myapp.DataSourceColnfig.class)
    @ActiveProfiles("prod")
    public static class ProductionDataSourceTest {
        @Autowired
        private DataSource dataSource;

        @Test
        public void shouldBeEmbeddedDatasource() {
            //数据源未进行配置
            assertNull(dataSource);
        }
    }


    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:MATE-INF/chapter_03/profiles/dataSourceConfig.xml")
    @ActiveProfiles("dev")
    public static class DevDataSourceTest_XMLConfig{

        @Autowired
        private DataSource dataSource;
        @Test
        public void shouldBeEmbeddedDatasource(){
            assertNotNull(dataSource);
            JdbcTemplate jdbc = new JdbcTemplate(dataSource);
            List<String> results = jdbc.query("select id, name from Things", new RowMapper<String>() {
                @Override
                public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                    return rs.getLong("id") + ":" + rs.getString("name");
                }
            });
            System.out.println(results);
        }
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:MATE-INF/chapter_03/profiles/dataSourceConfig.xml")
    @ActiveProfiles("prod")
    public static class ProductionDataSourceTest_XMLConfig{
        @Autowired(required=false)
        private DataSource dataSource;
        @Test
        public void shouldBeEmbeddedDatasource() {
            assertNull(dataSource);
        }
    }

}
