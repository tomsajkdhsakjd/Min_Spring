package context.support;
import java.util.List;

import annotation.Component;
import beans.config.BeanDefinition;
import beans.factory.DefaultListableBeanFactory;
import untils.PackageUtil;

public abstract class AutowiredApplication {
	protected void CreatebeanbyAutowired(DefaultListableBeanFactory beanFactory) throws ClassNotFoundException{
		List<String> list = beanFactory.getAutowiredlist();
	
		if(list!=null) {
			
			for (String string : list) {
				List<String> list2 = PackageUtil.getallclassname(string);
				
			for (String string2 : list2) {
				Class<?> forName = Class.forName(string2);
			if(forName.isAnnotationPresent(Component.class))
			{
				
				BeanDefinition definition = new BeanDefinition();
				definition.setClasspath(string2);
				definition.setScope("singleton");
				definition.setId(forName.getSimpleName());
			beanFactory.getBeanDefinitionMap().put(forName.getSimpleName(),definition);
			
				
			}

			}
			
		
			}
			System.out.println(beanFactory.getBeanDefinitionMap().toString());
		}
		
		
		
	};

	
}
