package com.ume.app;

import com.dora.tool.gen.db.TableExcelGenerator;
 
/**
 * 读取并解析指定的输入目录下的所有数据库设计文档，生成如下的源码：<br>
 * <li> Java文件: Entity DTO (对应数据库各个表的JavaBean定义)
 * <li> XML文件: SQL Mcom.umeing (对应数据库各个的MyBatis映射文件)
 * <li> DDL: SQL脚本 (对应数据库各个的SQL DDL脚本)
 * 
 * @author Yue MA
 *
 */
public class RunTableGenerator {
	/**
	 * 主函数.<br>
	 * 允许方法：Eclipse中右键点击该类，选择[Run As] - [Java Application]选项执行.<br>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String path = "input/design-table";
			
			new TableExcelGenerator().execute(path);
			
			// new TableExcelParser().execute(path, new EntityGenerator(DatabaseType.H2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
