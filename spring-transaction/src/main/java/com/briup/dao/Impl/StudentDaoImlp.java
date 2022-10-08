package com.briup.dao.Impl;

import com.briup.bean.Student;
import com.briup.dao.StudentDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author zqq
 * @date 2022/10/7
 */
public class StudentDaoImlp implements StudentDao {
    private JdbcTemplate jdbcTemplate;
    @Override
    public Student selectStudent(int id) {
        String sql="select * from t_student where id=#{id}";
        Object[] args={id};
        Student student = jdbcTemplate.queryForObject(sql, args, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student student = new Student();
                student.setName(rs.getString("name"));
                student.setId(rs.getInt("id"));
                student.setPassword(rs.getString("password"));
                return student;
            }
        });
        return student;
    }

    @Override
    public void deleteById(int id) {

    }
}
