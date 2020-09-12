package per.xck.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、导入依赖
 *		   <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.3.1</version>
 *         </dependency>
 * 2、配置
 * 	2.1、配置数据源
 * 	2.2、配置mybatis-plus
 * 		2.2.1、使用@MapperScan扫描dao
 * 		2.2.2、告诉Mybatis-plus sql映射文件的位置
 */
@SpringBootApplication
@MapperScan(basePackages = {"per.xck.mall.product.dao"})
public class MallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallProductApplication.class, args);
	}

}
