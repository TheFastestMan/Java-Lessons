package edu.javacourse.studentorder.dao;

import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.exception.DaoException;

import java.util.List;

public interface StudentOrderDao  {
    List<StudentOrder> getStudentOrders() throws DaoException;

    Long saveStudentOrder (StudentOrder so)throws DaoException;
}
