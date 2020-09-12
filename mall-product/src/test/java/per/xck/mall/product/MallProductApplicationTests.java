package per.xck.mall.product;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import per.xck.mall.product.entity.BrandEntity;
import per.xck.mall.product.service.BrandService;

@SpringBootTest
class MallProductApplicationTests {

	@Autowired
	private BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("xck");
		brandService.save(brandEntity);
		System.out.println("保存成功");
	}

}
