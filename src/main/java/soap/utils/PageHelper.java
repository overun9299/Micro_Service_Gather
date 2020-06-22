/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PageHelper
 * Author:   aluohe
 * Date:     2019/7/5 17:19
 * Description: 分页查询工具
 * History:
 * <author>          <time>          <version>          <desc>
 * aluohe       2019/7/5 17:19       版本号              描述
 */
package soap.utils;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 〈一句话功能简述〉<br>
 * 〈分页查询工具〉
 *
 * @author aluohe
 * @create 2019/7/5 17:19
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public class PageHelper {

    /**
     * 分页偏移量
     */
    private Integer page = 1;

    /**
     * 分页查询数量
     */
    private Integer limit = 10;
}
