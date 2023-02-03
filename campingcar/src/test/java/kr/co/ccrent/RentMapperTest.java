package kr.co.ccrent;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import kr.co.ccrent.domain.RentVO;
import kr.co.ccrent.mapper.RentMapper;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class RentMapperTest {
	
	@Autowired
	private RentMapper rentMapper;
	
	@Test
	public void selectDateRedundancyTest() {
		HashMap<String, Object> varmap = new HashMap<>();
		varmap.put("car_regid", 1);
		varmap.put("rent_startdate", "2023-02-01");
		varmap.put("rent_enddate", "2023-02-10");
		RentVO rentVO = rentMapper.selectDateRedundancy(varmap);
		System.out.println(rentVO);
	}
}