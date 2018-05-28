package com.dc.rest.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
}
