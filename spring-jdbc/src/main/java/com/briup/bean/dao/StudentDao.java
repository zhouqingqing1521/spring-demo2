package com.briup.bean.dao;

import com.briup.bean.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author zqq
 * @date 2022/10/6
 */
@Repository
public class StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int findStudentCount(){
        return 0;
    }
    public Student findStudnetById(int id){
        String sql="select * from t_student where id=?";
        Object[] args={id};
        Student student = jdbcTemplate.queryForObject(sql, args, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setGender(rs.getString("gender"));
                return student;
            }
        });
        return student;
    }
    public List<Student> findAllStudent(){
        String sql="select * from t_student";
        List<Student> list = jdbcTemplate.query(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
               Student student=new Student();
               student.setId(rs.getInt("id"));
               student.setName(rs.getString("name"));
               student.setGender(rs.getString("gender"));
                return student;
            }
        });
        return list;
    }
    public void add(Student student){}

    public void insert(Student student) {
        String sql = "insert into t_student values(?,?,?)";
        Object[] args = {student.getId(),student.getName(),student.getGender()};
        jdbcTemplate.update(sql,args);
    }
    public void update(Student student) {
        String sql = "update t_student set name=?,age=? where id=?";
        Object[] args = {student.getId(),student.getName(),student.getGender()};
        jdbcTemplate.update(sql,args);
    }

}
