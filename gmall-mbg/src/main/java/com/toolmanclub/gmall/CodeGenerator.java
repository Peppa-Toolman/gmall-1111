package com.toolmanclub.gmall;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Arrays;

/**
 * @author Yujie Wang
 * @date 2020/9/4 23:34
 */
public class CodeGenerator {
    public static void main(String[] args) {
        // execute();
    }

    public static void execute() {

        String moduleName = "ums";
        // 1、创建代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 2、全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir("H:\\Study\\java\\Project\\gmall\\gmall-mbg" + "/src/main/java");
        gc.setAuthor("Yujie Wang");
        gc.setOpen(false); //生成后是否打开资源管理器
        gc.setFileOverride(false); //重新生成时文件是否覆盖
        gc.setServiceName("%sService");    //去掉Service接口的首字母I
        gc.setIdType(IdType.ASSIGN_ID); //主键策略
        gc.setDateType(DateType.ONLY_DATE);//定义生成的实体类中日期类型
        gc.setSwagger2(true);//开启Swagger2模式
        gc.setBaseColumnList(true);

        mpg.setGlobalConfig(gc);

        // 3、数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://81.68.76.155:3306/gmall_" + moduleName
            + "?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT%2B8&useLegacyDatetimeCode=false");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("3306");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 4、包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(moduleName); //模块名
        pc.setParent("com.toolmanclub.gmall");
        pc.setController("controller");
        pc.setEntity("entity");
        pc.setService("service");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);

        // 5、策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy
            .setInclude("ums_admin", "ums_admin_login_log", "ums_admin_permission_relation", "ums_admin_role_relation",
                "ums_growth_change_history", "ums_integration_change_history", "ums_integration_consume_setting",
                "ums_member", "ums_member_level", "ums_member_login_log", "ums_member_member_tag_relation",
                "ums_member_product_category_relation", "ums_member_receive_address", "ums_member_rule_setting",
                "ums_member_statistics_info", "ums_member_tag", "ums_member_task", "ums_permission", "ums_role",
                "ums_role_permission_relation");
        strategy.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名策略
        strategy.setTablePrefix(moduleName + "_"); //生成实体时去掉表前缀
        strategy.setEntityTableFieldAnnotationEnable(true);

        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//数据库表字段映射到实体的命名策略
        strategy.setEntityLombokModel(true); // lombok 模型 @Accessors(chain = true) setter链式操作

        strategy.setRestControllerStyle(true); //restful api风格控制器
        strategy.setControllerMappingHyphenStyle(true); //url中驼峰转连字符

        strategy.setLogicDeleteFieldName("is_deleted");// 逻辑删除

        // 自动填充
        TableFill gmt_create = new TableFill("gmt_create", FieldFill.INSERT);
        TableFill gmt_modified = new TableFill("gmt_modified", FieldFill.INSERT_UPDATE);
        strategy.setTableFillList(Arrays.asList(gmt_create, gmt_modified));

        //乐观锁
        strategy.setVersionFieldName("version");
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 6、执行
        mpg.execute();
    }
}
