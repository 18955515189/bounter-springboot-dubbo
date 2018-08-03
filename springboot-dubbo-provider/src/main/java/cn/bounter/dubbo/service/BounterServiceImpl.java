package cn.bounter.dubbo.service;


import java.util.Date;
import com.alibaba.dubbo.config.annotation.Service;
import cn.bounter.dubbo.model.Bounter;


//声明为Dubbo服务
@Service
public class BounterServiceImpl implements BounterService {

	@Override
	public Bounter findById(long id) {
		//模拟访问数据库
		return new Bounter().setId(1L).setName("simon").setCreateTime(new Date()).setCreateBy(1L);
	}

}
