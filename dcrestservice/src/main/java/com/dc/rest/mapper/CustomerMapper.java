package com.dc.rest.mapper;


import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.dc.rest.model.CustomerDnr;
import com.dc.rest.model.Customer;


/* examples 
 *   http://elizabetht.github.io/blog/2013/11/21/student-enrollment-using-mybatis-with-spring/
 */

/**
 * Customer Data Access Object.
 * @author Vimal Patel
 */

@Mapper
public interface CustomerMapper {	
	public void insert(Customer customer);
    /* Query defn in CustomerMapper.xml file */
    public Customer findByCustomerId(int custId);
    
    @Select("SELECT  Name_First as firstName FROM Customer WHERE CUST_ID = #{cid}")
    public String findCustomerName(@Param("cid") int custId);
    
	public Customer getCustomerByKey(int customer_id) throws SQLException;

    public List<Customer> getCustomerByName(String lastName, String firstName, String sId) throws SQLException;

    public int addNewCustomer(Customer customer) throws SQLException;
    
    public int updateCustomer(Customer customer) throws SQLException;    
    
    public Customer getCustomerbyRentalInfoId(int rentalInfoId);

    @Update("Update Customer set DNR=#{dnrFlag} where CUST_ID= #{customerId}")
    public int updateCustomerDnrFlag(@Param("customerId") Integer customerId,@Param("dnrFlag") boolean dnrFlag);    

    public int addDnr(CustomerDnr customerDnr);
     
    @Delete("DELETE FROM customer_dnr WHERE keyid = #{dnrId}")
    public int deleteDnr(@Param("dnrId") Integer dnrId);
    
    public List<CustomerDnr> getCustomerDnrByCustomerId(Integer customerId);
    
    
    
}
