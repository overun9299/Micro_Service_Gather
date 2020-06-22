package soap.export.dto;

import lombok.Data;
import soap.utils.PageHelper;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author ZhangPY
 * @since 2020-06-07
 */
@Data
public class PersonDto extends PageHelper implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 性别 */
    private Integer sex;

    /** 部门id */
    private Long dId;




}
