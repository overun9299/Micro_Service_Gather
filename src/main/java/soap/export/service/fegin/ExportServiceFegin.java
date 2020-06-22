package soap.export.service.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import soap.export.dto.PersonDto;

/**
 * Created by ZhangPY on 2020/6/23
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
@FeignClient("micro-service-export")
public interface ExportServiceFegin {

    /**
     * 导出人员相关
     * @param personDto
     * @return
     */
    @RequestMapping(value = "ms/export/person/getPersonListForExport" , method = RequestMethod.POST , consumes = "application/json")
    String getPersonListForExport(@RequestBody PersonDto personDto);
}
