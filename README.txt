Spring-day5-纯xml整合版本一+版本三注解和xml组合

步骤：
整合步骤：严格按照此步骤进行
	第一步：保证Spring的IOC容器能在web工程中独立运行
	第二步：保证hibernate框架能在web工程中独立运行
	第三步：整合Spring和hibernate
			如何才算是整合了？
		Spring接管了hibernate的SessionFactory对象创建（把SessionFactory存入Spring容器中，即bean.xml中配置sessionFactory）
		使用了Spring的声明式声明式事务（AOP配置事务控制）
	第四步：保证Struts2框架在web工程中独立运行
	第五步：整合Spring和Struts2
			如何才算整合在一起：
				Action的创建交给Spring来管理（监听器，bean.xml改名移动）
				保证web工程中的容器只有一个（导入jar）
	第六步：优化已有的整合配置
			配置文件的位置存放可以调整
			配置文件的内容可以分不同的文件来编写
