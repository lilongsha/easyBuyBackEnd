package com.easybuy;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import org.junit.jupiter.api.Test;

public class TestApplication extends BaseGeneratorTest{
    /**
     * 数据源配置
     */
    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:mysql://localhost:3306/test-mybatis?serverTimezone=Asia/Shanghai", "root", "123456")
            .schema("test-mybatis")
            .build();

    @Test
    public void testSimple() {
        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);
        generator.strategy(strategyConfig().build());
        generator.global(globalConfig().build());
        generator.packageInfo(packageConfig().build());
        generator.execute();
    }
}
