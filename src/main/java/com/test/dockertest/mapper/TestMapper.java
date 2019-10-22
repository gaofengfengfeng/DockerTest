package com.test.dockertest.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ${description}
 *
 * @author gaofeng
 * @version 1.0
 * @date 2019-10-22
 */
@Mapper
public interface TestMapper {

    Integer insert(@Param("test") Tester test);
}
